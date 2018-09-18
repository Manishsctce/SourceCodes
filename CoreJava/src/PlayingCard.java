import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class PlayingCard {

	public static void main(String[] args) {
		Set<String> deck = new HashSet<String>();
		//String[] card = new String[13];	
		String card[] = {"2","3","4","5","6","7","8","9","10","A","J","K","Q"};
		String type[] = {"S","H","D","C"};
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		//static String show[] = new String[2];
		String temp1 = null;
		String temp2 = null;
		boolean flag = false;

		for(int i=0;i<card.length;i++){
			for(int j=0;j<type.length;j++){
				//		System.out.println(card[i]+type[j]);
				deck.add(card[i]+type[j]);
			}
		}
		//System.out.println(deck);
		Iterator<String> it1 = deck.iterator();		
		while(it1.hasNext()){
			set1.add(it1.next());
			set2.add(it1.next());
		}
		System.out.println(set1);
		System.out.println(set2);
		
		Iterator<String> i1 = set1.iterator();
		Iterator<String> i2 = set2.iterator();
		
		while(i1.hasNext()){				
			temp1 = i1.next();
			flag = true;
			System.out.println(i1.next());				
			while(i2.hasNext()){
					while(flag){
						temp2 = i2.next();
						System.out.println(i1.next());
						flag = false;
						System.out.println(i1.hasNext());
						
						
						
					}
				}
				
			}
		 
		}
}
