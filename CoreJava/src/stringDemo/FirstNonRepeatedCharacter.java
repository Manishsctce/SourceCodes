package stringDemo;
 import java.util.*;
 import java.util.Map.Entry;
//Find first non repeated character in the String with Example  
//Count number of times each alphabet appears in the String


public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String str;
		/*System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		str = scan.next();*/
		
		
		System.out.println("First Non Repeating character: "+ findFirstNonRepeatingChar("adfead"));
		System.out.println("First Non Repeating character: "+ getFirstNonRepeatedChar("12568125"));
		//System.out.println("Character Fequency count");
		//charFrequencyCount(str);
		
		System.out.println("Word Count : "+ wordCount("adfadfdef"));
		
	}

	static public Character findFirstNonRepeatingChar(String string){
		
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		Character c = null;
		for(int i=0;i<string.length();i++){
			c = string.charAt(i);
			if(hashMap.containsKey(c)){
				hashMap.put(c, hashMap.get(c)+1);
			}
			else
				hashMap.put(string.charAt(i), 1);
		}
		
		for(int i=0;i<string.length();i++){
			c = string.charAt(i);
			if(hashMap.get(c) == 1)
				return c;
			else
				c = null;
		}
		return c;
	}
	
	public static char getFirstNonRepeatedChar(String str) { 
		Map<Character,Integer> counts = new LinkedHashMap<>(str.length()); 
		for (char c : str.toCharArray()) { 
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); 
		} 
		for (Entry<Character,Integer> entry : counts.entrySet()) { 
			if (entry.getValue() == 1) { 
				return entry.getKey(); 
			} 
		} 
		throw new RuntimeException("didn't find any non repeated Character"); 
	}
	
	public static void charFrequencyCount(String string){
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		Character c = null;
		for(int i=0;i<string.length();i++){
			c = string.charAt(i);
			if(hashMap.containsKey(c)){
				hashMap.put(c, hashMap.get(c)+1);
			}
			else
				hashMap.put(string.charAt(i), 1);
		}
		
		Set <Entry<Character,Integer>>set = hashMap.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry<Character, Integer> mapEntry = (Entry<Character, Integer>) i.next();
			System.out.println(mapEntry.getKey() +" count: "+mapEntry.getValue());
		}
		
	}
	
	public static int wordCount(String string){
		int wordcount=0;
		System.out.print(string);
		for(int i=0;i<string.length();i++){
			
				if(string.charAt(i)==' '){		
					System.out.println("here");
					wordcount++;
				}
		}
		return wordcount;
	}
	
}
