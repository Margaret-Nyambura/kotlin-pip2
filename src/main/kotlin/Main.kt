fun main(){
    println(myName("akirachix"))
    println(myName("An apple is a good fruit"))

    println(newAge(22))

    println(extract("watermelon"))

    println(greeting("Wellon"))
    println(greeting("Natalie"))

    println(area(12.40))
    println(area(4.56))

}

//How do you obtain the last character of a string using the indexing method
fun myName(statement:String){
    println(statement.last())
}
//I am currently 20 years old. Create a function that shows my age next year
fun newAge(age:Int){
    var x = age
    var y = ++x
    println(y)
}

//create a kotlin function that extracts a substring from a given string using the slice function, from index 2 to index6 and returns it
fun extract(texts:String):String{
    return texts.slice(2 until 6)

}

//create a funtion that takes in a name and a greeting(with default value "Hello"). The function should return a formattedgreeting message
fun greeting(name:String, greetings:String="Hello"):String{
    return "$greetings $name"
}

//write a kotlin function that calculates the area of a circle. Use a default value of 3.14 for pie
fun area(radius:Double, pie:Double=3.14):Double{
    return radius * pie
}