
class Dragon {
    String name
    Dragon(String n) {name=n}

    def fly() {println "$name flying"}

    // default values:
    def say(String text = "I hear you") {println text}
    
    String toString() {name}
}

    Dragon dragon = new Dragon('Smaug')
    dragon.fly()
    dragon.say()
    dragon.say('I smell you')
    
    // java-style
    public Dragon makeDragonNamed(String name) {
        return new Dragon(name);
    }
    //groovy-style: use 'def', no type, 'return' not needed
    def makeDragonNamed(name) {
        new Dragon(name)
    }
    println '\n'
    println(makeDragonNamed("Norbert"))
    
    //varargs
    void printSpaced(Object... objects) {
        for (Object o : objects) print(o + " ")
    }
    println '\n'
    printSpaced("A", "B", "C") // A B C
    println()
    printSpaced(1, 2, 3) // 1 2 3
    println()
    
