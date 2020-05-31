

class Mammal(name: String, yearDiscovered: Int) : Animal(name, yearDiscovered){

    override fun move(): String {
        return "walk"
    }

    override fun breath(): String {
        return "lungs"
    }

    override fun reproduce(): String {
        return "live birth"
    }

}