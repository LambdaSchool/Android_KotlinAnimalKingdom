import kotlin.random.Random

fun main(args: Array<String>) {
    /*val mammal: Mammal = Mammal(Random.nextInt(Int.MAX_VALUE), "Dog", 1403)
    println(mammal.eat())
    println(mammal.move())
    println(mammal.breathe())
    println(mammal.reproduce())*/

    val animals: MutableList<Animal> = mutableListOf<Animal>(
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


//    animals.sortByDescending { it.yearDiscovered }
//    animals.forEach { println(it.toString()) }
//    animals.sortBy { it.name }
//    animals.forEach { println(it.toString()) }
//    val filteredAnimals1 = animals.filter { it.breathe() == "lungs" }
//    filteredAnimals1.forEach { println(it.toString()) }
//    val filteredAnimals2: List<Animal> = animals.filter { it.breathe() == "lungs" && it.yearDiscovered == 1758 }
//    filteredAnimals2.forEach { println(it.toString()) }
//    val filteredAnimals3: List<Animal> = animals.filter { it.reproduce() == "eggs" && it.breathe() == "lungs" }
//    filteredAnimals3.forEach { println(it.toString()) }
//    val filteredAnimals3: List<Animal> = animals.filter { it.yearDiscovered == 1758 }
//    filteredAnimals3.sortedBy { it.name }
//    filteredAnimals3.forEach { println(it.toString()) }


    println("-----------------------------------\nDescending order by Year Discovered\n-----------------------------------")
    animals.sortWith(Comparator { a, b ->
        when {
            a.yearDiscovered < b.yearDiscovered -> 1
            a.yearDiscovered == b.yearDiscovered -> 0
            else -> -1
        }
    })
    animals.forEach { println(it.toString()) }

    println("--------------------------------------\nAscending order alphabetically by name\n--------------------------------------")
    animals.sortWith(Comparator { a, b ->
        when {
            a.name > b.name -> 1
            a.name == b.name -> 0
            else -> -1
        }
    })
    animals.forEach { println(it.toString()) }

    println("--------------------\nOrdering by movement\n--------------------")
    animals.sortWith(Comparator { a, b ->
        when {
            a.move() == b.move() -> 1
            a.move() > b.move() -> 0
            else -> -1
        }
    })
    animals.forEach { println(it.toString()) }

    println("------------------------\nShow only lung-breathers\n------------------------")
    animals.sortWith(Comparator { a, b ->
        when {
            a.breathe() == "lungs" -> 0
            else -> -1
        }
    })
    animals.forEach { println(it.toString()) }


}
