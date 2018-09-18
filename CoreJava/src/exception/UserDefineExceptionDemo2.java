package exception;
/*
 * If exception thrown then it is handle by most specific Exception handler i.e. if child class exception handle then it will be opt
 */

class Exc0 extends Exception { 
	public String toString(){
		return this.getClass().getName().toString();
	}
} 
class Exc1 extends Exc0 { 
	public String toString(){
		return this.getClass().getName().toString();
	}
} 
public class UserDefineExceptionDemo2
{  
    public static void main(String args[]) 
    { 
        try 
        {  
        	Exc1 ex = new Exc1();
            throw ex ;/* Line 9 */
        } 
        catch (Exc0 e0) /* Line 11 */
        {
            System.out.println(e0); //output 
        } 
        catch (Exception e) 
        {
            System.out.println("exception caught");  
        } 
    } 
}