import groovy.transform.*
@Canonical
class Vampire {String name; int yearBorn; }

ARRAYS: {
    Vampire[] vampires = new Vampire[10]; // Vampire array with length 10
    String[] names = ["Dracula", "Edward"];
    println(vampires)
    println(names)
}
LISTS: {
    // java way
    List<Vampire> vampires = new ArrayList();
    vampires.add(new Vampire("Count Dracula", 1897))
    println(vampires)

    //groovy way
    def list = []
    list.add(new Vampire("Count Dracula", 1897))
    // or
    list << new Vampire("Count Dracula", 1897)
    // or
    list += new Vampire("Count Dracula", 1897)
    
    println(list)
}
SET1: {
    def dragons = new HashSet()
    dragons.add "Lambton"
    dragons << "Deerhurst"
    println "2 == ${dragons.size()}"
    dragons.remove("Lambton")
    println "1 == ${dragons.size()}"
    println(dragons)
}
SET2: {
    def dragons = new TreeSet()
    dragons.add "Lambton"
    dragons.add "Smaug"
    dragons.add "Deerhurst"
    dragons.add "Norbert"
    println(dragons)
}
MAPS: {
    def map = [cars: 1, boats: 2, planes: 3]
    println map
    println "cars = $map.cars"
    println "boats = $map.boats"
    map.cars = 42
    println "cars = $map.cars"
}

