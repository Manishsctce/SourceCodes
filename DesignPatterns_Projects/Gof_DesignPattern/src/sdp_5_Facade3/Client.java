package sdp_5_Facade3;

public class Client {
	public static void main(String[] args) {
		HotelKeeper keeper = new HotelKeeper();

		VegMenu v = keeper.getVegMenu();
		v.showMenu();
		
		NonVegMenu nv = keeper.getNonVegMenu();
		nv.showMenu();
		
		Both both= keeper.getVegNonMenu();
		both.showMenu();
		
	}
}