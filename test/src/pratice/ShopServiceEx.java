package pratice;

public class ShopServiceEx {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getinstance();
		ShopService obj2 = ShopService.getinstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
			
		}
		

	}

}
