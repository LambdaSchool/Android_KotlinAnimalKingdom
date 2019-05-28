

class Fish(name: String, yearDiscovered: Int) : Animal(name, yearDiscovered) {

    override fun move(): String {
        return "swim"
    }

    override fun breath(): String {
        return "gills"
    }

    override fun reproduce(): String {
        return "eggs"
    }

}