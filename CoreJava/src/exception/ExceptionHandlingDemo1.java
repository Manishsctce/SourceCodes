package exception;
/* Error cannot be handle by  try-catch block using exception
 * But it can be handle while catching Throwable that is not a best practice
 */
public class ExceptionHandlingDemo1 
{  
    public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {  System.out.print("B"); }
        catch (Throwable e) {
        	System.out.println("Throwable");
		}
        finally 
        {
            System.out.print("C"); 
            
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() //if this method is non-static then throw error cannot make static ref to non-static method
    {
        throw new Error(); /* Line 22 */
    } 
}
//C is printed before exiting with an error message.

/*Error is thrown but not recognised line(22) because the only catch attempts to catch an Exception 
 * and Exception is not a superclass of Error. Therefore only the code in the finally statement can be run before exiting 
 * with a runtime error (Exception in thread "main" java.lang.Error).
 */