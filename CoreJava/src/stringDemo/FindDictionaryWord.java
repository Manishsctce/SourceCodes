package stringDemo;

import java.util.HashMap;

/*
 * e.g. input: “programmerit”
		output: {{pro, gram, merit}, {program, merit}, {programmer, it}}
 */
public class FindDictionaryWord {

	public static HashMap<String,String> getDictionary()
	{
	    HashMap<String,String> hm=new HashMap<String,String>();
	    hm.put("a","a");
	    hm.put("it","it");
	    hm.put("am","am");
	    hm.put("ram","ram");
	    hm.put("pro","pro");
	    hm.put("grammer","grammer");
	    hm.put("program","program");
	    hm.put("programmer","programmer");
	    hm.put("me","me");
	    hm.put("merit","merit");
	    return hm;
	}
	  
	public static void findWords(String s, int length, String out)
	{
	    HashMap<String,String>hm = getDictionary();
	    for (int i=1; i <= length; i++)
	    {
	        String subwords = s.substring(0, i);
	        if (hm.containsKey(subwords))
	        {
	            if (i == length)
	            {
	                out = out + subwords;
	                System.out.println(out);
	                return;
	            }
	            findWords(s.substring(i,length), length-i, out+subwords+" ");
	        }
	    }
	}
	  
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s = "programmerit";
	    findWords(s,s.length(),"");
	}

}
