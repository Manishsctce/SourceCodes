package threadDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Doctor implements Runnable{
	Vector<Patient> que = new Vector(5);
	private String name;
	private String specialist;
	Patient patient ;
	boolean flag = false;
	
	Doctor(){}
	Doctor(String str){
		this.name = str;
	}
	Doctor(String name, String specialist){
		this.name = name;
		this.specialist = specialist;
	}
	public void run(){
		try {
			checkup();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public void checkup() throws InterruptedException{
		if(que.size()==0)
			System.out.println("No Patient");
		
		if(flag)
			wait();
		else{
			patient = que.firstElement();
			System.out.println("Doctor is checking patient "+patient.patientName);
			Thread.sleep(2000);
			flag=true;
			notify();
		}	
	}
	
	synchronized public void done() throws InterruptedException{
		if(!flag)
			wait();
		else{			
			System.out.println("Doctor has done with patient "+patient.patientName);
			que.remove(patient.patientName);
			Thread.sleep(2000);
			flag = false;
			notify();
		}		
	}
}

class Patient implements Runnable{
	String patientName;
	Doctor d;
	Patient(String name,Doctor d){
		patientName = name;
		this.d = d;
	}
	
	public void run(){
		try {
			d.done();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class DoctorPatientDemo {
	static List<Doctor> doctorList = new ArrayList<Doctor>();
	static Doctor doc1 = new Doctor("Dr. Mashoor Gulati(Sunil Grover)","Physician");
	static int counter = 0;
	public static void main(String[] args) {
		doctorList.add(doc1);
		String op = "Y";
			do{
				System.out.println("Choose your choice"
						+ "\n 1. Register Patient name"
						+ "\n 2. Check List "
						+ "\n 3. quit");
				int ch = new Scanner(System.in).nextInt();
				switch (ch) {
				case 1:		
					System.out.println("Enter Name:");
					String name = new Scanner(System.in).nextLine();
					registerPatient(name);
					break;
				case 2:	
					checkList();
					break;
				case 3:
					op = "N";
					break;
				default:
					break;
				}
			}while(op.equalsIgnoreCase("Y"));
			//System.out.println("Doctor has done for the day");		
	}
	
	public static void registerPatient(String name){
		Patient p = new Patient(name,doctor);
		if(counter!=3){
			//que.add(p);
			doctor.que.add(p);
			counter++;
			
			Doctor doctor = new Doctor();
			Thread t1 = new Thread(d);
			t1.start();
			
			Thread t2 = new Thread(p);
			t2.start();
		}else{
			System.out.println("Queue is full!!");
		}
	}
	
	public static void checkList(){
		System.out.println("Enter Type of specialist:");
		String type = new Scanner(System.in).nextLine();
		for(Doctor doc : doctorList){
			doc.
		}
	}
}
