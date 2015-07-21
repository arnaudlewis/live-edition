## Starter project for Play with Scala

This is a blank [Play framework](http://www.playframework.com) project that will connect to any [prismic.io](https://prismic.io) repository, and trivially list its documents. It uses the prismic.io Scala development kit, and provides a few helpers to integrate with the Play framework.

### Getting started

#### Launch the starter project

Fork this repository, then clone your fork, and run your play application using either the `play run` or the `sbt run` command. Then, open your browser at http://localhost:9000/

Your Play starter project is now up and running! However, by default, it will list and display documents from our "[Les Bonnes Choses](http://lesbonneschoses.prismic.me)" example repository.

#### Configure the starter project

Edit the `conf/application.conf` file to make the application point to the correct repository:

```
# Prismic.io
# ~~~~~

# API endpoint
prismic.api="https://lesbonneschoses.prismic.io/api"

# If specified this token is used for all "guest" requests
# prismic.token="xxx"

# OAuth2 configuration
# prismic.clientId="xxxxxx"
# prismic.clientSecret="xxxxxx"
```

To set up the OAuth configuration and interactive signin, go to the _Applications_ panel in your repository's settings, and create a new OAuth application. You simply have to fill in an application name and potentially the callback URL (`localhost` URLs are always authorized, so at development time you can omit to fill in the Callback URL field). After submitting, copy/paste the `clientId` & `clientSecret` tokens into the proper place in your configuration.

#### Get started with prismic.io

You can find out [how to get started with prismic.io](https://developers.prismic.io/documentation/UjBaQsuvzdIHvE4D/getting-started) on our [prismic.io developer's portal](https://developers.prismic.io/).

#### Understand the Play with Scala development kit

You'll find more information about how to use the development kit included in this starter project, by reading [its README file](https://github.com/prismicio/scala-kit/blob/master/README.md).

### Contribute to the starter project

Contribution is open to all developer levels, read our "[Contribute to the official kits](https://developers.prismic.io/documentation/UszOeAEAANUlwFpp/contribute-to-the-official-kits)" documentation to learn more.

### Licence

This software is licensed under the Apache 2 license, quoted below.

Copyright 2013 Zengularity (http://www.zengularity.com).

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.


Document Mask for page type "slicepage" : 

{
  "Content" : {
    "body" : {
      "fieldset" : "Dynamic page zone...",
      "type" : "Slices",
      "config" : {
        "labels" : {
          "featured_items" : [ {
            "name" : "col-2",
            "display" : "2 items per line"
          }, {
            "name" : "col-3",
            "display" : "3 items per line"
          } ],
          "slides" : [ {
            "name" : "small",
            "display" : "Small"
          }, {
            "name" : "medium",
            "display" : "Medium"
          } ],
          "illustration" : [ {
            "display" : "content width",
            "name" : "content-width"
          } ],
          "section_header" : [ {
            "display" : "Centered",
            "name" : "section-header-centered"
          } ],
          "separator" : [ {
            "name" : "small",
            "display" : "Small"
          }, {
            "name" : "medium",
            "display" : "Medium"
          } ]
        },
        "choices" : {
          "alternated_highlights" : {
            "type" : "Group",
            "fieldset" : "Alternated highlights",
            "config" : {
              "fields" : {
                "thumbnail" : {
                  "type" : "Image",
                  "config" : {
                    "placeholder" : "Thumbnail",
                    "thumbnails" : [ {
                      "name" : "Icon",
                      "width" : 300,
                      "height" : 300
                    } ]
                  }
                },
                "title" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Item title...",
                    "single" : "heading3"
                  }
                },
                "summary" : {
                  "type" : "StructuredText",
                  "fieldset" : "Short Summary",
                  "config" : {
                    "placeholder" : "Item summary...",
                    "single" : "paragraph"
                  }
                },
                "illustration" : {
                  "type" : "Image",
                  "config" : {
                    "constraint" : {
                      "width" : 1400
                    }
                  }
                }
              }
            }
          },
          "centered_highlight" : {
            "type" : "Group",
            "fieldset" : "Centered highlight",
            "config" : {
              "repeat" : false,
              "fields" : {
                "thumbnail" : {
                  "type" : "Image",
                  "config" : {
                    "placeholder" : "Thumbnail",
                    "thumbnails" : [ {
                      "name" : "Icon",
                      "width" : 300,
                      "height" : 300
                    } ]
                  }
                },
                "title" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Item title...",
                    "single" : "heading3"
                  }
                },
                "summary" : {
                  "type" : "StructuredText",
                  "fieldset" : "Short Summary",
                  "config" : {
                    "placeholder" : "Item summary...",
                    "single" : "paragraph"
                  }
                },
                "illustration" : {
                  "type" : "Image",
                  "config" : {
                    "constraint" : {
                      "width" : 1800
                    }
                  }
                }
              }
            }
          },
          "featured_items" : {
            "type" : "Group",
            "fieldset" : "Featured items",
            "config" : {
              "fields" : {
                "illustration" : {
                  "type" : "Image",
                  "config" : {
                    "thumbnails" : [ {
                      "name" : "Icon",
                      "width" : 300,
                      "height" : 300
                    } ]
                  }
                },
                "title" : {
                  "type" : "StructuredText",
                  "config" : {
                    "single" : "heading3",
                    "placeholder" : "Item title..."
                  }
                },
                "summary" : {
                  "type" : "StructuredText",
                  "fieldset" : "Short Summary",
                  "config" : {
                    "placeholder" : "Item summary...",
                    "single" : "paragraph"
                  }
                },
                "read_more" : {
                  "type" : "Link",
                  "config" : {
                    "placeholder" : "Button link..."
                  }
                },
                "read_more_label" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Link label...",
                    "single" : "paragraph"
                  }
                }
              }
            }
          },
          "slides" : {
            "type" : "Group",
            "fieldset" : "Slides",
            "config" : {
              "fields" : {
                "illustration" : {
                  "type" : "Image"
                },
                "title" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Slide title...",
                    "multi" : "heading1,heading2"
                  }
                },
                "summary" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Short Summary..."
                  }
                },
                "read_more" : {
                  "type" : "Link",
                  "config" : {
                    "placeholder" : "Button link"
                  }
                },
                "read_more_label" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Button label...",
                    "single" : "paragraph"
                  }
                }
              }
            }
          },
          "section_header" : {
            "type" : "Group",
            "fieldset" : "Section Header",
            "config" : {
              "repeat" : false,
              "fields" : {
                "title" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Section name...",
                    "single" : "heading2"
                  }
                },
                "summary" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Section summary...",
                    "single" : "paragraph"
                  }
                }
              }
            }
          },
          "illustration" : {
            "type" : "Image",
            "fieldset" : "Illustration"
          },
          "collapsed_items" : {
            "type" : "Group",
            "fieldset" : "Collapsed Items",
            "config" : {
              "fields" : {
                "title" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Section name...",
                    "single" : "paragraph"
                  }
                },
                "summary" : {
                  "type" : "StructuredText",
                  "config" : {
                    "placeholder" : "Section summary...",
                    "single" : "paragraph"
                  }
                }
              }
            }
          },
          "separator" : {
            "type" : "Group",
            "fieldset" : "Separator",
            "config" : {
              "repeat" : false,
              "fields" : {
                "sep" : {
                  "type" : "Separator"
                }
              }
            }
          }
        }
      }
    }
  },
  "Metadata" : {
    "uid" : {
      "type" : "UID",
      "config" : {
        "placeholder" : "unique-identifier-for-page-url"
      }
    },
    "title" : {
      "type" : "StructuredText",
      "config" : {
        "single" : "heading1",
        "placeholder" : "Page meta title"
      }
    },
    "children" : {
      "fieldset" : "Child pages (used for the menu and URL hierarchy",
      "type" : "Group",
      "config" : {
        "fields" : {
          "label" : {
            "type" : "Text",
            "config" : {
              "placeholder" : "Link label"
            }
          },
          "link" : {
            "type" : "Link",
            "config" : {
              "select" : "document",
              "masks" : [ "page", "bloghome" ]
            }
          }
        }
      }
    }
  }
}