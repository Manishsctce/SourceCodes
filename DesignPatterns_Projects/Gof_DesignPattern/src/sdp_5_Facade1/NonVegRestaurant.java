package sdp_5_Facade1;

public class NonVegRestaurant implements Hotel {
	public Menus getMenus() {
		NonVegMenu nv = new NonVegMenu();
		return nv;
	}
}
