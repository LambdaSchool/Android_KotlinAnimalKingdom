abstract class Animal(val id: Int, val name: String, val year: Int){
    fun move(){
       println("The $name moves")
    }
    fun breathe(){
        println("The $name breathes")
    }
    fun reproduce(){
        println("The $name reproduces")
    }
}