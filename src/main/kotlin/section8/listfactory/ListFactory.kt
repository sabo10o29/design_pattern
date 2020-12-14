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
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }

    override fun createYahooPage(): Page {
        val linkyahoo = createLink("Yahoo!", "http://www.yahoo.com")
        val page = createPage("LinkPage", "Murase")
        page.add(linkyahoo)
        return page
    }


}