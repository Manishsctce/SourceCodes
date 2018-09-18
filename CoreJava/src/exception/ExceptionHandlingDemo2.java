package exception;
/* flow of execution when exception occur and handled  
 * 
 */
public class ExceptionHandlingDemo2 
{  
    public static void main(String [] args) 
    {
        /*try 
        {
            badMethod();  
            System.out.print("A");  
        } 
        catch (RuntimeException ex)  Line 10 
        { 
            System.out.print("B"); 
        } 
        catch (Exception ex1) 
        { 
            System.out.print("C"); 
        } 
        finally 
        {
            System.out.print("D"); 
        } */
        badMethod();
        System.out.print("E"); 
    } 
    public static void badMethod() 
    { 
        throw new RuntimeException(); 
    } 
}

//BDE