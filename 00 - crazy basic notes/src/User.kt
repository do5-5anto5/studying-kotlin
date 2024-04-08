//contrutor ja na declaração da classe esperando parametros
//class User (var name: String)
class User (var name: String , var isAdmin: Boolean ){

    //companion object é uma propriedade da classe (poderia ser uma lista, por exemplo)
    companion object {
        var count = 0
//        variavel imutavel constante
        const val MAX_NAME_LENGTH = 8
    }

    //bloco init acontece sempre ao instanciar a classe
    init {
        count ++
        println(count)
    }

    //sobrecarga de construtor com default values
    constructor(name: String = "") : this(name, false)

    constructor() : this ("Desconhecido", false)

    lateinit var lastName: String

    fun output() = println("Meu nome é: $name $lastName, sou admin: $isAdmin")

    fun printUppercase() {
        println(name.uppercase())
    }
}

data class UserMock(var name: String, var isAdmin: Boolean){
    companion object {
        private val users = mutableListOf<UserMock>()
        private fun createUsers(){
            for (i in 0 .. 10){
                val unknown = UserMock("Unknown", false)
            }
        }
    }
}



