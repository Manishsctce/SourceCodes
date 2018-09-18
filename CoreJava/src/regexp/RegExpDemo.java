package regexp;
/*A regular expression is a special sequence of characters that helps you match or find other strings or sets of strings, 
* using a specialized syntax held in a pattern. Only 3 class and 1 interface 
*/
import java.util.regex.Pattern;//represent regexp Class doesn't hv public constr. 
import java.util.regex.Matcher;//matcher class obj is d engine that interpret pattern and perform match oper against input string. No pub const. use matcher()
import java.util.regex.MatchResult;//
import java.util.regex.PatternSyntaxException;

public class RegExpDemo {
	public static void main(String[] args) {
	    // String to be scanned to find the pattern.
	      String line1 = "This order was placed  for QT3000! OK?.";
	      String line2 = "My date of birth is 22/12/1988";
	      String line3 = "Hello";	      
	      String line4 = new String("Manish Agrawal");
	      String line5 = "28 2 Chainz Feat.Pharrell Williams - Feds Watching - (www.SongsLover.com)";
	      String line6 = "2999 Ciara - Body Party - (www.SongsLover.com)";
	      String lines[] = new String[]{line1,line2,line3,line4,line5,line6};
	      
	      
	      String pattern1 = ".";//Matches any character
	      String pattern2 = "^T";//Begin with T
	      String pattern3 = "^[TM]";//begin with either T or M
	      String pattern4 = "^[^TM]";//When a caret appears as the first character inside square brackets, it negates the pattern. This can match any character except T or M.
	      String pattern5 = "\\d";//have any digit
	      String pattern6 = "^[0-9]*(\\s)";//start with digits and space
	      
	      
	      //choose any pattern and run
	      Pattern regexp = Pattern.compile(pattern6);
	      
	      for(String line : lines){
	    	  Matcher match = regexp.matcher(line);	    	  
	    	  
	    	  if(match.find()){
	    		  System.out.println( match.replaceAll(""));
	    	  }
	    	  else{
	    		  System.out.println(line);  
	    	  }
	      }
	      
	}

}
