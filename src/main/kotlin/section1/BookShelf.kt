package section1

import java.lang.IllegalArgumentException
import java.util.*

class BookShelf: Aggregate<Book?>{

    private var last = 0
    private val books = Vector<Book?>()
//    private val books: Array<Book?>

//    constructor(maxsize: Int){
//        books = arrayOfNulls<Book>(maxsize)
//    }

    fun getBookAt(index: Int): Book?{
        if (books.size <= index){
            throw IllegalArgumentException()
        }
        return books[index]
    }

    fun appendBook(book: Book){
//        if (books[books.size-1] != null){
//            throw IllegalStateException()
//        }
//        books[last] = book
        books.addElement(book)
        last++
    }

    fun getLength(): Int{
        return last
    }

    override fun iterator(): Iterator<Book?> {
        return BookShelfIterator(this)
    }


}