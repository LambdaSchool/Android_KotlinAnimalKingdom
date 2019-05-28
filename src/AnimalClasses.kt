
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

open class Move()

class Walk(): Move()

class Fly(): Move()

class Swim(): Move()

open class Breathe()

class Lungs(): Breathe()

class Gills(): Breathe()

open class Reproduce()

class LiveBirth(): Reproduce()

class Eggs(): Reproduce()