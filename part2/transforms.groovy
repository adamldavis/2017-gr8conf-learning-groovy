import groovy.transform.*

@ToString
@TupleConstructor
@EqualsAndHashCode
class Person {
    def name
}
Person bob = new Person("Bob")
println "person = $bob"

Person bob2 = new Person("Bob")

println "bob == bob2? ${bob == bob2}"

println "\n\n\n"


@Canonical 
//@TypeChecked
class Dragon {
    final age
    String name
    //def x() { name.foo() }
}

def d = new Dragon(1000, "Smaug")
println "$d.name is $d.age years old"

def norbort = new Dragon(1, "Norbort")
println "$norbort.name is $norbort.age year old"

//d.age = 2
println "$norbort"

def d2 = new Dragon(2, "Smaug")
def d3 = new Dragon(1000, "Smaug")
println "d2equal? ${d == d2}"
println "d3equal? ${d == d3}"




