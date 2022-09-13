package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade)"
    }
}

fun main(){
    var thyago = Pessoa("Thyago", 33)
    println(thyago)
}