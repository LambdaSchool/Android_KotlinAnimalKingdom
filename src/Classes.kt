
sealed class Animal(val id: Int, val name: String, val yearDiscovered: Int){
    fun eat(){
        println("The $name eats")
    }
    abstract fun move();
    abstract fun breath();
    abstract fun reproduce();
}

class Mammal(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered){
    override fun breath() {
        println("The $name breathes with its lungs")
    }

    override fun move() {
        println("The $name moves by walking")
    }

    override fun reproduce() {
        println("The $name reproduces by live birth")
    }
}

class Bird(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered){
    override fun breath() {
        println("The $name breathes with its lungs")
    }

    override fun move() {
        println("The $name moves by flying")
    }

    override fun reproduce() {
        println("The $name reproduces by laying eggs")
    }
}

class Fish(id: Int, name: String, yearDiscovered: Int): Animal(id, name, yearDiscovered){
    override fun breath() {
        println("The $name breathes with its gills")
    }

    override fun move() {
        println("The $name moves by swimming")
    }

    override fun reproduce() {
        println("The $name reproduces by laying eggs")
    }
}
