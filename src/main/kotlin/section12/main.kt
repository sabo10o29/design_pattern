package section12

fun main(){

    val b1 = StringDisplay("Hello, world.")
    val b2 = UpDownBorder(b1, '-')
    val b3 = SideBorder(b2, '*')
    b1.show()
    b2.show()
    b3.show()
    val b4 = FullBorder(
                        UpDownBorder(
                                SideBorder(
                                        UpDownBorder(
                                                SideBorder(
                                                        StringDisplay("Good morning!!!"),
                                                        '*'
                                                ),
                                                '='
                                        ),
                                        '|'
                                ),
                                '/'
                        )
                )
    b4.show()

    val md = MultiStringDisplay()
    md.add("Good morning")
    md.add("Good afternoon")
    md.add("Good night. See you tomorrow")
    md.show()

    val d1 = SideBorder(md, '#')
    d1.show()

    val d2 = FullBorder(md)
    d2.show()

}