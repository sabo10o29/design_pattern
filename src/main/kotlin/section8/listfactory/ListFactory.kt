package section8.listfactory

import section8.factory.Factory
import section8.factory.Link
import section8.factory.Page
import section8.factory.Tray

class ListFactory: Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        TODO("Not yet implemented")
    }

    override fun createPage(title: String, author: String): Page {
        TODO("Not yet implemented")
    }


}