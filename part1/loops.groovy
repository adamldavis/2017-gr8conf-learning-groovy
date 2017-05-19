
def doSomething() { println("doSomething() called") }
def doSomething(i, type="") { println("doSomething($i, $type) called") }

WHILE: {
    boolean repeat = true
    while (repeat) {
        doSomething()
        repeat = false
    }
}
/* No do loop in Groovy! DO_LOOP: {
    boolean repeat = false
    do {
        doSomething()
    } while(repeat)
}*/
ITERATE_USING_WHILE: {    
    int i = 0
    while (i < 10) {
        doSomething(i)
        i++
    }
}
FOR_LOOP: {
    for (int i = 0; i < 10; i++) { //java style
        doSomething(i, "java")
    }
    for (i in 0..<10) doSomething(i, "groovy") // groovy style
}
println()
ARRAY_LOOP: {
//    String[] strArray = {"a", "b", "c"} //java
    String[] strArray = ["a", "b", "c"] //groovy
    
    println('java style:')
    for (int i = 0; i < strArray.length; i++)
        System.out.print(strArray[i]);
    println()
    println('Groovy style:')
    for (str in strArray) print str
}
println()
FOR_EACH: {    
//    String[] strArray = {"a", "b", "c"} //java
    String[] strArray = ["a", "b", "c"] //groovy
    println('java style2:')
    for (String str : strArray) print(str)
    println()
    println('Groovy style2:')
    strArray.each { print it } //or
    println('')
    strArray.each { str -> print str }
}
println()
