package classesTypes

sealed class SealClassTest1 {
	
	open fun sealClassMethod1():String{
 		return "Sealed Class method1"
	}
	
	class SealedClassType1:SealClassTest1(){
		// We can override sealed class function
		override fun sealClassMethod1():String{
			return "SealedClassType1 override method"
		}
	}
}

class SealedClassTypeInSameFile : SealClassTest1(){
	
}