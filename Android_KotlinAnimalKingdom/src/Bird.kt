
class Bird(name: String, yearDiscovered: Int) : Animal(name, yearDiscovered) {

    override fun move(): String {
        return "fly"
    }

    override fun breath(): String {
        return "lungs"
    }

    override fun reproduce(): String {
        return "eggs"
    }

}