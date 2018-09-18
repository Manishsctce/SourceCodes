package polymorphism;

class Bike{  
	int speedlimit=90;  
}  

class Honda extends Bike{  
	int speedlimit=150;  

	public static void main(String args[]){  
		Bike obj=new Honda();
		//here data member is not inheritting so parent class reference always call parent member variable
		System.out.println(obj.speedlimit);//90  
		Honda h = new Honda();
		System.out.println(h.speedlimit);//150
	}
}