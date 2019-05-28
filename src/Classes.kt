sealed class Animal(id: Int, name: String, yearDiscovered: Int) {
    fun eat(): String {
        return "The animal eats" //replace animal with ${name}
    }
    open fun move(): String {
        return "The animal walks"
    }
    abstract fun breath(): String
    abstract fun reproduce(): String

}

class Mammal(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered) {
    override fun breath(): String {
        return "The mammal huff and puffs"
    }

    override fun reproduce(): String {
       return "has a live birth"
    }

    fun walk() = this.move()
}

class Bird(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered) {
    override fun breath(): String {
        return "The bird breathes in the wind"
    }

    override fun reproduce(): String {
        return "The bird lays an egg"
    }

    override fun move(): String {
        return "The bird flies up high"
    }
}

class Fish(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered) {
    override fun breath(): String {
        return "The fish sucks in some water"
    }

    override fun reproduce(): String {
        return "The fish lays an egg"
    }

    override fun move(): String {
        return "the fish swims around"
    }
}