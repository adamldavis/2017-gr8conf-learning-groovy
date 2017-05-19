
//groovy truth

if ("foo") println("foo")
if (42) println("42")
if (!"") println("empty string")
if (! 0) println("zero")
if (![]) println "empty set!"

if (null) println "null!"
if ([]) println "wrong!"

// null, 0, [], "" === false


