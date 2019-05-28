abstract class Animal(val id: Int, val name: String, val yearDiscovered: Int) {

    fun eat(): String {
        return "Animal is eating"
    }

    fun move(): String {
        return "Animal is moving"
    }

    fun breathe(): String {
        return "Animal is breathing"
    }

    fun reproduce(): String {
        return "Animal is reproducing"
    }
}