package pratice;

public class CCC {

	public static void main(String[] args) {
		    // �ֹ��� ���� �޴� ����
		    Menu jjajang = new Menu("¥��", 4900);
		    Menu jjambbong = new Menu("«��", 5900);
		    Menu tangsook = new Menu("������", 13900);
		    
		    // �޴��� �����Ͽ� �ֹ��� ����
		    Menu[] menuArr = { jjajang, jjambbong, tangsook };
		    Order order = new Order(123, menuArr);
		    
		    // �ֹ� ��� ���
		    System.out.printf("�ֹ� �հ�: %d��\n", order.totalPrice());
		  }
		}

		class Order {
		  // �ʵ�(�ν��Ͻ� �ʵ�)
		  int orderNum;
		  Menu[] menus;
		  
		  // ������
		  public Order(int i, Menu[] arr) {
		    orderNum = i;
		    menus = arr;
		  }
		  
		  // �޼ҵ�(�ν��Ͻ� �޼ҵ�)
		  public int totalPrice() {
			  int sum = 0;
		    for(int i=0; i<menus.length;i++){
		       sum += menus[i].price;
		    }
		    /* 1. ��� �ֹ� �޴��� ������ ��ȯ�ϼ���. */
		    return sum ;
		  }
		}

		class Menu {
		  // �ʵ�
		  String name;
		  int price;
		  
		  // ������
		  public Menu(String str, int i) {
		    name = str;
		    price = i;
		  }
		}