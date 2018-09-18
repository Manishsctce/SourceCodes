package wrapperClass;

public class WrapperClassDemo1 {
	public static void main(String[] args) {
		String str;
		Character charObj1 = Character.valueOf('a');
		Boolean bolObj1 = Boolean.valueOf("Hello");//false
		
		Byte byteObj1 = Byte.valueOf("023");
		Short shortObj1 = 332323/100;//Short.valueOf("he");//NumberFormatException
		Integer intObj1 = Integer.valueOf("125",7);//???
		Long longObj1;
		
		Float floatObj1;
		Double doubleObj1;
		
		System.out.println("Character: "+ charObj1+"  Boolean: "+bolObj1);
		System.out.println("Byte: "+byteObj1+" Short: "+shortObj1);
		System.out.println("Integer: "+intObj1);

	}

}
