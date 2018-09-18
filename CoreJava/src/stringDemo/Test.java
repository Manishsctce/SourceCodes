package stringDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {	
	public static void main(String[] args) {
		Set<String> deck = new HashSet<String>();
		//String[] card = new String[13];	
		String card[] = {"2","3","4","5","6","7","8","9","10","A","J","K","Q"};
		String type[] = {"S","H","D","C"};
		String temp1 = null;
		String temp2 = null;
		String temp4 = null;
		boolean flag = true;
		Set<String> set1 = new TreeSet<String>();
		Set<String> set2 = new TreeSet<String>();
		
		Set<String> p1 = new TreeSet<String>();
		Set<String> p2 = new TreeSet<String>();
		
		for(int i=0;i<card.length;i++){
			for(int j=0;j<type.length;j++){
				//		System.out.println(card[i]+type[j]);
				deck.add(card[i]+type[j]);
			}
		}
		Iterator<String> it1 = deck.iterator();		
		while(it1.hasNext()){
			set1.add(it1.next());
			set2.add(it1.next());
		}
		Set<String> set12 = new TreeSet<String>();
		set12 = set1;
		Set<String> set22 = new TreeSet<String>();
		set22 = set2;
		
		System.out.println(set12);
		System.out.println(set22);
		
		Iterator<String> i1 = set12.iterator();
		Iterator<String> i2 = set22.iterator();
		Set<String> temp3 = new HashSet<String>();
		while(i1.hasNext() && i2.hasNext()){
			temp1 = i1.next(); 
			temp3.add(temp1); 
			temp2 = i2.next(); 
			temp3.add(temp2); 
			int p = temp1.length();
			int q = temp2.length();

			if(flag){
				temp4 = temp2;
				flag = false;
			}
			if(temp1.charAt(temp1.length()-1)== temp4.charAt(temp4.length()-1)){
				System.out.println("P1: "+temp1+"\n"+"P2: "+temp2);
				p2.addAll(temp3); temp3 = null;
				
			}else if (temp1.charAt(temp1.length()-1) == temp4.charAt(temp4.length()-1)) {
				p1.addAll(temp3); temp3 = null;
				
			}else if (temp1.charAt(temp1.length()-1) == temp2.charAt(temp2.length()-1)) {
				p2.addAll(temp3); temp3 = null;
				
			}
			
			i1.remove();
			i2.remove();
		}
		
/*		Iterator<String> i1 = set1.iterator();
		Iterator<String> i2 = set2.iterator();
		while(i1.hasNext() && i2.hasNext()){
			temp1 = i1.next();
			temp2 = i2.next();
			int p = temp1.length();
			int q = temp2.length();
			System.out.println("temp1: "+temp1+" "+p+"\ntemp2: "+temp2+" "+q);
			System.out.println(temp1.charAt(p-1));
			System.out.println(temp2.charAt(q-1));			
			if(temp1.charAt(p-1)== temp2.charAt(q-1)){
				System.out.println("P1: "+temp1+"\n"+"P2: "+temp2);
			}
		}
*/	}
}
