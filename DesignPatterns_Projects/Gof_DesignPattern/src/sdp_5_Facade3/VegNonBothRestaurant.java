package sdp_5_Facade3;

public class VegNonBothRestaurant implements Hotel {
	public Menus getMenus() {
		Both b = new Both();
		return b;
	}
}
