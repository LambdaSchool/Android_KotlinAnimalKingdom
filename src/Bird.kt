class Bird(id: Int, name: String, yearDiscovered: Int) : Animal(id, name, yearDiscovered) {
    override fun move(): String {
        return "${super.move()} by flying"
    }

    override fun breathe(): String {
        return "${super.breathe()} by using its lungs"
    }

    override fun reproduce(): String {
        return "${super.reproduce()} by laying eggs"
    }
}