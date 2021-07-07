// main abstract class
abstract class Animal(
    val id: Int,
    val name: String,
    val year: Int,
    val moveType: MoveType,
    val breatheType: BreatheType,
    val reproduceType: ReproduceType
) {
    override fun toString(): String {
        if(id>9){return "$id. The $name, which was named in $year, moves by ${moveType.move}, breathes using ${breatheType.breath}, and reproduces with ${reproduceType.reproduce}."}
        return "$id.  The $name, which was named in $year, moves by ${moveType.move}, breathes using ${breatheType.breath}, and reproduces with ${reproduceType.reproduce}."
    }
}
//inherited classes
class Mammal(id: Int, name: String, year: Int) :
    Animal(id, name, year, MoveType.WALK, BreatheType.LUNGS, ReproduceType.LIVE_BIRTHS)
class Bird(id: Int, name: String, year: Int) :
    Animal(id, name, year, MoveType.FLY, BreatheType.LUNGS, ReproduceType.EGGS)
class Fish(id: Int, name: String, year: Int) :
    Animal(id, name, year, MoveType.SWIM, BreatheType.GILLS, ReproduceType.EGGS)

//enum classes
enum class MoveType(val move: String) {
    WALK("walking"), FLY("flying"), SWIM("swimming")
}
enum class BreatheType(val breath: String) {
    LUNGS("lungs"), GILLS("gills")
}
enum class ReproduceType(val reproduce: String) {
    LIVE_BIRTHS("live births"), EGGS("eggs")
}