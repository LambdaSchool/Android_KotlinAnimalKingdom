abstract class Animal(val id: Int, val name: String, val yearDiscovered: Int) {

    fun eat(): String {
        return "$name is eating"
    }

    open fun move(): String {
        return "$name is moving"
    }

    open fun breathe(): String {
        return "$name is breathing"
    }

    open fun reproduce(): String {
        return "$name is reproducing"
    }
}