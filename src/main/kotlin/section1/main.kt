package section1

fun main() {

    val bookShelf = BookShelf(4)
    bookShelf.appendBook(Book("A"))
    bookShelf.appendBook(Book("B"))
    bookShelf.appendBook(Book("C"))
    bookShelf.appendBook(Book("D"))
    val iterator = bookShelf.iterator()
    while(iterator.hasNext()){
        val book = iterator.next()
        println(book?.name)
    }

}