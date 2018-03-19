package week1;

import java.util.Scanner;

public class square {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("높이를 입력하세요");
		int width = scan.nextInt(); // 세로 입력
		System.out.println("너비를 입력하세요");
		int height = scan.nextInt(); // 가로 입력

		int num = 1; // 숫자를 출력하기 위한 변수 선언

		for (int i = 0; i < width; i++) {	// width 입력한 숫자만큼 for문이 실행
 			if (i % 2 == 0) { 				// 나머지가 0일 때 출력하는 if문
				num = height * i + 1;		// 0 * 5 + 1, width * height가 나오는 숫자이므로 1을 더함
				for (int j = 0; j < height; j++) { // 가로를 입력한 만큼 반복 
					System.out.print(num++ + " "); // num에서 1을 더하면서 출력시킨다
				}
			} else if (i % 2 != 0) { 	// 나머지가 0이 아닐 때 출력하는 if문
				num = (i + 1) * height; // 출력선수가 역순이므로 먼저 마지막 값을 만들어준다
				for (int j = 0; j < height; j++) { 
					System.out.print(num-- + " "); // num에서 -1을 빼면서 출력시킨다
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
