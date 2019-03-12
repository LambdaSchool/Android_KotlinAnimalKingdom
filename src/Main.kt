fun main(args: Array<String>){
    var mammalsList = mutableListOf<Animal>(
        Mammal(1, "Panda", 1869),
        Mammal(2, "Zebra", 1778),
        Mammal(3, "Koala", 1816),
        Mammal(4, "Sloth", 1804),
        Mammal(5, "Armadillo", 1758),
        Mammal(6, "Raccoon", 1758),
        Mammal(7, "Bigfoot", 2021),

        Bird(1, "Pigeon", 1837),
        Bird(2, "Peacock", 1821),
        Bird(3, "Toucan", 1758),
        Bird(4, "Parrot", 1824),
        Bird(5, "Swan", 1758),

        Fish(1, "Salmon", 1758),
        Fish(2, "Catfish", 1817),
        Fish(3, "Perch", 1758)
    )

    mammalsList.forEach{
        it.move()
    }
}





