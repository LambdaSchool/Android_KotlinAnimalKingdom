fun main(){
  val animals = getData()
     println("\n-----Animals as added to list-----\n")
     animals.forEach { println(it) }
     println("\n-----Animals sorted by year in descending order-----\n")
     animals.sortByDescending { it.year }
     animals.forEach { println(it) }
     println("\n-----Animals sorted alphabetically by name-----\n")
     animals.sortBy { it.name }
     animals.forEach { println(it) }
     println("\n-----Animals sorted by year in movement type-----\n")
     animals.sortBy { it.moveType.move }
     animals.forEach { println(it) }
     println("\n-----Animals that breathe using lungs-----\n")
     animals.filter { (it.breatheType.breath.equals(BreatheType.LUNGS.breath)) }.forEach { println(it) }
     println("\n-----Animals that breathe using lungs and named in 1758-----\n")
     animals.filter { (it.breatheType.breath.equals(BreatheType.LUNGS.breath) && it.year.equals(1758)) }.forEach { println(it) }
     println("\n-----Animals that lay eggs and breathe using lungs-----\n")
     animals.filter {(it.breatheType.breath.equals(BreatheType.LUNGS.breath) && it.reproduceType.reproduce.equals(ReproduceType.EGGS.reproduce))}.forEach { println(it)}
     println("\n-----Animals sorted alphabetically by name that were named in 1758-----\n")
     animals.filter { it.year.equals(1758) }.sortedBy { it.name }.forEach { println(it) }}
//creating the arraylist
fun getData(): ArrayList<Animal> {
     val animals = ArrayList<Animal>()
          //mammals
     animals.add(Mammal(animals.size + 1, "Panda", 1869))
     animals.add(Mammal(animals.size + 1, "Zebra", 1778))
     animals.add(Mammal(animals.size + 1, "Koala", 1816))
     animals.add(Mammal(animals.size + 1, "Sloth", 1804))
     animals.add(Mammal(animals.size + 1, "Armadillo", 1758))
     animals.add(Mammal(animals.size + 1, "Raccoon", 1758))
     animals.add(Mammal(animals.size + 1, "Bigfoot", 2021))
          //birds
     animals.add(Bird(animals.size + 1, "Pigeon", 1837))
     animals.add(Bird(animals.size + 1, "Peacock", 1821))
     animals.add(Bird(animals.size + 1, "Toucan", 1758))
     animals.add(Bird(animals.size + 1, "Parrot", 1824))
     animals.add(Bird(animals.size + 1, "Swan", 1758))
          //fish
     animals.add(Fish(animals.size + 1, "Salmon", 1758))
     animals.add(Fish(animals.size + 1, "Catfish", 1817))
     animals.add(Fish(animals.size + 1, "Perch", 1758))
     return animals
}