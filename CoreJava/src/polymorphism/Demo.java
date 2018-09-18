package polymorphism;

public class Demo {
	public static void main(String[] args) {
		
		/*
		// 1.  Static methods are attached to class and compiler converts reference variable to class name i.g. Shape.draw()
		Shape s = new Circle(); 
		s.draw(); // Shape
		*/		
		
		/*
		//3. Member variables cannot be overridden. In other words, Variables are resolved at compile-time and methods at run-time.
		Shape s = new Circle();
        System.out.println(s.name); // Shape
		*/
		
		
	}
}

/*
//1. call Shape s = new Circle(); s.draw();
class Shape{
    public static void draw(){
        System.out.println("Shape");
    }
}
 
class Circle extends Shape{
    public static void draw(){
        System.out.println("Circle");
    }
}*/

/*
//2. It will give compile-time time error saying 'This instance method cannot override the static method from Shape'.
class Shape{
    public static void draw(){
        System.out.println("Shape");
    }
}
 
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}*/


/*//3. Member variables cannot be overridden. In other words, Variables are resolved at compile-time and methods at run-time.
class Shape{
    String name = "Shape";
}
 
class Circle extends Shape{
    String name = "Circle";
}*/