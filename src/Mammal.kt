class Mammal(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override fun move(): String {
        return "${super.move()} by walking"
    }

    override fun breathe(): String {
        return "${super.breathe()} by using its lungs"
    }

    override fun reproduce(): String {
        return "${super.reproduce()} by giving live births"
    }
}
