package week2;

import java.util.Scanner;

public class Factorial {

	/**
	 * 재귀함수 
	 * @param num
	 * @return 
	 * @return
	 */
	public static int factorial(int num) {
		// num 인수값이 1보다 작으면 1을 리턴
		if (num <= 1) { //
			System.out.println(num + "! = " + num);
			
			return num; 
		} else {
			System.out.println(num + "! = " + num + " * " + (num - 1) + "!");
			return num * factorial(num - 1); 
		}

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 값을 입력받음
		int num = s.nextInt(); 

		System.out.println(factorial(num)); 

	}
}
