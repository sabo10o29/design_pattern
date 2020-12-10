package section8.listfactory

import section8.factory.Link

class ListLink: Link {

    constructor(caption: String, url: String): super(caption, url)

    override fun makeHTML(): String {
        return " <li><a href=\"$url\">$caption</a></li>\n"
    }
}