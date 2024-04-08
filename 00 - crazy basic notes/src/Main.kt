import kotlin.math.min

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //TODO variaveis, tipo inferido, imprimir tipo de uma variavel, conversão te tipos
//    //semelhante a final int idade = 31;
//    val idade = 31
//    var desconto = 31.90f //tipo inferido Float
//
//    //imprime o tipo da variavel idade
//    println(idade::class)
//    println(desconto::class)
//
//    val resposta = desconto.toInt()
//
//    println("" + resposta + " " + resposta::class)
//
//    //em kotlin eu posso colocar o sinal underscore no meio de um numero para melhorar a leitura
//    val preco = 1_200
//    println(preco)

    //TODO operadores lógicos

//    var idade = 31
//    idade += 10
//    println(idade)
//
//    val bolinada = idade < 100
//
//    println(!bolinada)

    //TODO caracteres especiais e chars

//    //quando uso aspas simples '' na declaração da variavel, estou declarando um char //16 bits
//    val minhaString = "J"
//    val meuChar = 'J'
//    println(minhaString + " " + minhaString::class )
//    println(meuChar + " " + meuChar::class )

    //TODO acessando propriedades
//    val name = "Jonathan"
//    val newName = name.uppercase()
//    println(name)
//    println(name.length)

    //TODO formatação de textos

//    //1
//    val message = "Olha, abestado, seu produto chegou!"
//    println(message)
//
//    //2
//    val welcome = """
//        idiota
//        idiota
//        i...
//    """.trimIndent()
//    println(welcome)
//    val textToReplaceIndent = """
//        text1,
//        text2,
//        text3
//    """.replaceIndent(";")
//    println(textToReplaceIndent)
//
//    //3
//    val name = "Jonathan"
//    val age = 35
//    val price = 19.90
//    println("Olá $name. Sua idade é $age. Seu desconto é: ${price * 0.1}. e seu nome tem ${name.length} letras.")

    //TODO condições

//    var product = "ap"
//
//    if(product.length < 3) println("Impossível cadastrar produtos com nomes pequenos")
//    else println("Produto cadastrado.")
//
//    var besta = null // a variavel pode ser criada sem tipo declarado ou inferido, e ser nula
//    // essa variavel declarada com Tipo? é nullable
//    var anulavel: String? = "telefone"
//    println(anulavel)
//    //sem o simbolo? a variavel nao pode ser modificada para nula
//    anulavel = null
//
//    //para acessar propriedades da String anulável eu preciso antes verificar se é nula ou nao.
//    //caso contrario ocorrerá erro de compilação
//
//    //nesse caso o retorno é null ou "telefone"
//    val quantidadeDeCaracteresNullable = anulavel?.length
//
//    //e  nesse caso um operador ternario retorna "telefone" ou 0
//    val quantidadeDeCaracteresAlternativa = anulavel?.length ?: 0

//    helloWorld()
//    olaMundo()
//
//}
//
////TODO escopo, declaração e corpo de funções
//
//// a função que nao declara retorno é uma função Unit (euivalente a método void no Java)
//fun helloWorld(){
//    //função ddentro da função (função de Escopo)
//    fun subtracao(){
//        println(2 - 4)
//    }
//    subtracao()
//}
//
////para uma função com retorno
//fun functionWithReturn(): String{
//    return "retorno"
//}
//
//// aparentemente nao posso fazer sobrecarga com 2 funs Unit
////body in line
//fun olaMundo() = println("Olá mundo!")
//
//
//
//fun olaMundo(a: Int, b: Int) {

//

//    //TODO sobrecarga de funções
//
//    verifyLogin(35, "Jhonny", true)
//    verifyLogin(17, "Doe")
//}
//
//fun verifyLogin(age: Int, name: String, isAdmin: Boolean){
//    val answer = if (isAdmin) "O nome é $name.  Idade é $age. É admin: $isAdmin. Logado como administrador"
//    else "O nome é $name.  Idade é $age É admin: $isAdmin. Logado como usuário"
//    println(answer)
//
//}fun verifyLogin(age: Int, name: String){
//    println("O nome é $name.  Idade é $age. Logado")

//    //TODO valor padrão como parametro
////    defaultValueParam()
////    defaultValueParam("Nome modificado")
////}
////
//////nessa declaração, se a variavel name nao for definida como argumento, teraá o valor padrão "John Doe"
////fun defaultValueParam(name: String = "John Doe"){
////    println(name)

//    //TODO propriedades e comportamentos de objetos
//    val userA = User()
//    val userB = User()
//
//    userA.name = "Jonathan"
//    userB.name = "dos Santos"
//
//    userA.printUppercase()
//    userB.printUppercase()
//
//    val construtorA = Construtor()
//    construtorA.build()
//
//    val userA = User()
//    val userB = User()
//    val userC = User()

//    TODO objetos únicos (SINGLETON)
//    nesse caso foi criado o object Database para demonstração;
//    assim como classe é o molde para N objetos;

//    ao criar um arquivo object, está especificado que aquele objeto é unico (banco de dados, logs, sessão de usuário, etc

//    val userA = User("Jonathan")
//    println(Database.name)
//    println(Database.userLogged?.name)
//
//    login(userA)
//    println(Database.userLogged?.name)
//
//
//    val userB = User
//    println("impressao de userB " + userB)
//    val userC = User()
//    println("impressao de userC " + userC.name)
//}
//
//fun login(user: User){
//    Database.userLogged = user

//    TODO lateinit var
//    foi usaqda uma linha como essa "lateinit var ne: String" na classe User declarando que essa variável seria
//          inicializada mais tarde.
//          para tal, a variavel do objeto foi instanciada na fun main.
//          caso nao, o método output causaria um erro na aplicação

//    val user = User("Jonathan", true)
//    user.lastName = "dos Santos"
//    user.output()

//    TODO classes aninhadas (nested classes)

//    ness caso foi criada uma classe aninhada comum, Guitar dentro de Musician
//    Guitar é uma inner class de Musician, apenas se declarada como tal
//    a diferença está em como criar uma instancia dessa classe

//    var guitar = Musician.Guitar() // instanciando a nested class sem que ela seja uma inner class

//    var manoChao = Musician()
////    instanciando inner class
//    val guitar = manoChao.Guitar()
//    guitar.desc()

//    TODO enum class

//    println(CreditCard.ELO.ordinal)
//
//    val creditCardApiName = "Visa"
//    val card = CreditCard.valueOf(creditCardApiName.uppercase())
//
//}
//
//enum class CreditCard(val label: String) {
//    VISA("Visa"),
//    MASTER("Master"),
//    ELO("ELO"),
//    AMEX("American Express")

//    TODO when

//    val user = User("Jonathan", true)
//
//    when {
//        user.name == "Bruce" -> println("Bruce encontrado no banco de dados")
//        else -> println("Nenhum usuário encontrado no banco de dados.")
//    }
//
////    if / else if/ else
//    when(user.name) {
//        "Bruce"     -> println("Bruce encontrado no banco de dados")
//        "Marcelo"   -> println("Marcelo é D2")
//        else        -> println("Nenhum usuário encontrado no banco de dados.")
//    }
//
//    val creditCartApiName = "Visa"
//    val card = CreditCard.valueOf(creditCartApiName.uppercase())
//
//    val discount = when (card){
//        CreditCard.VISA     -> "10%"
//        CreditCard.MASTER   -> "12%"
//        CreditCard.ELO      -> "15%"
//        CreditCard.AMEX     -> "17%"
//    }
//
//    println(discount)
//
//}
//
//enum class CreditCard(val label: String) {
//    VISA("Visa"),
//    MASTER("Master"),
//    ELO("ELO"),
//    AMEX("American Express")

//    TODO data class

////    comparando os objetos (usando class)
//    val person1 = Person ("Jonathan", false)
//    val person2 = Person ("Jonathan", false)
//
//    println(person1 == person2)
//
////    comparando sempre as propriedades de objetos usando uma data class
//    val entity1 = Entity ("Jonathan", false)
//    val entity2 = Entity ("Jonathan", false)
//    println(entity1 == entity2)
//}
//
//class Person(var name: String, var isAdmin: Boolean){}
//
//data class Entity(var name: String, var isAdmin: Boolean){

//    TODO desestruturação de data class; copiando um objeto a partir de data class
//    val personA = Person("Jonathan", true)
////    forma comum de chamar um metodo de outro pacote a partir de um objecto instanciado por uma classe
//    println("O usuário logado é ${personA.name}.")
//    println("O usuário tem regra de admin: ${personA.isAdmin}.")
//
//
////    com objetos criados a partir de data classes, posso fazer a desestruturação da classe facilitar o acesso
////        a propriedades desses objetos a partir do escopo da fun ou classe atual
//
////    nessa técnica é importante passar os argumentos e a qtd dos mesmos conforme a ordem dos parametros
//    val (name, isAdmin) = personA
//    println("O usuário logado é ${name}. (feito com desestruturaçõ de classe)")
//    println("O usuário tem regra de admin: ${isAdmin}. (feito com desestruturaçõ de classe)")
//
//    //COPIANDO UM OBJETO A PARTIR DE UM DATA CLASS
//    val personB = personA.copy()
//    //COPIANDO UM OBJETO A PARTIR DE UM DATA CLASS, E ALTERANDO UMA PROPRIEDADE
//    val personC = personA.copy(isAdmin = false)
//
//    println("pessoa A $personA")
//    println("pessoa B $personB")
//    println("pessoa C $personC")
//
//}
//
//data class Person(var name:String, var isAdmin: Boolean){

//    TODO pares e trios

////    Pair é um data class, com métodos específicos preparados para trabalhar, obviamente, com pares
//
//    val coordinates = Pair(10, 20)
//    println("""
//        ${coordinates.first}
//        ${coordinates.second}
//    """.trimIndent())
//
////    os pares podem ser de tipos diferentes, e a declaração pode ser mais "limpa"
//
//    val houseNumber = 10 to "Jonathan"
//
//    // as mesmas regras se aplicam para trios
//    val triple = Triple (200, 100, 1)
//
//    println("""
//        ${triple.first}
//        ${triple.second}
//        ${triple.third}
//    """.trimIndent())
////    se declarar diretamente os valores do trio, nao tenho o a propriedade third
////    val coordinates3d = 200 to 100 to 1
////    println(coordinates3d.third) //aqui tenho um erro de compilação

//    TODO herança, niveis de acesso, open class, abstract class, niveis de abstração, concrete fun em abstract class
//    val p = Teacher("Girafales", "Street A")
////    println(p.desc())
////
////    val a = Student(123, "Madruguinha", "Street B")
////    println("""
////        My Id is ${a.regId}.
////        ${a.desc()}
////    """.trimIndent())
////
////    val f = Flute("'Flute X'")
////    val g = Guitar("'Fender'")
////    val v = Fiddle("Stradivarius")
////
////    f.tune()
////    g.tune()
////    v.tune()
////}
////
//////Para ter acesso às propriedades da super class a partir das sub classes, ela tem que ser open ou abstract.
//////A diferença é que open class pode ser instanciada, e dependendendo do contexto o programador pode nao precisar disso.
//////  no caso, abstract class é mais indcada
////
//////open class Person(var name: String, var address: String){
////abstract class Person(var name: String, var address: String){
////    protected var libraryAccess = false
////    //metodo concreto em uma classe abstrata
////    fun desc() = "My name is $name and my adress is $address. Access level: $libraryAccess"
////}
//////é prefiso definir os parametros das subclasses, e a que corresponderão na super class
////class Teacher (name: String, address: String): Person(name, address){
////    init{ libraryAccess = true }
////}
////
////class Student(var regId: Int, name: String, address: String): Person(name, address)

//    TODO sobrescrevendo funçoes de classes abstratas
//    val btn = Btn("Salvar", 0xff00, 20 to 30)
//    btn.render()
//
//    val link = Link("Enter", 60 to 40)
//    link.render()
//}
//
//abstract class Component {
//    abstract fun position() : Pair<Int, Int>
//
////    declarando a função render como open, ela pode ser iniciada por sub classes, e também sobrescrita
//    open fun render(){
//        println("Desenhando a tela na posição: ${position().first} | ${position().second}")
//    }
//}
//
//abstract class Text(val text: String) : Component(){
//    override fun render() {
//        super.render()
//        println("Desenhando o texto $text")
//    }
//}
//
//class Btn(text: String, val backgroundColor: Int, val pos: Pair<Int, Int>): Text(text){
//    override fun position(): Pair<Int, Int> {
//        return pos
//    }
//
//    override fun render() {
//        super.render()
//        println("Desenhando o botão $text, com background $backgroundColor")
//    }
//}
//
//class Link (text: String, val pos: Pair<Int, Int>): Text(text){
//    override fun position(): Pair<Int, Int> {
//        return pos
//    }
//
//    override fun render() {
//        super.render()
//        println("Gerando o link $text")
//    }

    //todo COLEÇÕES (por padrão, listas são imutáveis. é necessário declarar que sejam mutáveis para trabalhar como tais

//    TODO arrayOf

//    val items = arrayOf(1, 2, 3, 4, 5)
//    items.forEach {println(it)
//    }

////    arrayOf é imutável (read only)
//
//    val users = arrayOf(
//        UserMock("Jonathan", true),
//        UserMock("Thiago", false)
//    )
//
//    val newList = users.plus(UserMock("Fátima", true))
//    newList[1] = UserMock("Neemias", true)
//
//    newList.forEach { println(it) }

//    TODO ListOf
////    ListOf é imutável (read only)
//
//    val users = listOf(
//        UserMock("Jonathan", true),
//        UserMock("Peco", false)
//    )
//    println(users.firstOrNull())
//    println(users.lastOrNull())
//
////    criando uma lista vazia
//    val emptyList = emptyList<User?>()

//    TODO mutableList

//    val users = mutableListOf(
//        UserMock("Jonathan", true)
//    )
//    users.add(UserMock("Neemias", true))
//    val newUserMock = UserMock("novo usuário", false)
//
//    users.add(newUserMock)
//
//    users.forEach{(println(it))}
//    println("""
//
//        Deletando $newUserMock
//
//        """.trimIndent())
//
//    users.remove(newUserMock)
//
//    users.forEach{(println(it))}

//    TODO combinando listas, filtrando listas

//    val a  = mutableListOf("Jonathan", "Neemias")
//    val b = mutableListOf("Joao", "Peter", "Lucy")
//
////    combinando listas, usando criterios
//    b.filterTo(a,{it.contains("a")})
//    println(a)
//
//    val c = mutableListOf("A", "B")
//    val d = mutableListOf("E", "F")
//
////    combinando listas, sem critérios
//    val all = listOf(c,d)
//    println(all.flatten())
//
////    filtrando listas
//    val users = listOf(
//        UserMock("Jonathan", true),
//        UserMock("Neemias", true),
//        UserMock("Fatima", true),
//        UserMock("Peco", false)
//    )
//
//    val filtered = users.filter(){user ->
//        user.isAdmin && user.name.lowercase().contains("ee")
//    }
//    filtered.forEach{ println(it) }
//
//    val filteredObj = users.firstOrNull { it.name == "Joana" }
//    println(filteredObj)

//    TODO sets - set nao permite a adição de itens repetitivos
////    assim como outros tipos de listas, é preciso declarar que seja mutable para permitir alteração apos a criação

//    val users = setOf(
//        UserMock("Jonathan", true),
//        UserMock("Jonathan", true),
//        UserMock("Neemias", true),
//        UserMock("Neemias", true),
//        UserMock("Fatima", true),
//        UserMock("Fatima", true),
//        UserMock("Peco", false),
//        UserMock("Peco", false)
//    )
//
//    users.forEach { (println(it)) }

//    TODO programação funcional, lambda
//    a ideia é tratar tudo como funcoes matematicas

//    val n1 = 5
//    val n2 = 5
//
//    calc(n1, n2, ::sum)
//    calc(n1, n2, ::minus)
//    calc(n1, n2, ::div)
//
////    com uma expressao lambda posso ter uma função 'nao declarada', ou função anonima
////    a seguir, operando multiplicação sem declarar uma fun
//
//    calc(5, 5) { x, y ->
//        x * y
//    }
//
//    val users = listOf(
//        UserMock("Jonathan", true),
//        UserMock("Neemias", true),
//        UserMock("Fatima", true),
//        UserMock("Peco", false)
//    )
//
//    println(users.filter(::filtering))
//
//    println(users.filter{ it.isAdmin == true } )
//
//}
//
//fun sum (x: Int, y: Int): Int{
//    return x + y
//}
//fun minus (x: Int, y: Int): Int {
//    return x - y
//}
//fun div (x: Int, y: Int): Int{
//    return x / y
//}
//
////    a fun calc recebe como parametros dois Integers e uma função que recebe dois Integers e retorne um Integer
//fun calc (a: Int, b:Int, operation: (Int, Int) -> Int){
//    val result = operation(a, b)
//    println("Resultado da operação de $a com $b = $result")
//}
//
//fun filtering (user: UserMock): Boolean{
//    return user.name.contains("a")

//    TODO functions transformations

//    val users = listOf(
//        UserMock("Jonathan", true),
//        UserMock("Neemias", true),
//        UserMock("Fatima", true),
//        UserMock("Peco", false)
//    )
//
//    val nameList = users.map { user ->
//        user.name
//    }
//
//    println(nameList)
//
//    val filteredNameList = users.map {user -> user.name.uppercase() }
//                                .filter { user -> user.contains("A") }
//
//    println(filteredNameList)

//    TODO Union, loops tradicionais

//    val numbers = listOf(1,2,3,4,5,6,7)
//    val numbers2 = listOf(0,2,4,6,8)
//
//
//    val result = numbers.union(numbers2)
//
//    result.forEach{println(it)}
//
////    for each com indice
//    result.forEachIndexed  { index, element ->
//        println("index: $index, elemento: $element")
//    }
//
////    for tradicional
//    for(number in numbers){}
//
////    for indexado com until para limitar index ao ultimo elemento - 1 ( por exemplo: para percorrer um array )
//    for (index in 0 until 3){}
//
////    for indexado com dois pontos para limitar index ao ultimo elemento
//    for (index in 0..3){}
//
////    nesse for o loo pula de 2 em 2 elementos
//    for (index in 0..20 step 2){
//        println("n#$index")
//    }
//
////    for reverso
//    for(i in 20 downTo 0 step 2){
//        println("n#$i")
//    }
//
//    var w = 0
//
//    while ( w < 10){
//        println(w)
//        w++
//    }

//    TODO Map

////    criando Map imutável
//    var products = mutableMapOf(
//        "Android" to "Google",
//        "iOS" to "iPhone",
//        "Windows" to "Microsoft"
//    )
//
////    accessando os valores por chave
//    val answer = products["Android"]
//    println(answer)
//
////    qualquer Map criado em kotlin é nullable
//    println(products["chaveInexistente"])
//
////    getOrDefault - passando valor default para o caso de retorno nulo
//    val defaultNullableAnswer = products.getOrDefault("chaveInexistente", "Chave não salva no map")
//    println(defaultNullableAnswer)
//
////    getOrElse - passando método em caso de retorno nulo
//    val methodNulableAnswer = products.getOrElse("chaveInexistente") {
//        println("executando método")
//        "Chave não salva no map"
//    }
//
//    val hasWindows = products.containsKey("Windows")
//    if (hasWindows) println("fazer algo quando tem Windows")
//
//    val hasGoogle = products.containsValue("Google")
//    if (hasGoogle) println("fazer algo quando tem Google")
//
//    // Map funcional
//
//    //filtrando valores que comtem a letra "e" e armazenando as iniciais de suas chaves em uppercase num String[]
//    val filteredMap = products  .filter { it.value.contains("e") }
//                                .map { it.key.substring(0, 1).uppercase() }
//    println(filteredMap::class)
//
//    val gmailContacts = mapOf(
//        1 to "Bobo",
//        2 to "Bocó",
//        3 to "Bananão",
//        4 to "Biruleibe",
//        5 to "Idiossincrático"
//    )
//
//    val filteredGmailContacts = gmailContacts   .filter { it.value.isNotEmpty() }
//                                                .map{ it.value.substring(0, 1)}
//
//    println(filteredGmailContacts)
//
//    val users = UserTest.createUsers(10)
//    println(users)

//        TODO exercicio do hackerrank
//    val arr = arrayOf(1,1,2,2,3)
//    println(migratoryBirds(arr))
//}
//
//fun migratoryBirds(arr: Array<Int>): Int {
//    val map = mutableMapOf<Int, Int>()
//    var mostSighted = mutableSetOf<Int>()
//
//    arr.forEach {
//        if (!map.containsKey(it)) map.put(it, 0)
//        if(map.containsKey(it)) map[it] = (map[it] ?: 0) + 1
//    }
//
//    var mostSeenBird = 0
//    var maxValue = 0
//    var minId = 0
//
//    map.forEach{ key, value ->
//
//        if (value > maxValue) {
//            maxValue = value
//            mostSighted.clear()
//            mostSeenBird = key
//            mostSighted.add(mostSeenBird)
//        }
//
//        if(value == maxValue){
//            mostSeenBird = key
//            mostSighted.add(mostSeenBird)
//        }
//
//        mostSighted.forEach{
//            if (it == mostSighted.first()) minId = mostSighted.first()
//            if (it < minId) minId = it
//        }
//    }
//
//    return minId

//   TODO Any

//    val verdadeiro: Any = true
//    val inteiro: Any = 10
//    val nome: Any = "Jonathan"
//
//    println("""
//        $nome é do tipo ${nome::class},
//        $verdadeiro é do tipo ${verdadeiro::class},
//         $inteiro é do tipo ${inteiro::class}.
//
//         TODOS sao Any.""".trimIndent())
//
//    val obj = getObject(10)
//
////    validando se o objeto é uma string (para poder acessar propriedades com .length)
//    println(obj)
//    if (obj is String) println("o objeto é uma string, com ${obj.length} caracteres. \n (validando tipo)")
//
////    tratando o objeto como uma string (para acessar propriedades). tem que passar nullable e validar se é nulo
//    val cast = obj as? String
//    if (cast != null) println("o objeto é uma string, com ${cast.length} caracteres. \n (validando se é nulo)")
//}
//
//fun getObject(value: Int): Any {
//    return when(value) {
//        1 -> 1
//        2 -> "Aula"
//        3 -> 1.0
//        else -> true
//    }

//    TODO exceptions
//    divide("x", "5")
//
//}
//
//fun divide(x: String, y: String) {
//    try {
//        val a = Integer.parseInt(x)
//        val b = Integer.parseInt(y)
//        println(a / b)
//    } catch (e: ArithmeticException){
//        println("não se pode dividir por zero")
//    } catch (e: NumberFormatException){
//        println("não se pode converter letras em números.")
//    }

//    TODO lançando excessões

//    showView()
//
//}
//
//fun showView(){
//    try{
//        val discount = applyDiscount(100.0, 51)
//        println(discount)
//    } catch (e: IllegalArgumentException){
//        println(e.message)
//        //logica qualquer
//    }
//}
//fun applyDiscount(price: Double, value: Int): Double{
//    if (value > 50) throw IllegalArgumentException("Desconto muito alto")
//    return price * value / 100

//    TODO interface e polimorfismo

    val musico1 = Musico("Jonathan")
    musico1.tocavel = buscarInstrumento()
    musico1.menu = getMenu()
    musico1.startPlay()
    musico1.fazerPedido()
}

fun buscarInstrumento(): Tocavel{
    return Guitarra()
}

fun getMenu(): Menu{
    return McD()
}

class Musico (val nome: String){
    lateinit var tocavel: Tocavel
    lateinit var menu: Menu

    fun startPlay(){
        tocavel.play()
    }
    fun fazerPedido(){
        val combo = menu.comboDoDia()
        println(combo)
    }
}

interface Tocavel {
    fun play()
}

interface Menu {
    fun comboDoDia(): String
}

class Guitarra: Tocavel{
    override fun play() {
        println("Tocando guitarra")
    }
}
class Bateria: Tocavel{
    override fun play() {
        println("Tocando bateria")
    }
}
class Baixo: Tocavel{
    override fun play() {
        println("Tocando baixo")
    }
}

class McD: Menu{
    override fun comboDoDia(): String {
        return "BigMac"
    }
}

class BK: Menu {
    override fun comboDoDia(): String {
        return "BKzão"
    }
}

class Podrao: Menu {
    override fun comboDoDia(): String {
        return "XPodrao"
    }
}