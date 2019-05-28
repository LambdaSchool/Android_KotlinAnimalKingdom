abstract class Animal(val id: Int, val name: String, val yearDiscovered: Int) {

    fun eat(): String {
        return "eat"
    }

    open fun move(): String {
        return "move"
    }

    open fun breathe(): String {
        return "breathe"
    }

    open fun reproduce(): String {
        return "reproduce"
    }

    override fun toString(): String {
        return "$name is a ${this::class.simpleName} who was discovered in the year $yearDiscovered. To eat it will ${eat()}; to move it will ${move()}; to breate it uses ${breathe()}; to reproduce it produces ${reproduce()}."
    }
}