import kotlin.random.Random

fun main(args: Array<String>) {
    /*val mammal: Mammal = Mammal(Random.nextInt(Int.MAX_VALUE), "Dog", 1403)
    println(mammal.eat())
    println(mammal.move())
    println(mammal.breathe())
    println(mammal.reproduce())*/

    val animals = listOf<Animal>(
        Mammal(Random.nextInt(Int.MAX_VALUE), "Panda", 1869),
        Mammal(Random.nextInt(Int.MAX_VALUE), "Zebra", 1778),
        Mammal(Random.nextInt(Int.MAX_VALUE), "Koala", 1816),
        Mammal(Random.nextInt(Int.MAX_VALUE), "Sloth", 1804),
        Mammal(Random.nextInt(Int.MAX_VALUE), "Armadillo", 1758),
        Mammal(Random.nextInt(Int.MAX_VALUE), "Raccoon", 1758),
        Mammal(Random.nextInt(Int.MAX_VALUE), "Bigfoot", 2021),
        Bird(Random.nextInt(Int.MAX_VALUE), "Pigeon", 1837),
        Bird(Random.nextInt(Int.MAX_VALUE), "Peacock", 1821),
        Bird(Random.nextInt(Int.MAX_VALUE), "Toucan", 1758),
        Bird(Random.nextInt(Int.MAX_VALUE), "Parrot", 1824),
        Bird(Random.nextInt(Int.MAX_VALUE), "Swan", 1758),
        Fish(Random.nextInt(Int.MAX_VALUE), "Salmon", 1758),
        Fish(Random.nextInt(Int.MAX_VALUE), "Catfish", 1817),
        Fish(Random.nextInt(Int.MAX_VALUE), "Perch", 1758)
    )


}