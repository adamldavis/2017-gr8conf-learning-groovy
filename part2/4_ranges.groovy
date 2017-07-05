
// Ranges
println 'each:'
    (1..4).each {print it} //1234  
    println '' 
    (1..<5).each {print it} //1234

println '\n\nfor in:'
    for (i in 1..4) print i //1234

println '\n\nsubstring with ranges'
    def text = 'Learning Groovy'
    println text[0..<5] //learn
    println text[0..<5,8..-1] //learn groovy

println "\n\nranges with lists"
    def list = ['hank', 'john', 'fred']
    println list[0..1] //[hank, john]

