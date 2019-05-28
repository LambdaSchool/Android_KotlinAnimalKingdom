
abstract class Animal(val id: Int,
                      val name: String,
                      val yearDiscovered: Int,
                      val moveType: Move,
                      val breatheType: Breathe,
                      val reproduceType: Reproduce) {

}

class Mammal(id: Int, name: String, yearDiscovered: Int,
             walk: Walk, lungs: Lungs, liveBirth: LiveBirth):
    Animal(id, name, yearDiscovered, walk, lungs, liveBirth) {}

class Bird(id: Int, name: String, yearDiscovered: Int,
             fly: Fly, lungs: Lungs, eggs: Eggs):
    Animal(id, name, yearDiscovered, fly, lungs, eggs) {}

class Fish(id: Int, name: String, yearDiscovered: Int,
             swim: Swim, gills: Gills, eggs: Eggs):
    Animal(id, name, yearDiscovered, swim, gills, eggs) {}

open class Move() {
    open fun move() {}
}

class Walk(): Move() {
    override fun move() {
        println("The animal walks");
    }
}

class Fly(): Move() {
    override fun move() {
        println("The animal flies");
    }
}

class Swim(): Move() {
    override fun move() {
        println("The animal swims");
    }
}

open class Breathe() {
    open fun breathe() {}
}

class Lungs(): Breathe() {
    override fun breathe() {
        println("The animal breathes with lungs")
    }
}

class Gills(): Breathe() {
    override fun breathe() {
        println("The animal breathes with gills")
    }
}

open class Reproduce() {
    open fun reproduce(){}
}

class LiveBirth(): Reproduce() {
    override fun reproduce() {
        println("The animal reproduces with live birth")
    }
}

class Eggs(): Reproduce() {
    override fun reproduce() {
        println("The animal reproduces with eggs")
    }
}