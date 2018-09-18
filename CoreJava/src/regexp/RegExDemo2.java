package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2 {
	public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";
	
	public static void main(String[] args) {
		String appName = "..\\.%%application.mlajdf2342123490q/ad.//adfan1%%.\\_adfa%%application.aa_dfadf%%adsfa9kladf.log";
		Pattern p = Pattern.compile("%%(.*?)%%");
		System.out.println("Regex Match: "+appName.matches(".*%%(.*)%%.*"));
		System.out.println("##1: "+Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
		System.out.println("Befor Replace: "+appName);
		Matcher matc = p.matcher(appName);
		String strToreplace = null;
		if(Pattern.matches(".*%%(.*?)%%.*", appName)){
			while(matc.find()){
				strToreplace = matc.group(1);
				//appName = appName.replaceAll("%%(.*?)%%", "HEY");
				appName = appName.replaceAll("%%"+strToreplace+"%%", "HEY");
				System.out.println("After Replace: "+appName);
			}
				
				//System.out.println("Value: "+);
		}
		
		
		/*String str = "ZZZZL <%= dsn %> AFFF <%= AFG %>";
		Pattern pattern = Pattern.compile("<%=(.*?)%>");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
		    System.out.println(matcher.group(1));
		}
		*/
		
		
		
		/*Pattern pattern = Pattern.compile("\\w+");
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);
        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
        // now create a new pattern and matcher to replace whitespace with tabs
        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
        System.out.println(matcher2.replaceAll("\t"));*/
	}
}
