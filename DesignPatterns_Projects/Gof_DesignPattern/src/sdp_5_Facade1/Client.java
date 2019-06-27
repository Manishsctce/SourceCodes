package sdp_5_Facade1;

public class Client {
	public static void main(String[] args) {
		HotelKeeper keeper = new HotelKeeper();

		VegMenu v = keeper.getVegMenu();
		NonVegMenu nv = keeper.getNonVegMenu();
		Both = keeper.getVegNonMenu();

	}
}