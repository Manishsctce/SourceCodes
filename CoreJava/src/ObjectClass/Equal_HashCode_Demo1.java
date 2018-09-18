package ObjectClass;

import java.math.BigDecimal;

public class Equal_HashCode_Demo1 {

	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal(200.0);
		BigDecimal bd2 = new BigDecimal(200.00);
		
		System.out.println(bd1.equals(bd2));		
		
		class Pojo{
			String name ;
			Pojo(){} 
			Pojo(String name){
				this.name = name;
			}
			public void setName(String name){
				this.name = name;
			}
			public String getName(){
				return name;
			}
		}
		Pojo p1 = new Pojo("Manish");
		Pojo p2 = new Pojo("Manish");
		System.out.println(p1.equals(p2));
	}

}
