
abstract class Animal(val id: Int,
                      val name: String,
                      val yearDiscovered: Int,
                      val moveType: Move,
                      val breatheType: Breathe,
                      val reproduceType: Reproduce) {
    fun move(): String {
        return moveType.move()
    }

    fun breathe(): String {
        return breatheType.breathe()
    }

    fun reproduce(): String {
        return reproduceType.reproduce()
    }

}

class Mammal(id: Int, name: String, yearDiscovered: Int):
    Animal(id, name, yearDiscovered, walk, lungs, liveBirth ) {
    companion object{
        val walk = Walk()
        val lungs = Lungs()
        val liveBirth = LiveBirth()
    }
}

class Bird(id: Int, name: String, yearDiscovered: Int):
    Animal(id, name, yearDiscovered, fly, lungs, eggs) {
    companion object {
        val fly = Fly()
        val lungs = Lungs()
        val eggs = Eggs()
    }
}

class Fish(id: Int, name: String, yearDiscovered: Int):
    Animal(id, name, yearDiscovered, swim, gills, eggs) {
    companion object {
        val swim = Swim()
        val gills = Gills()
        val eggs = Eggs()
    }
}

sealed class Move() {
    abstract fun move(): String
}

class Walk(): Move() {
    override fun move(): String  {
        return "The animal walks"
    }
}

class Fly(): Move() {
    override fun move(): String  {
        return "The animal flies"
    }
}

class Swim(): Move() {
    override fun move(): String {
        return "The animal swims"
    }
}

sealed class Breathe() {
    abstract fun breathe(): String
}

class Lungs(): Breathe() {
    override fun breathe(): String {
        return "The animal breathes with lungs"
    }
}

class Gills(): Breathe() {
    override fun breathe(): String  {
        return "The animal breathes with gills"
    }
}

sealed class Reproduce() {
    abstract fun reproduce(): String
}

class LiveBirth(): Reproduce() {
    override fun reproduce(): String {
        return "The animal reproduces with live birth"
    }
}

class Eggs(): Reproduce() {
    override fun reproduce(): String {
        return "The animal reproduces with eggs"
    }
}