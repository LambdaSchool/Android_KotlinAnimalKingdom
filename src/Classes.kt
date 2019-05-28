sealed class Animal(val id: Int, val name: String, val yearDiscovered: Int) {
    fun eat() {
        println("The $name eats")
    }

    abstract val movement: String
    abstract val breathing: String
    abstract val reproduction: String
    fun move() {
        when (this.movement) {
            "walk" -> println("The $name moves by walking")
            "swim" -> println("The $name moves by swimming")
            "fly" -> println("The $name moves by flying")
            else -> println("The Animal Moves")
        }
    }

    fun breath() {
        when (this.breathing) {
            "lungs" -> println("The $name breathes with its lungs")
            "gills" -> println("The $name breathes with its gills")
            else -> println("The Animal Breathes")
        }
    }

    fun reproduce() {
        when (this.reproduction) {
            "live birth" -> println("The $name reproduces by live birth")
            "eggs" -> println("The $name reproduces by laying eggs")
            else -> println("The Animal Reproduces")
        }
    }
}

class Mammal(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override val breathing: String
        get() = "lungs"
    override val movement: String
        get() = "walk"
    override val reproduction: String
        get() = "live birth"
}

class Bird(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override val breathing: String
        get() = "lungs"
    override val movement: String
        get() = "fly"
    override val reproduction: String
        get() = "eggs"
}

class Fish(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override val breathing: String
        get() = "gills"
    override val movement: String
        get() = "swim"
    override val reproduction: String
        get() = "eggs"
}
