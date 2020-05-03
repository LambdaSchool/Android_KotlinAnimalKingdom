import java.lang.StringBuilder

fun main(args: Array<String>){
    val Panda = Mammal(1, "Panda", 1869)
    val Zebra = Mammal(2, "Zebra", 1778)
    val Koala = Mammal(3, "Koala", 1816)
    val Sloth = Mammal(4, "Sloth", 1804)
    val Armadillo = Mammal(5, "Armadillo", 1758)
    val Racoon = Mammal(6, "Racoon", 1758)
    val Bigfoot = Mammal(7, "Bigfoot", 2021)
    val Pigeon = Bird(8, "Pigeon", 1837)
    val Peacock = Bird(9, "Peacock", 1821)
    val Toucan = Bird(10, "Toucan", 1758)
    val Parrot = Bird(11, "Parrot", 1824)
    val Swan = Bird(12, "Swan", 1758)
    val Salmon = Fish(13, "Salmon", 1758)
    val Catfish = Fish(14, "Catfish", 1817)
    val Perch = Fish(15, "Perch", 1758)

    var animalList = mutableListOf<Animal>(Panda, Zebra, Koala, Sloth, Armadillo,
        Racoon, Bigfoot, Pigeon, Peacock, Toucan, Parrot, Swan, Salmon, Catfish, Perch)

    val printable = StringBuilder()
    animalList.forEach { printable.append(it.name ).append(" ") }
    println("Original: $printable")
    printable.clear()

    animalList.sortBy { it.yearDiscovered }
    animalList.forEach { printable.append(it.name ).append(" ") }
    println("By year discovered: $printable")
    printable.clear()

    animalList.sortBy { it.name }
    animalList.forEach { printable.append(it.name).append(" ") }
    println("By name alphabetically: $printable")
    printable.clear()

    animalList.filter { it.breathing.contains("lungs") }.forEach{ printable.append(it.name).append(" ") }
    println("That breathe with lungs: $printable")
    printable.clear()

    animalList.filter { it.breathing.contains("lungs") && it.yearDiscovered == 1758 }.forEach{ printable.append(it.name).append(" ") }
    println("That breathe with lungs and discovered in 1758: $printable")
    printable.clear()

    animalList.filter { it.breathing.contains("lungs") && it.reproduction.contains("eggs") }.forEach{ printable.append(it.name).append(" ") }
    println("That breathe with lungs and lay eggs: $printable")
    printable.clear()

    animalList.sortBy { it.name }
    animalList.filter { it.yearDiscovered == 1758 }.forEach{ printable.append(it.name).append(" ") }
    println("That were discovered in 1758 alphabetically: $printable")
    printable.clear()
}

