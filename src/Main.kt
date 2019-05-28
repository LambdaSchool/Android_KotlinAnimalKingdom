fun main(args: Array<String>) {
    val animals = loadAnimals()
    println("Animals sorted by descending year discovered")
    animals.sortByDescending { it.yearDiscovered }
    animals.forEach { println("${it.name} ${it.yearDiscovered}") }
    println("Animals sorted by ascending name")
    animals.sortBy { it.name }
    animals.forEach { println("${it.name} ${it.yearDiscovered}") }
    println("Animals sorted by how they move")
    animals.sortBy { it.move() }
    animals.forEach { println("${it.name} ${it.yearDiscovered} ${it.move()}") }
    println("Animals filtered by breathing with lungs")
    animals.filter {it.breatheType is Lungs}.forEach { println(it.name) }
    println("Animals filtered by breathing with lungs and named in 1758")
    animals.filter{it.breatheType is Lungs && it.yearDiscovered == 1758}.
            forEach{println("${it.name} ${it.yearDiscovered}")}
    println("Animals filtered by laying eggs and breathing with lungs")
    animals.filter {it.reproduceType is Eggs && it.breatheType is Lungs}.
            forEach{println("${it.name} ${it.yearDiscovered}")}
    println("Animals sorted by name and were named in 1758")
    animals.sortBy{it.name}
    animals.sortedBy{it.name}.filter{it.yearDiscovered == 1758}.
            forEach{println("${it.name} ${it.yearDiscovered}")}

}


fun loadAnimals(): ArrayList<Animal> {
    val animals = ArrayList<Animal>()
    animals.add(Mammal(1, "Panda", 1869))
    animals.add(Mammal(2, "Zebra", 1778))
    animals.add(Mammal(3, "Koala", 1816))
    animals.add(Mammal(4, "Sloth", 1804))
    animals.add(Mammal(5, "Armadillo", 1758))
    animals.add(Mammal(6, "Raccoon", 1758))
    animals.add(Mammal(7, "Bigfoot", 2021))

    animals.add(Bird(8, "Pigeon", 1837))
    animals.add(Bird(9, "Peacock", 1821))
    animals.add(Bird(10, "Toucan", 1758))
    animals.add(Bird(11, "Parrot", 1824))
    animals.add(Bird(12, "Swan", 1758))

    animals.add(Fish(13, "Salmon", 1758))
    animals.add(Fish(14, "Catfish", 1817))
    animals.add(Fish(15, "Perch", 1758))

    return animals
}