package week2;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[100]; // 문자 저장위치
		int cnt[] = new int[100]; // 문자 개수 저장위치
		int count = 0; // 문장 개수 카운트
		int arrcount = 0; // 문자 저장하기 위한 배열의 입력받을 임의의 수
		int cntcount = 0; // 문자 개수 카운트를 위한 임의의 수

		while (count < 30) {	// 문장 개수가 30개 미만일 때 반복
			System.out.print("문자열을 입력 하세요 : ");
			String s = scan.nextLine();	// 문장 입력 받음
			if (s.length() > 200) {	// 문장 길이 제한하고 처음으로 돌아감
				System.out.println("문장의 길이가 200 이상입니다");
				continue;
			}
			if (s.equals("END")) {
				for (int i = 0; i < arrcount; i++) {	// END를 입력했을 경우 종료
					System.out.println(arr[i] + ":" + cnt[i]);
				}
				break;
			}
			// 띄어쓰기로 글을 자름
			String[] str = s.split(" "); 
			Arrays.sort(str);
			for (int i = 0; i < str.length; i++) {
				
				System.out.println(i + ":" + str[i]);
				
			}
			count++;
		}
		for (int i = 0; i < arrcount; i++) {
			System.out.println(arr[i] + ":" + cnt[i]);
		}
	}
}