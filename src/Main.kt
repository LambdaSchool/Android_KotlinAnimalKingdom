fun main() {
    fauna.sortByDescending { it.name }
//    printFauna(fauna)
//    fauna.sortBy { it.name }
//    printFauna(fauna)
//    fauna.sortBy { it.move() }
//    printFauna(fauna)
//    printFauna(sortWithLungs(fauna))
//    printFauna(namedIn1758WithLungs(fauna))
//    printFauna(sortWithLungsAndLayEggs(fauna))
    printFauna(sortByNameIn1758(fauna))
}

fun printFauna(list: MutableList<Animal>) {
    for (animal in list) {
        println()
        println(animal.name)
        println(animal.id)
        println(animal.yearNamed)
        println(animal.move())
        println(animal.breath())
        println(animal.reproduce())
        println()
    }
}

fun sortWithLungs(list: MutableList<Animal>): MutableList<Animal> {
    var sorted: MutableList<Animal> = list
    sorted.removeIf{ it.breath() != "Lungs" }
    return sorted
}

fun namedIn1758WithLungs(list: MutableList<Animal>): MutableList<Animal> {
    var sorted: MutableList<Animal> = list
    sorted.removeIf{ it.breath() != "Lungs" }
    sorted.removeIf{ it.yearNamed != 1758 }
    return sorted
}

fun sortWithLungsAndLayEggs(list: MutableList<Animal>): MutableList<Animal> {
    var sorted: MutableList<Animal> = list
    sorted.removeIf{ it.breath() != "Lungs" }
    sorted.removeIf{ it.reproduce() != "Eggs" }
    return sorted
}

fun sortByNameIn1758(list: MutableList<Animal>): MutableList<Animal> {
    var sorted: MutableList<Animal> = list
    sorted.removeIf { it.yearNamed != 1758 }
    sorted.sortBy { it.name }
    return sorted
}



var fauna: MutableList<Animal> = mutableListOf(
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

