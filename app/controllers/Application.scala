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
    case (docLink, maybeBookmarked) if !docLink.isBroken => routes.Application.slicepage(docLink.uid.get).absoluteURL()
  }

   // -- Slicepage
   def slicepage(uid: String) = PrismicAction { implicit request =>

    val futureSkin =   getDocumentsByType("skin");
    val futurePage = getDocumentByUid("slicepage", uid) 
    for (
      page <- futurePage;
      skin <- futureSkin
      ) yield (
        Ok(views.html.slicepage(page, skin.headOption))
      )
    } 
  } 