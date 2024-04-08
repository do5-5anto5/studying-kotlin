class Construtor(
    private var name: String,
    private var employee: Boolean = false) {

    init {println("construtor na fila")}

    constructor() : this("Não registrado", false)

    fun build(){
        employee = true
        println("$name \n" +
                "Propriedade 'employee' mudada para $employee. Construtor trabalhando.")
    }
}