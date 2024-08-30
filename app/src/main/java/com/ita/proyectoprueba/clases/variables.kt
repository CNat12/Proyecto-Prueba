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
    }

    fun add():Int {
        val x:Int =5
        val y:Int =10

        return x+y
    }

fun product(x:Int, y:Int):Int{
    return x+y

}
//}