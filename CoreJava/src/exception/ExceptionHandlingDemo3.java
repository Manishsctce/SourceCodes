package exception;

import java.io.IOException;

/* FINALLY BLOCK
 * if the any exception occur in finally block and it is not catch then it is ignore
 */
public class ExceptionHandlingDemo3 
{  
    public static void aMethod() //throws IOException, ClassNotFoundException, Exception 
    {
        try /* Line 5 */
        {
            //throw new Exception(); /* Line 7 */
        } 
        finally /* Line 9 */
        {
            System.out.println("finally block "); /* Line 11 */
            //throw new Exception();
            throw new RuntimeException();
        } 
    } 
    public static void main(String args[]) 
    {
    	
    	aMethod();
        /*try 
        {
            aMethod();  
        } 
        catch (Exception e)  Line 20 
        {
            System.out.println("exception "); 
        } */
        System.out.println("finished"); /* Line 24 */
    } 
}