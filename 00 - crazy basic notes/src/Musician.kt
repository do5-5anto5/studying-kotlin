class Musician {
    var style: String = "Rock"
    fun desc() = println("Meu estilo é $style")

//  sem declarar inner, essa classe nao poderia acessar a propriedade style, mesmo sendo aninhada
    inner class Guitar{
        var strings = 6
        fun desc() = println("tocando uma guitarra com $strings cordas. E o estilo é $style")
    }
}