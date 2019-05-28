class Fish(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override fun move(): String {
        return "swim"
    }

    override fun breathe(): String {
        return "gills"
    }

    override fun reproduce(): String {
        return "eggs"
    }
}