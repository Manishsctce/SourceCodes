package sdp_5_Facade3;

public class VegRestaurant implements Hotel {
	public Menus getMenus() {
		VegMenu v = new VegMenu();
		return v;
	}
}