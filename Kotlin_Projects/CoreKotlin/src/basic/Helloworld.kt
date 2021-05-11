package basic

class Hello(val name:String) {
	fun greet(){
		println("Hello $name")
	}
}

fun main(args:Array<String>){
	val hiManish = Hello("Manish")
	hiManish.greet()
}