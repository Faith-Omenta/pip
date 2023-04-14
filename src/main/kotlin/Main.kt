fun main() {
    string()

    println(sentence("I am from Frankfurt"))

    words()

    name()

    cap()

}
//Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string (2 points)

fun string(){
    var school="Akirachix"
    var scoo= "${school[0]}${school[2]}${school[3]}"
    println(scoo)
}

//Write a function that takes in a String and returns its length

fun sentence(words:String):Int{
    var sentence=words.length
    return sentence
}

//comparing strings
fun words(){
    var str1="I like cooking"
    var str2="I don't like cooking"
    println(str1.compareTo(str2))
}

//concatinating two strings
//firstName.plus(secondName)
fun name(){
    var firstName="Faith"
    var lastName="Bosibori"
    println(firstName+ " " +lastName)
}
//upperCase
//lowerCase
fun cap(){
    var wrds="Akirachix"
    println(wrds.capitalize())
    println(wrds.toUpperCase())
    println(wrds.toLowerCase())
    println(wrds.decapitalize())
}
