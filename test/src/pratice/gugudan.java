package pratice;

public class gugudan {

	public static void main(String[] args) {
		gugudan();
	}
		public static void gugudan() {
			for(int i = 2 ; i<=9;i++) {
				gugudan1(i);
		}
		}
		public static void gugudan1(int dan) {
			for(int j = 1; j<= 9 ; j++) {
				System.out.printf("\t");
				System.out.printf("%d x %d = %d \n",dan,j,dan*j);
			}
		

	}

}
