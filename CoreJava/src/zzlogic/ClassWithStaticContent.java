package zzlogic;

public class ClassWithStaticContent {
	public static final float PI=3.14f;
	
	public static int addIntergers(int...is){
		int finalValue = 0;
		for(int i:is){
			finalValue+=i;
		}
		return finalValue;
	}
	
	protected static float addFloats(float...fs){
		float finalValue = 0;
		for(float f :fs){
			finalValue+=f;
		}
		return finalValue;
	}
	
	public static class InnerStaticClass{
		String str = "Inner Static Class";
		public String toString(){
			return str;
		}
	}
}
