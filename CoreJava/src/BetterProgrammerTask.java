public class BetterProgrammerTask {
    public static void sortIgnoringSpaces(String[] a) {
        /*
          Please implement this method to
          sort a given array of Strngs in alphabetical order
          ignoring spaces (' ' symbols) within the strings.
         */
    	String temp = null;
    	for(int i=0;i<a.length;i++){
    		for(int j=0;j<a[i].length();j++){
    			if (a[i].charAt(j)>a[i++].charAt(j)){
        			temp = a[i];
        			a[i] = a[j];
        			a[j] = temp;
        			break;
        		}    			
    		}    		
    	}    	    
    }
    public static void main(String a[]){
    	BetterProgrammerTask b = new BetterProgrammerTask();
    	String s[] = new String[4];
    	s[0] = "hello";
    	s[1] = "manish";    	
    	b.sortIgnoringSpaces(s);
    	for(int k=0;k<s.length;k++){
    		System.out.println(a[k]);
    	}
    }
}
