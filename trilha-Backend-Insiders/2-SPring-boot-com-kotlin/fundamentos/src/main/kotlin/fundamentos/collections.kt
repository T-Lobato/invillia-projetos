package fundamentos

fun main() {

    var mapNomeIdade = mutableMapOf("Gustavo" to 24, "Daniel" to 20)
    println(mapNomeIdade)

    mapNomeIdade["Bruno"] = 30

    println(mapNomeIdade)

    mapNomeIdade.remove("Bruno")

    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Bruno", 24)

    println(mapNomeIdade)


//    var lista = mutableListOf(1, 2, 3, 2)
//    println("Lista: $lista")
//
//    var setNumeros = mutableSetOf(1, 2, 3, 2)
//
//    println(setNumeros.contains(2))
//
//    println(lista)
//
//    lista.sort()
//
//    println(lista)
//
//    lista.shuffle()
//
//    println(lista)

//    var listaNomes = mutableListOf("Gustavo", "Daniel")

//    println(listaNomes)
//
//    listaNomes.sort()
//
//    println(listaNomes)



//    lista.add(8)
//
//    lista.removeAt(0)
//    lista.remove(3)

//    lista[3] = 20


//    for (numero in lista){
//        println(numero)
//    }

//    println(lista[0])
//    println(lista.get(0))
//    println(lista.size)
//    println(lista.indexOf(6))

}