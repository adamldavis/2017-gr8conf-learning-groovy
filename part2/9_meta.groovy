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
        def impl = { p -> println "$name $p" }
        Car.metaClass."$name" = impl
        impl(params)
    }
}
def car = new Car()
car.go("vroom")
car.park()
car.switchGear("reverse")
car.findAllCarsWithModel("Honda")

car.go("clunk")

println Car.metaClass.methods


