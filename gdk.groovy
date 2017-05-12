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

// Ranges

    (1..4).each {print it} //1234
    for (i in 1..4) print i //1234

    def text = 'learning groovy'
    println text[0..4] //learn
    println text[0..4,8..-1] //learn groovy

    def list = ['hank', 'john', 'fred']
    println list[0..1] //[hank, john]

    (1..<5).each {print it} //1234

println ''
println '-----------------'

// Utilities

//The GDK adds several utility classes such as ConfigSlurper, Expando, and ObservableList/Map/Set.

// ConfigSlurper

/*ConfigSlurper is a utility class for reading configuration files defined in the form of Groovy scripts.
Like with Java *.properties files, ConfigSlurper allows a dot notation.
It also allows for nested (Closure) configuration values and arbitrary object types.*/

    def config = new ConfigSlurper().parse('''
        app.date = new Date()
        app.age  = 42
        app {
            name = "Test${42}"
        }
    ''')

    def properties = config.toProperties()

    assert properties."app.date" instanceof String
    assert properties."app.age" == '42'
    assert properties."app.name" == 'Test42'
    
    println properties

// Expando

/*The Expando class can be used to create a dynamically expandable object.*/

    def expando = new Expando()
    expando.name = { -> 'Draco' }
    expando.say = { String s -> "${expando.name} says: ${s}" }
    expando.say('hello') // Draco says: hello

// Use meta-programming to alter some class's `metaClass` and then print out the class of the `metaClass`. Is it the `Expando` class?