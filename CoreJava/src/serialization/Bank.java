package serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;

public class Bank {

	public static void main(String[] args) {
		final int a;
		//int cif_id;
		List <Customer>custList = new ArrayList<Customer>();
		//Customer customer[] = new Customer[custList.size()];
		
		Customer cust1 = new Customer("Manish Agrawal", "Pune, India", 411057);
		//cust1.customerInfo();
		
		SavingAccount sba1 = new SavingAccount(cust1, 15000);
		sba1.accountInfo();
//		sba1.balanceEnquiry();
//		sba1.deposit(1400);
//		sba1.withdraw(1200);

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("SavingAccount.txt");//for writing streams of raw bytes such as image date; FileWriter for character
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(sba1);
			objectOutputStream.flush();
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}


		
		Customer cust2 = new Customer("Jenny","Arizona, USA",86016);
		//cust2.customerInfo();
		CurrentAccount oda1 = new CurrentAccount(cust2 , 500, 2000);
		oda1.accountInfo();
		
		
		Customer cust3 = new Customer("Catherine","Los Angeles, California, USA",90003);
		CurrentAccount oda2 = new CurrentAccount(cust3,1000, 5000);
		oda2.accountInfo();
		
		//Deserialization
		System.out.println("********************Deserializing******************************");
		/*FileInputStream fileInputStream;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream("SavingAccount.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);		
			Account acct = (Account)objectInputStream.readObject();
			acct.accountInfo();
			System.out.println("Deserialized Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				objectInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
	/*	while(objectInputStream.read() != -1){
			System.out.println();
		}*/
	}

}
