/*
- `sort` -- Sorts the collection (if it is sortable)
- `findAll` -- Finds all elements that match a closure.
- `collect` -- An iterator that builds a new collection.
- `inject` -- Loops through the values and returns a single value.
- `each` -- Iterates through the values using the given closure.
- `eachWithIndex` -- Iterates through with two parameters: a value and an index.
- `find` -- Finds the first element that matches a closure.
- `findIndexOf` -- Finds the first element that matches a closure and returns its index.
- `any` -- True if any element returns true for the closure.
- `every` -- True if all elements return true for the closure.
- `reverse` -- Reverses the ordering of elements in a list.
- `first` -- Gets the first element of a list.
- `last` -- Returns the last element of a list.
- `tail` -- Returns all elements except the first element of a list.
*/
class Dragon implements Comparable {
    def name
    Dragon(n) {name = n}
    String toString() {name}
    int compareTo(d) {name.compareTo d.name}
}
def dragons = [new Dragon("Smaug"), new Dragon("Lambton"), new Dragon("Norbert"), new Dragon("Deerhurst")]
dragons.sort()

dragons.each { println it }

if (dragons.any { it.name.startsWith("S") }) println "S found"

println( dragons.collect { it.name.toUpperCase() } )    

println '-----------------'

//Spread

/*The spread operator can be used to access the property of every element in a collection.
It can be used instead of "collect" in many cases.
For example, you could print the name of every dragon thusly:*/

    dragons*.name.each { println it }

