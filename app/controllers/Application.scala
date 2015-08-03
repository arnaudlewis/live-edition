package controllers

import play.api.mvc._

import scala.concurrent._
import play.api.libs.concurrent.Execution.Implicits._

import io.prismic._
import io.prismic.fragments._

object Application extends Controller with PrismicController {

  import PrismicHelper._

  // -- Resolve links to documents
  def linkResolver(api: Api)(implicit request: RequestHeader) = DocumentLinkResolver(api) {
    case (docLink, maybeBookmarked) if !docLink.isBroken => routes.Application.slicepage(docLink.uid.getOrElse("#")).absoluteURL()
    case _ => routes.Application.brokenLink().absoluteURL()
  }

  // -- Page not found
  def PageNotFound(implicit ctx: PrismicHelper.Context) = NotFound(views.html.pageNotFound())

  def brokenLink = PrismicAction { implicit request =>
    Future.successful(PageNotFound)
  }

   // -- Slicepage
  def slicepage(uid: String) = PrismicAction { implicit request =>

    val futureSkin =   getBookmarkedDocument("skin")
    val futurePage = getDocumentByUid("slicepage", uid) 
    for (
      page <- futurePage;
      currentUid = page.map(_.uid);
      skin <- futureSkin
      ) yield (
        if(currentUid.flatten.getOrElse("#") != uid)
          Results.Redirect(routes.Application.slicepage(uid)) 
        else
          Ok(views.html.slicepage(page.get, skin))
      )
    }
  }