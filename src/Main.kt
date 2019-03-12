fun main(args: Array<String>){
    var animalsList = mutableListOf<Animal>(
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

    //sortByYearNamedDesc(animalsList)
    //sortByNameAlphabetically(animalsList)
    //sortByMoveType(animalsList)
    listAnimalsThatBreathWithLungs(animalsList)
}

fun sortByYearNamedDesc(list: MutableList<Animal>){
    list.sortByDescending {
        it.year
    }
    list.forEach{
        println("${it.name} ${it.year}")
    }
}

fun sortByNameAlphabetically(list: MutableList<Animal>){
    list.sortBy {
        it.name
    }

    list.forEach{
        println("${it.name}")
    }
}

fun sortByMoveType(list: MutableList<Animal>){
    list.sortBy {
        it.move().split(" ")[1]
    }
    list.forEach{
        println(it.move())
    }
}

fun listAnimalsThatBreathWithLungs(list: MutableList<Animal>){
    var tempList = mutableListOf<Animal>()
    list.forEach{
        if(it.breath().split(" ")[3] == "lungs"){
            tempList.add(it)
        }
    }
    tempList.forEach{
        println(it.name)
    }
}





