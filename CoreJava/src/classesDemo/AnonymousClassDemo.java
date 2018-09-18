package classesDemo;

interface HelloWorld {
    public void greet();
    public void greetSomeone(String someone);
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		
		//ANONYMOUS CLASS
		HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
      //ANONYMOUS CLASS
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
	}

}
