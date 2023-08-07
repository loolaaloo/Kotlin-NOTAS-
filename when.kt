fun main(){
    obtenerMes(13)
    obtenerMesWhen(3)
    trismestres(12)
    whenNumerosGrandes(2)
    whenAnyIs(true)
}

fun obtenerMes (mes:Int){
    println("USO DE IF")
    if (mes == 1) {
        println("El mes es enero...")
    }else if(mes == 2) {
        println("El mes es febrero...")
    }else if(mes == 3){
        println("El mes es marzo...")
    }else if(mes == 4){
        println("El mes es abril...")
    }else if(mes == 5){
        println("El mes es mayo...")
    }else if(mes == 6){
    println("El mes es junio...")
    }else if(mes == 7) {
        print("El mes es julio...")
    }else if(mes == 8){
        println("El mes es Agosto...")
    }else if(mes == 9){
        println("El mes es septiembre...")
    }else if (mes ==10){
        println("El mes es octubre...")
    }else if(mes == 11){
        println("El mes es noviembre...")
    }else if (mes == 12){
        println("El mes es diciembre...")
    }else
        println("El numero no es valido como mes pelotudin...")
}
//ESTO ES DEMACIADO TEXTO Y HAY UNA MEJOR FORMA DE HACERLO...

fun obtenerMesWhen (month:Int){
    println("USO DE WHEN")
    when(month) {
        1 -> println("El mes es enero...")
        2 -> println("El mes es febrero...")//SI QUIERO COLOCAR VARIAS LINEAS DEBO USAR CORCHETES:
        3 -> {println("El mes es marzo...")
            println("uso de mas de dos lineas")
        }
        4 -> println("El mes es abril...")
        5 -> println("El mes es mayo...")
        6 -> println("El mes es junip...")
        7 -> println("El mes es julio...")
        8 -> println("El mes es agosto...")
        9 -> println("El mes es septiembre...")
        10 -> println("El mes es octubre...")
        11 -> println("El mes es noviembre...")
        12 -> println("El mes es diciembre...")
        else -> println("El numero ingresado no es un mes válido")
    }

}
//TAMBIEN EN WHEN SE PUEDE USAR ELSE,Se debe colocar con -> y antes del corchete final de when

fun trismestres (mes:Int){
    println("OTRO USO DE WHEN:")
    when(mes){
        1,2,3-> print("PRIMER TRIMESTRE")
        4,5,6->{print("SEGUNDO TRIMESTRE")
            print("SEGUNDO TRIMESTRE, USO DE MAS DE DOS LINEAS")
        }
        7,8,9->print("TERCER TRIMESTRE")
        10,11,12->print("CUARTO TRIMESTRE")
        else->print("EL MES INTRODUCIDO NO CORRESPONDE A NINGUN TRIMESTRE")
    }
}//ESTO APLICA SOLO PARA NUMEROS PEQUEÑOS PERO QUE PASA SI ES UN NUMERO DEL 1 AL 899, NO VAMOS A ESCRIBIR 899 NUMEROS XD

//WHEN PARA NUMEROS GRANDES:
fun whenNumerosGrandes (semestre:Int){
    println("WHEN PARA NUMEROS CON RANGO:")
    when(semestre){
        in 1..6->println("ESTE MES CORRESPONDE AL PRIMER SEMESTRE") //los dos puntos sigfnifica rango, es decir del 1 al 6
        in 7..12->print("ESTE MES CORRESPONDE AL SEGUNDO SEMESTRE") //los dos puntos sigfnifica rango, es decir del 1 al 6
        else->print("EL MES INTRODUCIDO NO CORESPONDE A NINGUN SEMESTRE")
        //ESTE ELSE SE PUDE USAR DE OTRA FORMA CON !:
        //!in 1..12->print("EL MES INTROUDCIDI NO CORRESPONDE A NINGUN SEMESRE")
        //RECORDAR QUE ! SIGNIFICA FALSO, ES DECIR, SI NO ESTA ENTRE EL 1  EL 12 ENTONCES...
    }
}//MUY IMPORTANTE COLOCAR in y los dos puntitos ..

fun whenAnyIs (valor:Any){//ANY SIGNIFICA CUALQUIER VALOR, STRING, INT, BOOLEAN, ETC
    //PERO HAY QUE TENER CUIDADO CON ANY PORUQE NO PODEMOS SUMAR DOS BOOLEAN ( TRUE + TRUE:
    //val resultadoxd = (valor + valor) //ASUMIENDO QUE VALOR ES FALSO, MARCA ERROR
    //ENTONCES ESTA ES LA SOLUCION:
    println("WHEN CON ANY:")
    when(valor){
        is Int-> valor + valor
        is String-> print(valor)
        is Boolean-> if(valor)print("ESTE VALOR ES TRUE")// SE PUEDE USAR IF DENTRO DE WHEN
        //EL IF DICE: SI VALOR ES VERDADERO, RECORDAR QUE VALOR == TRUE Y !VALOR == FALSE, ENTOCES IMPIRMIR...
    }

}
