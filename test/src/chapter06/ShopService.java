package chapter06;

public class ShopService {
	private static ShopService instance = new ShopService();
	
	private ShopService(){}
	
	public static ShopService getinstance() {
		return instance;
	}
	

}
