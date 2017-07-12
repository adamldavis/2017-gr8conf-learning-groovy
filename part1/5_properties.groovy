
class Foo {
    def bar
}
def foo = new Foo()

assert foo.bar == foo.getBar()

foo.bar = 2

println "bar = $foo.bar"
