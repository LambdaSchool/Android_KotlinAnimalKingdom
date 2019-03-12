//abstract class Animal(val move:String, val breath:String, val reproduce:String)
abstract class Animal(
    val id: Int,
    val name: String,
    val year: Int,
    val moveType: MoveType,
    val breathType: BreathType,
    val reproduceType: ReproduceType
) {
    override fun toString(): String {
//        return super.toString()
        return "$id. The $name, which was named in $year, moves by ${moveType.move}, breathes using ${breathType.breath}, and reproduces with ${reproduceType.reproduce}."
    }
}




class Mammal(id: Int, name: String, year: Int) :
    Animal(id, name, year, MoveType.WALK, BreathType.LUNGS, ReproduceType.LIVE_BIRTHS)

class Bird(id: Int, name: String, year: Int) :
        Animal(id, name, year, MoveType.FLY, BreathType.LUNGS, ReproduceType.EGGS)

class Fish(id: Int, name: String, year: Int) :
        Animal(id, name, year, MoveType.SWIM, BreathType.GILLS, ReproduceType.EGGS)

enum class MoveType(val move: String) {
    WALK("walking"), FLY("flying"), SWIM("swimming")
}

enum class BreathType(val breath: String) {
    LUNGS("lungs"), GILLS("gills")
}

enum class ReproduceType(val reproduce: String) {
    LIVE_BIRTHS("live births"), EGGS("eggs")
}