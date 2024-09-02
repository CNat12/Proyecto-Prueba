package com.ita.proyectoprueba.clases

//class variables {

    fun main(){

        //Variables Numericas
        val edad:Int=20;
        val long_number:Long =987654321234556777;
        val temperature:Float= 26.123f;
        val weight:Double= 60.4;

        //Variables String
        val gander:Char='M';
        val name:String= "Nataly Dolores"

        //Boolean
        var isGreater:Boolean=false;

        //Array
        val names= arrayOf("Erick","Silvia","Hector","Gabriela")

        println(edad)
        println("Welcome $name, to your first kotlin project")
        println(add())
        println(product (x=10,y=92))
        printArray(names)


        println(names.joinToString ())
        val numbers = arrayOf(1,2,3,4,5,6,7,8,9)
        //cuales son pares y cuales no //
        isEven(numbers)

        println(getDay(day=2))

        val person= Person(name="Andrea", age=22)

        println(person.name)
        println(person.age)

        person.displayInformation()


    }

    fun add():Int {
        val x:Int =5
        val y:Int =10

        return x+y
    }

fun product(x:Int, y:Int):Int{
    return x+y

}

fun printArray(names:Array<String>){
    for(name in names){
        print("Hellow $name")

    }
}

fun isEven(numbers:Array<Int>){
    for(number in numbers){
        if(number % 2==0){
            println("The number $number is Even")
        }else{
            println("The number $number is Odd")
        }

    }
}

fun getDay(day:Int): String{
    var name =""

    when(day){
        1 -> name = "Monday"
        2 -> name = "Tuesday"
        3 -> name = "Wednesday"
        4 -> name = "Thurstday"
        5 -> name = "Friday"
        6 -> name = "Saturday"
        7 -> name = "Sunday"
        else -> name= "Incorrect value"


    }
    return name
}

class Person (val name:String, val age:Int){
    fun displayInformation(){
        println("Name: $name. Age: $age")
    }
}
//}