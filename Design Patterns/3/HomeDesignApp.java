public class HomeDesignApp {
public static void main(String[] args) {
		
		HomeDesign houseType = new CementHouse();
		System.out.println("CementHouse");
		houseType.buildHouse();
		
		
		houseType = new BrickHouse();
		System.out.println("BrickHouse");
		houseType.buildHouse();
	}
}