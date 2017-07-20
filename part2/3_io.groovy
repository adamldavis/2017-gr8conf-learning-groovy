
new File("books.txt").text = "Learning Groovy\nModern Programming"

println new File("books.txt").text

//println "http://google.com".toURL().text
println ''

new File("books.txt").eachLine { line ->
    println "line=$line"
}
