package java8features;

public interface FunctionalInterfaceDemo1 {
	public abstract void method1();
	public abstract void method4();
}

@FunctionalInterface
interface FunctionalInterface2{
	public abstract void method2();
}

@FunctionalInterface
interface FunctionalInterface3{
	public abstract void method3();
}

@FunctionalInterface
interface FunctionalInterface4{
	public abstract void method4();
}

@FunctionalInterface
interface FunctionalInterface23 extends FunctionalInterface2{
	//public abstract void method3();
}

@FunctionalInterface
interface FunctionalInterface23 extends FunctionalInterface2{
	public abstract void method23();
}

@FunctionalInterface
interface FunctionalInterface34 extends FunctionalInterface3,FunctionalInterface4 {
	public default void method3(){}
}