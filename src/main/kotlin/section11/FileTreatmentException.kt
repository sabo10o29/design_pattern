package section11

import java.lang.RuntimeException

class FileTreatmentException : RuntimeException {

    constructor(msg: String): super(msg)
    constructor():super()

}
