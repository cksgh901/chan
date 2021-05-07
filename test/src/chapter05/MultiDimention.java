package chapter05;

public class MultiDimention {

	public static void main(String[] args) {
		int [][] scores = new int [2][3];
		
		//1.2.3
		//4.5.6
		
		scores [0][0] = 1;
		scores [0][1] = 2;
		scores [0][2] = 3;
		scores [1][0] = 4;
		scores [1][1] = 5;
		scores [1][2] = 6;
		
		// 길이가 3인 벼열이 2개
		System.out.println(scores.length);
		
		// 2차원ㅂ 배열 -> 배열안에 배열
		int[] test = scores[0];
		for (int i = 0; i< test.length ; i++) {
			System.out.println(i);
		}
		
		// 2차원 배열의 모든 값 출력
		for(int i=0 ; i<scores.length;i++) {//행의 길이 만큼 반복
			for(int j =0; j<scores[i].length;j++) {// 열의 길이 반큼 반복
				System.out.println(scores[i][j]);
				
			}
		}
		
		int[][][] td = new int [3][3][3];
		int val = 1;
		for (int i =0;i<td.length;i++) {
			for (int j =0 ; j<td[i].length; j++) {
				for (int k =0;k<td[i][j].length; k++) {
					td[i][j][k] = val;
							val++;
							System.out.print(td[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		//2차원 배열을 값으로 초기화
		int[][] ages = {{10,20},{40,50,60},{70,80,90}};
		System.out.println(ages[0].length);
		System.out.println(ages[1].length);
		System.out.println(ages[2].length);
		System.out.println(ages[1][2]);
		
		for (int i =0 ; i<ages.length; i++) {
			for(int j = 0 ; j< ages[i].length; j++) {
				System.out.println(ages[i][j]);
			}
			
		}

	}

}
