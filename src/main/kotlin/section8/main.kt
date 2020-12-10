package section8

import section8.factory.Factory


fun main(){
    val className = ""
    val factory = Factory.getFactory(className)

    val asahi = factory.createLink("Asahi", "http://www.asahi.com")
    val yomiuri = factory.createLink("Yomiuri", "http://www.yomiuri.com")

    val us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com")
    val jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp")

    val excite = factory.createLink("Excite", "http://www.excite.com")
    val google = factory.createLink("Google", "http://www.excite.com")

    val traynews = factory.createTray("News paper")
    traynews.add(asahi)
    traynews.add(yomiuri)

    val trayyahoo = factory.createTray("Yahoo!")
    trayyahoo.add(us_yahoo)
    trayyahoo.add(jp_yahoo)

    val traysearch = factory.createTray("Search engine")
    traysearch.add(trayyahoo)
    traysearch.add(excite)
    traysearch.add(google)

    val page = factory.createPage("LinkPage", "Murase")
    page.add(traynews)
    page.add(traysearch)
    page.output()



}
