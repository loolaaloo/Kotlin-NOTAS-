var varmundial: String = "Hola soy Luis, ¿cómo estás?" //ESTO ES UNA VARIABLE PARA TODO EL PROGRAMA
//ESTO ES UN COMENTARIO
/**
 * Esto tambien es un comentario
 */
//UNA FUNCION (FUN) ES UN CONTENEDOR DE OPERACIONES, Y SE USA MAIN PARA INDICAR QUE AQUI INICIA EL CODIGO
/**
 * el alcance de la funcion es donde acaban los corchetes {}, y lo que esta fuera de la funcion
 * ya no lo toma en cuenta el programa, es decir,
 * si tengo una variable dentro de otro fun, este no lo tomara en cuenta, pero si tengo una variable fuera de
 * fun, esta se aplicara para todo el programa, mirar arriba con varmundial
 */
//EN POCAS PALABRAS FUN ES UNA CAJA

fun main() { //SIEMPRE SE DEBE CREAR UNA FUNCION MAIN, QUE MAIN SIRVE PARA EJECUTAR TODO
    explicaciones()
    variablesAlfanumericas()
    //currentedad(17) //Aqui me pone por preterminado la fun que creamos dentro de los parentesis (edadreal) y dar un valor
    add(12, 988) //POR PRETERMINADO LA FUNCION ME DEJA AÑADIR VALORES USANDO LA COMA
    name("Luis Eduardo") //EN FUNCION MAIN SE DEBEN COLOCAR LAS FUN A EJECUTAR
    currentedad(17, 18)
    resta(12, 120)
    val resta2 = resta(12,10) //ES ULTRA NECESARIO PONER VAL
    println (resta2)
//TODO ESTO SON FUNCIONES
}

fun explicaciones() {
    /**
     * Variables numericas
     */
    val popo = "hola"//popo es el nombre q yo puse, val es la variable

    //int (variables enteros) numeros no tan grandes
    val edad: Int = 20

    //Long variables con numeros grandes
    val edad2: Long = 20

    //float numeros decimales,  es muy importante colocar la f
    val edad3: Float = 30.5f

    //La primera palabra de todas las variables siempre es minus y las demas empiezan en Mayus
    val olaComoEstas: Float = 30.5f

    //Double, soporta 14 decimales xd
    val doubleExaple: Double = 30.5

    /**
     * Variables Booleanas
     */

    //Boolean true y false en minus
    val exampleBoolean: Boolean = true
    val example1Boolean: Boolean = false

    //INFORMACION IMPORTANTE VAL ES UNA VARBIABLE QUE NO PUEDE CAMBIAR SU VALOR, PERO VAR SI:

    var example1 = 10
    example1 = 20
    val example2 = 10
    //val example2= 20, NO SE PUEDE

    //PARA COLOCAR ENTER SE USA PRINTLN (PRINT NEW LINE)

    println(example1)
    println(example2)
    println(example1 + example2)

    //Se pueden sumar todas las variables, pero, por ejemplo: si sumas un int con un float, el sistema
    //convierte el resultado a un float:
    val caca1: Int = 12
    val caca2: Float = 12.45f //NO OLVIDAR PONER LA F
    var suma = caca1 + caca2 //Aqui convirtio el resultado a float xd
    println(suma)
    //PERO TAMBIEN PODEMOS CONVERTIR CACA2 A INT PARA QUE EL RESULTADO SEA INT:
    val caca3: Int = 12
    val caca4: Float = 12.45f
    var suma2: Int = caca3 + caca4.toInt() //IMPORTANTE
    println(suma2)

}

fun variablesAlfanumericas() {
    /**
     * Variables Alfanumericas
     */
    //Char solo soporta un caracter, y se coloca con comillas simples
    val charExample1: Char = 'a'

    //String con comillas "", puede almacenar lo que sea
    val stringExample: String = "añañañañ"

    //Cuando sumamos strings, se concatenan:
    val strExample = "234"
    val strExample2 = "123"
    val suma4 = strExample + strExample2
    println(suma4)
    //Pero podemos convertir los valores a int
    val suma5 = strExample.toInt() + strExample2.toInt()
    println(suma5)
    //PARA IMPRIMIR UNA VARIABLE ES COMO PHYTON PERO EN LUGAR DE COMA ES $:
    println("Hola soy luis $strExample y soy guapo B)")
    //SI QUEREMOS IGUALAR DOS CARIABLES QUE SON DIFERENTES (INT Y STR) DEBEMOS HACER ESTO:
    val example123: String = strExample.toString()
    println(example123)
}

fun currentedad(edadreal: Int, edadfalsa: Int) {//DENTRO DE LA FUNCION EN LOS PARENTESIS SE PUEDE COLOCAR UNA VARIABLE, MIRAR ARRIBA ( FUN MAIN)
    /**
     * ENTONCES SI YO IMPRIMO EN LA CONSOLA LA EDAD SERA LA D ARRIBA:
     */
    println("Mi edad es $edadreal y soy luis")
    print("Mi edad falsa es: $edadfalsa y soy luis")
}


fun add(edad1: Int, edad2: Int) { //ESTO ES UNA FUNCION QUE SUMA, MIRAR ARRIBA
    println(edad1 + edad2)
}

fun name(nombre: String) { //LA FUNCION SE LLAMA NAME PERO LA VARIABLE DENTRO DE ELLA ES NOMBRE:
    //println("Mi nombre es $name") //AQUI SE IMPRIME LA VARIABLE, NO LA FUNCION ENTOCES QUEDA ASI:
    println("Hola mi nomre es $nombre")
}
          //estos parentesis de abajo son parametros de entrada el : Int despues,estamos dicendo q hay parametros de salida
          //Int es porque debo especificar el tipo de valr a devolver, ya que solo se puede devolver una sola cosa
fun resta(firtsNumber: Int, secondNumber: Int):Int {
              println()
    return firtsNumber - secondNumber //OTRA FORMA DE PRINT ES RETURN, Y PARA ESO DEBEMOS COLOCAR : Int despues de la funcion, mirar arriba
              //TODO EL CODIGO QUE SE USA DESPUES DE RETURN ES IMUSABLE, PORQUE RETURN COLAPSA EL PRGRAMA
              //ES DECIR QUE EL CODIGO QUE SIGUE DESPUES DE RETURN ES INGNORADO
}
