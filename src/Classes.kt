sealed class Animal(id: Int, val name: String, val yearDiscovered: Int) {
    fun eat(): String {
        return "$name eats"
    }
    open fun move(): String {
        return "$name walks"
    }
    abstract fun breath(): String
    abstract fun reproduce(): String

}

class Mammal(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered) {
    override fun breath(): String {
        return "$name huffs and puffs"
    }

    override fun reproduce(): String {
       return "$name has a live birth"
    }

    fun walk() = this.move()
}

class Bird(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered) {

    override fun breath(): String {
        return "$name breathes in the wind"
    }

    override fun reproduce(): String {
        return "$name lays an egg"
    }

    override fun move(): String {
        return "$name flies up high"
    }
}

class Fish(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered) {
    override fun breath(): String {
        return "$name sucks in some water"
    }

    override fun reproduce(): String {
        return "$name lays an egg"
    }

    override fun move(): String {
        return "$name swims around"
    }
}