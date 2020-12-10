package section8.factory

abstract class Link: Item {

    protected var url: String

    constructor(caption: String, url: String): super(caption){
        this.url = url
    }



}