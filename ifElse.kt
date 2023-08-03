fun main() {
    ifBasico()
    ifAnidado()
    ifboolean()
    ifInt(17)
    ifMultiple()
    ifMultiple1if()
    ifMultipleOR()
}

fun ifBasico() {
    println("PRIMER IF:")
    var name = "Pepe" //el igual (=) significa asignar valores
    if (name == "Pepe") { //el == significa "igual que"  //SE DEBE COLOCAR CORVCHETES EN IF
        println("Oye la variable name debe ser Luis")
        //Aqui se debe colocar el texto para if
    } else { //no olivdar estos corchetes
        //Aqui se debe colocar el codigo para else
        print("Este si es Luis")
    }
}

fun ifAnidado() {
    println("SEGUNDO IF:")
    var animal = "oso"
    if (animal == "perrito") {
        println("!Es un perrito!")
    } else if (animal == "gato") {
        println("¡Es es un gato!")
    } else if (animal == "pajaro") {
        println("¡Esto es un pájaro!")
    } else {
        println("No es uno de los animales esperados :c")
    }
}
//UN ELSE SOLO NO FUNICONA PERO UN IF SOLO SÍ
//PARA ESO EXISTEN LO IF ANIDADOS,else if, QUE SON UN LISTADO DE condiciones QUE VAN UNA DETRAS DE OTRA
//Y GRACIAS A ESTO YA PODEMOS PONER UN UNICO ELSE

fun ifboolean() {
    println("TERCER IF:")
    var soyFeliz: Boolean = false
    if (!soyFeliz) {//AQUI NO ES NECESARIO PONER soyFeliz == true/false, porque el sistema lo detecta solo, pero hay que usar "!"
        //SI NO USO ! ES TRUE SI USO ! ES FALSE
        println("Estoy tite")
    }
}
//Para hacer una variable lo opuesto a false se tiene que usar "!":
//caca1 == true
//caca1 = !caca1 AHORA ESTO ES FALSO

fun ifInt(edad: Int) {
    println("CUARTO IF")
    if (edad >= 18) {
        print("Puedes tomar cerveza")
    } else {
        println("Toma jugo mocoso miado")
    }
}

fun ifMultiple() {
    println("QUINTO IF:")
    var paretnsPermition = true
    var edad: Int = 18
    var animo = "feliz"
    if (paretnsPermition) {
        if (edad >= 18) {
            if (animo == "feliz") {
                println("Si puedes beber cerveza")
            }
        }
    }
}
//HAY UNA FORMA DE HACER QUE NO SEA NECESARIO PONER TANTO IF:

fun ifMultiple1if (){
    println("Solucion QUINTO IF:")
    var age = 18
    var parentsPermission = true
    var animo = "feliz"
    if(age >= 18 && parentsPermission && animo == "feliz"){
        println("Si puedes beber alchol")
    }else {
    println("No puedes beber alchol")
    }
}
//SE TIENE QUE USAR DOS && PORQUE UNO SOLO ES PARA PONER VARIABLES EN UNA CADENA

fun ifMultipleOR (){
    println("IF MULTIPLE CON OR:")
    var animal = "perro"
    var animoFeliz = true
    if (animal == "perro" || animal == "gato" && animoFeliz){
        println("ESTO ES UN GATO O UN PERRO :D")
    }
}
//ES MUY IMPORTAMTE USAR || PARA DECIR OR, ES DECIR, SI EL ANIMAL ES ENTONCES Ó ES ESTO ENTONCES...
