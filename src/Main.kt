fun main(args: Array<String>) {
    sortByYearNamed()
    println("")
    sortByAlphabetically()
    println("")
    sortByMovementType()
    println("")
    sortByBreathWithLungs()
    println("")
    sortByLayEggsAndBreathWithLungs()
    println("")
    sortByBreathWithLungsAndNamedIn1758()
    println("")
    sortByLayEggsAndBreathWithLungs()
    println("")
    sortByNamedIn1758Alphabetically()
}

var animals = listOf<Animals>(
    Bird(1, "Pigeon", 1869),
    Bird(2, "Peacock", 1821),
    Bird(3, "Toucan", 1758),
    Bird(4, "Parrot", 1824),
    Bird(5, "Swan", 1758),
    Mammal(6, "Panda", 1869),
    Mammal(7, "Zebra", 1778),
    Mammal(8, "Koala", 1816),
    Mammal(9, "Sloth", 1804),
    Mammal(10, "Armadillo", 1758),
    Mammal(11, "Raccoon", 1758),
    Mammal(12, "Bigfoot", 2021),
    Fish(13, "Salmon", 1758),
    Fish(14, "Catfish", 1817),
    Fish(15, "Perch", 1758))


fun sortByYearNamed(){
    var sortedList = animals.sortedWith(compareBy {it.year})

    for(obj in sortedList){
        println(obj.name  + " "  + obj.year )
    }
}

fun sortByAlphabetically(){
    var sortedList = animals.sortedWith(compareBy {it.name})
    for(obj in sortedList){
        println(obj.name  + " " + obj.year)
    }
}

fun sortByMovementType(){
    var sortedList = animals.sortedWith(compareBy {it.move()})
    for(obj in sortedList){
        println(obj.name  + " " + obj.year)
    }
}

fun sortByBreathWithLungs(){
    var sortedList =  mutableListOf<Animals>()
    for(i in animals) {
        when(i.breath()){
        "lungs" -> sortedList.add(i)
        }
    }
    for(obj in sortedList){
        println(obj.name  + " " + obj.year)
    }
}

fun sortByBreathWithLungsAndNamedIn1758(){
    var sortedList =  mutableListOf<Animals>()
    for(i in animals) {
        when(i.breath()){
            "lungs" -> when(i.year){
                1758 -> sortedList.add(i)
            }
        }
    }

    for(obj in sortedList){
        println(obj.name + " "  + " " + obj.year)
    }
}

fun sortByLayEggsAndBreathWithLungs(){
    var sortedList =  mutableListOf<Animals>()
    for(i in animals) {
        when(i.breath()){
            "lungs" -> when(i.reproduce()){
                "lay eggs" -> sortedList.add(i)
            }
        }
    }
    for(obj in sortedList){
        println(obj.name   + " " + obj.year)
    }
}

fun sortByNamedIn1758Alphabetically(){
    var sortedList =  mutableListOf<Animals>()
    for(i in animals) {
        when(i.year){
            1758 -> sortedList.add(i)
        }
    }

    sortedList.sortBy { it.name }
    for(obj in sortedList){
        println(obj.name   + " " + obj.year)
    }
}