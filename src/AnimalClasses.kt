
abstract class Animal(val id: Int, val name: String, val year: Int) {
    fun consumeFood() {
        println("${name} consumed food")
    }

    abstract fun move()

    abstract fun breath()

    abstract fun reproduce()
}

sealed class Move(animalName: String){
    abstract fun performMove(animalName: String)
}

class Fly(animalName: String): Move(animalName){
    override fun performMove(animalName: String) {
        println("$animalName flys")
    }
}

class Walk(animalName: String): Move(animalName){
    override fun performMove(animalName: String) {
        println("$animalName walks")
    }
}

class Swim(animalName: String): Move(animalName){
    override fun performMove(animalName: String) {
        println("$animalName swims")
    }
}

sealed class Breath(animalName: String){
    abstract fun performBreath(animalName: String)
}

class Lungs(animalName: String): Breath(animalName){
    override fun performBreath(animalName: String) {
        println("$animalName breaths with lungs")
    }
}

class Gills(animalName: String): Breath(animalName){
    override fun performBreath(animalName: String) {
        println("$animalName breaths with gills")
    }
}

sealed class Reproduce(animalName: String){
    abstract fun performReproduction(animalName: String)
}

class LiveBirths(animalName: String): Reproduce(animalName){
    override fun performReproduction(animalName: String) {
        println("$animalName reproduces with live births")
    }
}

class Eggs(animalName: String): Reproduce(animalName){
    override fun performReproduction(animalName: String) {
        println("$animalName reproduces with eggs")
    }
}

class Mammal(id: Int, name: String, year: Int): Animal(id, name, year){
    override fun move() {
        Walk(name).performMove(name)
    }

    override fun breath() {
        Lungs(name).performBreath(name)
    }

    override fun reproduce() {
        LiveBirths(name).performReproduction(name)
    }
}

class Bird(id: Int, name: String, year: Int): Animal(id, name, year){
    override fun move() {
        Fly(name).performMove(name)
    }

    override fun breath() {
        Lungs(name).performBreath(name)
    }

    override fun reproduce() {
        Eggs(name).performReproduction(name)
    }
}

class Fish(id: Int, name: String, year: Int): Animal(id, name, year){
    override fun move() {
        Swim(name).performMove(name)
    }

    override fun breath() {
        Gills(name).performBreath(name)
    }

    override fun reproduce() {
        Eggs(name).performReproduction(name)
    }
}