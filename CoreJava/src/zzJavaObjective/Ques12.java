package zzJavaObjective;

public class Ques12 {

	public static void main(String[] args) {
		class A{
			int x =10;
			void print(){
				System.out.println("In A:"+x);
			}
		}
		class B extends A{
			int x = 20;		
			void print(){
				System.out.println(x);
			}
		}

		A a = new B();
		System.out.println(a.x);
		a.print();
	}

}
