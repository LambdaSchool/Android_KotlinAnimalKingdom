
abstract class Animal(val id: Int, val name: String, val year: Int) {
    fun consumeFood() {
        println("${name} consumed food")
    }

    abstract fun move(): String

    abstract fun breath(): String

    abstract fun reproduce(): String
}

sealed class Move(animalName: String){
    abstract fun performMove(animalName: String): String
}

class Fly(animalName: String): Move(animalName){
    override fun performMove(animalName: String): String {
        return "$animalName flys"
    }
}

class Walk(animalName: String): Move(animalName){
    override fun performMove(animalName: String): String {
        return "$animalName walks"
    }
}

class Swim(animalName: String): Move(animalName){
    override fun performMove(animalName: String): String {
        return "$animalName swims"
    }
}

sealed class Breathe(animalName: String){
    abstract fun performBreath(animalName: String): String
}

class Lungs(animalName: String): Breathe(animalName){
    override fun performBreath(animalName: String): String {
        return "$animalName breathes with lungs"
    }
}

class Gills(animalName: String): Breathe(animalName){
    override fun performBreath(animalName: String): String {
        return "$animalName breathes with gills"
    }
}

sealed class Reproduce(animalName: String){
    abstract fun performReproduction(animalName: String): String
}

class LiveBirths(animalName: String): Reproduce(animalName){
    override fun performReproduction(animalName: String): String {
        return "$animalName reproduces with live births"
    }
}

class Eggs(animalName: String): Reproduce(animalName){
    override fun performReproduction(animalName: String): String {
        return "$animalName reproduces with eggs"
    }
}

class Mammal(id: Int, name: String, year: Int): Animal(id, name, year){
    override fun move(): String {
        return Walk(name).performMove(name)
    }

    override fun breath(): String {
        return Lungs(name).performBreath(name)
    }

    override fun reproduce(): String {
        return LiveBirths(name).performReproduction(name)
    }
}

class Bird(id: Int, name: String, year: Int): Animal(id, name, year){
    override fun move(): String {
        return Fly(name).performMove(name)
    }

    override fun breath(): String {
        return Lungs(name).performBreath(name)
    }

    override fun reproduce(): String {
        return Eggs(name).performReproduction(name)
    }
}

class Fish(id: Int, name: String, year: Int): Animal(id, name, year){
    override fun move(): String {
        return Swim(name).performMove(name)
    }

    override fun breath(): String {
        return Gills(name).performBreath(name)
    }

    override fun reproduce(): String {
        return Eggs(name).performReproduction(name)
    }
}