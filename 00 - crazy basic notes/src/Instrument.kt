abstract class Instrument(var name: String){
// uma função abstrata tem que estar em uma classe abstrata
    abstract fun tune()
}

abstract class StringInstrument (name: String): Instrument(name)

abstract class WindInstrument (name: String): Instrument(name)

class Guitar(name: String) : StringInstrument(name){
    override fun tune() {
        println("Tuning $name in E")
    }
}

class Fiddle(name: String) : StringInstrument(name){
    override fun tune(){
        println("Tuning $name in AM")
    }
}

class Flute(name: String) : WindInstrument(name){
    override fun tune(){
        println("Tuning $name in C")
    }
}