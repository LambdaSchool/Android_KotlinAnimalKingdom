sealed class Animal(id: Int, val name: String, val yearDiscovered: Int) {
    fun eat(): String {
        return "$name eats"
    }
    open fun move(): String {
        return "$name walks"
    }
    abstract fun breathe(): String
    abstract fun reproduce(): String

}

class Mammal(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override fun move(): String {
        return "walk"
    }

    override fun breathe(): String {
        return "lungs"
    }

    override fun reproduce(): String {
        return "live births"
    }
}

class Bird(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override fun move(): String {
        return "fly"
    }

    override fun breathe(): String {
        return "lungs"
    }

    override fun reproduce(): String {
        return "eggs"
    }
}

class Fish(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override fun move(): String {
        return "swim"
    }

    override fun breathe(): String {
        return "gills"
    }

    override fun reproduce(): String {
        return "eggs"
    }
}