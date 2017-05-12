//metaClass
String.metaClass.upper = {delegate.toUpperCase()}

println "foobar".upper()
println String.metaClass.class

//Map
def dog = [bark: {println "woof!"}]

dog.bark()

//methodMissing
class Car {
    def methodMissing(String name, params) {
        println "$name $params"
    }
}
def car = new Car()
car.go("vroom")

