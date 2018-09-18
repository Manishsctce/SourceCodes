package polymorphism;
/*Difference between Over-Riding and Over-Loading 
 *  Over
*/
abstract class Animal{  
	void eat(){System.out.println("animal is eating...");}  
	void eat(String str){
		System.out.println("Animal is eating "+str);
	}

}  

class Dog extends Animal{  
	void eat(){System.out.println("dog is eating...");}
	void eat(String str){
		System.out.println("Dog is eating "+str);
	}
	void eat(String str1, String str2){
		System.out.println("Animal eats "+str1+" and "+str2);
	}
}  

class BabyDog extends Dog{  
	public static void main(String args[]){  
		//Animal animal = null;
		Animal a=new BabyDog();  
		a.eat();  //based on obj, method will call
		
		/*Overloaded method can call by Reference only*/
		//if we donot declare eat(String str) in Animal class then below will throw compilation error
		a.eat("flesh");
		a = (Dog)a;
		//a.eat("milk","bread");//Animal eat(String) not applicable for eat(String,String)
		Dog dog = null;
		dog = (Dog)a;//if this does declare then java.lang.NullPointerException
		dog.eat("milk","bread");
		
		Dog d = new Dog();
		d.eat("a", "b");
		
		//Animal a2 = new Dog();
		
	}
} 