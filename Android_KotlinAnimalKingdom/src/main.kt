
fun main(args: Array<String>) {

    val animals = listOf(
        Mammal("Panda", 1869),
        Mammal("Zebra", 1778),
        Mammal("Koala", 1816),
        Mammal("Sloth", 1804),
        Mammal("Armadillo", 1758),
        Mammal("Raccoon", 1758),
        Mammal("Bigfoot", 2021),
        Bird("Pigeon", 1837),
        Bird("Peacock", 1821),
        Bird("Toucan", 1758),
        Bird("Parrot", 1824),
        Bird("Swan", 1758),
        Fish("Salmon", 1758),
        Fish("Catfish", 1817),
        Fish("Perch", 1758)
    )

    val printAnimal = { a:Animal -> println("${a.name} ${a.yearDiscovered} ${a.move()} ${a.breath()} ${a.reproduce()}") }

    println("Animals by year discovered descending")
    animals.sortedByDescending { it.yearDiscovered }
        .forEach { printAnimal(it) }

    println("---------------------------------------------------------------")
    println("Animals by name")
    animals.sortedBy { it.name }
        .forEach { printAnimal(it) }

    println("---------------------------------------------------------------")
    println("Animals by movement")
    animals.sortedBy { it.move() }
        .forEach { printAnimal(it) }

    println("---------------------------------------------------------------")
    println("Animals that breath with lungs")
    animals.filter { it.breath() == "lungs" }
        .forEach { printAnimal(it) }

    println("---------------------------------------------------------------")
    println("Animals that breath with lungs and was discovered in 1758")
    animals.filter { it.breath() == "lungs" && it.yearDiscovered == 1758 }
        .forEach { printAnimal(it) }

    println("---------------------------------------------------------------")
    println("Animals that lay eggs and breath with lungs")
    animals.filter { it.reproduce() == "eggs" && it.breath() == "lungs" }
        .forEach { printAnimal(it) }

    println("---------------------------------------------------------------")
    println("Animals that was discovered in 1758 by name")
    animals.filter { it.yearDiscovered == 1758 }
        .sortedBy { it.name }
        .forEach { printAnimal(it) }

}