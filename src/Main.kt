fun main(args:Array<String>) {

    seedData().forEach{println(it)}

}


fun seedData():ArrayList<Animal> {
    val animals = ArrayList<Animal>()

    animals.add(Mammal(animals.size+1,"Panda", 1869))
    animals.add(Mammal(animals.size+1,"Zebra", 1778))
    animals.add(Mammal(animals.size+1,"Koala", 1816))
    animals.add(Mammal(animals.size+1,"Sloth", 1804))
    animals.add(Mammal(animals.size+1,"Armadillo", 1758))
    animals.add(Mammal(animals.size+1,"Raccoon", 1758))
    animals.add(Mammal(animals.size+1,"Bigfoot", 2021))

    animals.add(Bird(animals.size+1,"Pigeon",1837))
    animals.add(Bird(animals.size+1,"Peacock",1821))
    animals.add(Bird(animals.size+1,"Toucan",1758))
    animals.add(Bird(animals.size+1,"Parrot",1824))
    animals.add(Bird(animals.size+1,"Swan",1758))

    animals.add(Fish(animals.size+1,"Salmon",1758))
    animals.add(Fish(animals.size+1,"Catfish",1817))
    animals.add(Fish(animals.size+1,"Perch",1758))

    return animals
}