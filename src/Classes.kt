object iterator {
    var id = 1
}

abstract class Animal(val name: String, val yearNamed: Int) {
    fun eat() {
        println("Om Nom!")
    }

    var id: Int

    init {
        id = iterator.id
        iterator.id += 1
    }

    abstract fun move(): String

    abstract fun breath(): String

    abstract fun reproduce(): String
}

class Mammal(name: String, yearNamed: Int): Animal(name, yearNamed) {
    override fun move() = "Walks"

    override fun breath() = "Lungs"

    override fun reproduce() = "Live births"
}

class Bird(name: String, yearNamed: Int): Animal(name, yearNamed) {
    override fun move() = "Flies"

    override fun breath() = "Lungs"

    override fun reproduce() = "Eggs"
}

class Fish(name: String, yearNamed: Int): Animal(name, yearNamed) {
    override fun move() = "Swims"

    override fun breath() = "Gills"

    override fun reproduce() = "Eggs"
}

