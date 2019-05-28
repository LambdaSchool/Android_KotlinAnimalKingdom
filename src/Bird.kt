class Bird(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override fun move(): String {
        return "fly"
    }

    override fun breathe(): String {
        return "lungs"
    }

    override fun reproduce(): String {
        return "eggs"
    }
}