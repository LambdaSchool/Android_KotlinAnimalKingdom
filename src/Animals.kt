abstract class Animals(val id:Int, val name:String, val year:Int){

    fun eats(): String {return "Consumes Food"}

    abstract fun move():String

    abstract fun reproduce():String

    abstract fun breath():String

}

class Mammal(id:Int, name:String, year:Int) : Animals(id, name, year) {
    override fun move(): String {
        return "walk"
    }

    override fun reproduce(): String {
        return "live birth"
    }

    override fun breath(): String {
        return "lungs"
    }
}

class Bird(id:Int, name:String, year:Int) : Animals(id, name, year) {
    override fun move(): String {
        return "fly"
    }

    override fun reproduce(): String {
        return "eggs"
    }

    override fun breath(): String {
        return "lungs"
    }
}

class Fish(id:Int, name:String, year:Int) : Animals(id, name, year) {
    override fun move(): String {
        return "swim"
    }

    override fun reproduce(): String {
        return "eggs"
    }

    override fun breath(): String {
        return "gills"
    }
}
