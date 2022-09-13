package fundamentos

fun main(){
    dizOi(retornaNome(), 33)
    // Podemos passar os parâmetros fora de ordem caso necessário
    // Porém nesse caso é necessário especificar o parâmetro desejado
    dizOi(idade = 33, nome = "Thyago")
    // É possível definir um valor padrão para caso não seja informado na chamada da função.
    // No exemplo definimos a idade como 18, por isso não da erro ao informamos apenas o nome na chamada.
    dizOi("Thyago")
}

fun retornaNome(): String {
    return "Thyago"
}

fun dizOi(nome: String, idade: Int = 18){
    println("Oi $nome. parabéns pelos seus $idade anos")
}