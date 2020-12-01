package section1

class BookShelfIterator(val bookShelf: BookShelf): Iterator<Book?> {

    private var index = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Book? {
        val book = bookShelf.getBookAt(index)
        index++
        return book
    }

}

