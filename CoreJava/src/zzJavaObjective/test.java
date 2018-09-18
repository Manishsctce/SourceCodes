package zzJavaObjective;

import java.util.HashMap;
import java.util.Map;

public class test {

	
	public static void main(String[] args) {
			System.out.println("solu:"+solution("A9283", "KA2T4"));//

	}
	public static int solution(String A, String B) {
    	Map<String,Integer> cardMap = new HashMap<>();
	    cardMap.put("A",new Integer(13));
	    cardMap.put("K",new Integer(12));
	    cardMap.put("Q",new Integer(11));
	    cardMap.put("J",new Integer(10));
	    cardMap.put("T",new Integer(9));
	    cardMap.put("9",new Integer(8));
	    cardMap.put("8",new Integer(7));;
	    cardMap.put("7",new Integer(6));
	    cardMap.put("6",new Integer(5));
	    cardMap.put("5",new Integer(4));
	    cardMap.put("4",new Integer(3));
	    cardMap.put("3",new Integer(2));
	    cardMap.put("2",new Integer(1));
	    
        int alexCount=0, bobCount=0;
        
        if((A==null||B==null) && (A.isEmpty() || B.isEmpty()))
            return 0;
        
        if(A.length() != B.length()){
            return 0;
        }    
        
        for(int i=0;i<A.length();i++){
            if(cardMap.get(String.valueOf(A.charAt(i))) > cardMap.get(String.valueOf(B.charAt(i)))) {
                alexCount++;
            }else if(cardMap.get(String.valueOf(A.charAt(i))) < cardMap.get(String.valueOf(B.charAt(i)))){
                bobCount++;
            }                       
        }
        return (alexCount>bobCount)?alexCount:bobCount;
    }
}
