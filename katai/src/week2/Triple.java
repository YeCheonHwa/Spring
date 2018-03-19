package week2;

import java.util.Scanner;

public class Triple {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int size = s.nextInt(); // 사이즈를 입력
		int type = s.nextInt(); // 삼각형 타입 입력

		if (size < 0 || size > 100) { // 사이즈 값이 맞지 않을 때
			System.out.println("INPUT ERROR");
		} else {
			switch (type) {
			case 1:
				for (int i = 0; i < size; i++) { // 높이
					for (int j = 0; j < i + 1; j++) { // 높이의 갯수만큼 별 출력
						System.out.print("*"); // 별 출력
					}
					System.out.println();
				}
				break;
			case 2:
				for (int i = size; i > 0; i--) { // 높이, 입력받은 숫자부터 하나씩 줄임
					for (int j = 0; j < i; j++) { // i가 바뀔 때마다 하나씩 줄여가며 별 출력
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 3:
				for (int i = 1; i <= size; i++) { // 높이
					for (int j = i; j < size; j++) { // 높이-1만큼 공백을 먼저 출력시킨다.
						System.out.print(" "); 
					}
					for (int k = 0; k < (i * 2) - 1; k++) { // 줄 수*2-1만큼 별을 출력한다
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("INPUT ERROR");
			}
		}
	}
}
