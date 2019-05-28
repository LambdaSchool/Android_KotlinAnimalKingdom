fun main() {

    println("Hello there")


    val list = arrayListOf<Animal>()

    list.add(Mammal(0, "Panda", 1869))
    list.add(Mammal(1, "Zebra", 1778))
    list.add(Mammal(2, "Koala", 1816))
    list.add(Mammal(3, "Sloth", 1804))
    list.add(Mammal(4, "Armadillo", 1758))
    list.add(Mammal(5, "Raccoon", 1758))
    list.add(Mammal(6, "Bigfoot", 2021))
    list.add(Bird(7, "Pigeon",1837))
    list.add(Bird(8, "Peacock",1821))
    list.add(Bird(9, "Toucan",1758))
    list.add(Bird(10, "Parrot",1824))
    list.add(Bird(11, "Swan",1758))
    list.add(Fish(12, "Salmon", 1758))
    list.add(Fish(13, "Catfish", 1817))
    list.add(Fish(14, "Perch", 1758))


    val returnSortedAlphabetical = {list: ArrayList<Animal> -> list.sortBy { it.name }

        for(item in list) {
            println(item.name)
        }
    }

    returnSortedAlphabetical(list)

}