
// Ranges

    (1..4).each {print it} //1234
    for (i in 1..4) print i //1234

    def text = 'learning groovy'
    println text[0..4] //learn
    println text[0..4,8..-1] //learn groovy

    def list = ['hank', 'john', 'fred']
    println list[0..1] //[hank, john]

    (1..<5).each {print it} //1234

