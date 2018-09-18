package threadDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Master extends Thread{
	Set<String> deck = new HashSet<String>();
	//String[] card = new String[13];	
	String card[] = {"2","3","4","5","6","7","8","9","10","A","J","K","Q"};
	String type[] = {"S","H","D","C"};
	static Set<String> s1 ;
	static Set<String> s2 ;
	Set<String> set1 = new HashSet<String>();
	Set<String> set2 = new HashSet<String>();
	static String show[] = new String[2];
	//Set<String> set3 = new HashSet<String>();
	//Set<String> set4 = new HashSet<String>();
	
	public void add(){
	//	System.out.println("Card Len: "+card.length+" type le"+type.length);
		for(int i=0;i<card.length;i++){
			for(int j=0;j<type.length;j++){
		//		System.out.println(card[i]+type[j]);
				deck.add(card[i]+type[j]);
			}
		}
	}
	
	public void distribute(){
		Iterator<String> it1 = deck.iterator();
		
		while(it1.hasNext()){
			set1.add(it1.next());
			set2.add(it1.next());
		//	set3.add(it1.next());
		//	set4.add(it1.next());
		}
		s1 = set1;
		s2 = set2;
	}
	
	public void game(){
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		System.out.println("Game start");
		p1.start();
		p2.start();
		
	}
	
	public void monitor(){
		System.out.println("Show: "+show[0] + " "+show[1]);
	}
}

class Player1 extends Master{	
	//run method does not return any;it  return only void; its say returntype is incompatible
	/*public String run(){
		return "sdf";
	}*/
	
	public void run() {
		System.out.println("P1 : "+s1);
		try{
			for(Iterator<String> i = s1.iterator();i.hasNext();){
				System.out.println("P1: "+i.next());
				show[0] = i.next();
				this.sleep(10);
			}			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Player2 extends Master{
	public void run(){
		try{
			for(Iterator<String> i = s2.iterator();i.hasNext();){
				System.out.println("P2: "+i.next());
				show[1] = i.next();
				this.sleep(10);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Player3 extends Master implements Runnable{
	public void run(){
		
	}
}
class Player4 extends Master implements Runnable{
	public void run(){
		
	}
}

public class Card {
	public static void main(String[] args) {
		Master master = new Master();
		master.add();
		System.out.println(master.deck);
		
		master.distribute();
	
		System.out.println(master.set1);
		System.out.println(master.set2);
		//System.out.println(master.set3);
		//System.out.println(master.set4);
		
		master.game();
		master.monitor();
	}
}
