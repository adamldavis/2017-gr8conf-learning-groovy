
class DSL implements Comparable {
    String name
    
    def leftShift(DSL t) {
        new DSL(name: name + "<<" + t.name)
    }
    def plus(DSL t) {
        new DSL(name: name + " ++ " + t.name) 
    }
    def minus(DSL t) {
        new DSL(name: name + " -- " + t.name) 
    }
    DSL bitwiseNegate() { new DSL(name: name + "~") }
    
    def call(DSL other) {
        println "call $other"
        this
    }
    String toString() {name}
    
    int compareTo(other) {
        other.name = name + ' > ' + other.name
        1
    }
}

def t = new DSL(name: 't')
def t2 = new DSL(name: 't2')
def t3 = new DSL(name: 't3')

println "t<<t2 :: ${t << t2}"
println "t+t2 :: ${(t + t2).name}"
println "t-t3 :: ${t - t3}"
println "~t3 :: ${((~t3).name)}"

t > t2
println "compareTo :: $t2.name"

t(t3)
