package interfaceDemo;
interface Sample{
	public void sample1();
	public boolean equals(Object obj);
}
public class SampleClass {

	Sample anonyObj = new Sample(){
		public void sample1(){
			System.out.println("Sample1");
		}
	};

}
