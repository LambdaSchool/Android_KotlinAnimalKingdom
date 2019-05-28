class Mammal(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override fun move(): String {
        return "walk"
    }

    override fun breathe(): String {
        return "lungs"
    }

    override fun reproduce(): String {
        return "live births"
    }
}
