package java5Features;

public class EnumDemo1 {
	enum Currency implements Runnable{ 
		PENNY(1) {
	        public String color() {
	          return "copper";
	        }
	    },NICKLE(5) {
	        public String color() {
	                return "bronze";
	        }
	    },DIME(10) {
	        public String color() {
	                return "silver";
	        }
	    },QUARTER(25) {
	        public String color() {
	                return "silver";
	        }
	    };
	    private int value;
	    public abstract String color();
	    private Currency(int value) {
	            this.value = value;
	    }
		
		public String toString(){
			switch(this){
				case PENNY:
					System.out.println("Penny value is " + value+ this.color());
					break;
				case NICKLE:
					System.out.println("Nickle value is " + value+ this.color());
					break;
				case DIME:
					System.out.println("Dime value is "+ value+ this.color());
					break;
				case QUARTER:
					System.out.println("Quarter value is "+value + this.color());
					break;				
			}
			return super.toString();
		}
		
		public void run() {
			  System.out.println("Enum in Java implement interfaces "+this);
		}
	};
	public static void main(String[] args) {		
		Thread t = new Thread(Currency.DIME);
		t.start();
		
		System.out.println("##"+Currency.DIME);
		
	}

}
