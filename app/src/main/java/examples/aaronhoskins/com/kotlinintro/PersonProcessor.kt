package examples.aaronhoskins.com.kotlinintro

class PersonProcessor(val firstName : String , val lastName : String) {

    fun mixTheLettersUp() : String {
        when(firstName) {
            "aaron" -> println("MY NAME")
            "toby" -> println("NICKNAME")
            else -> println("NOTHING TO DO WITH ME")
        }
        return firstName
    }

}