package week2;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[200]; // 문자담을거
		int cnt[] = new int[200]; // 카운트 담을거
		int temp = 0;
		int j = 0;
		int count = 0;

		do {
			System.out.print("문자열을 입력 하세요 : ");
			String word = scan.nextLine();
			if (word.equals("END")) {
				for (int i = 0; i < temp; i++) {
					System.out.println(arr[i] + ":" + cnt[i]);
				}
				break;
			}

			String[] st = word.split(" "); // 짜르기
			for (int i = 0; i < st.length; i++) {

				String compare = st[i]; // 비교를 위해 처음부터 돌면서 담아줌
				for (j = 0; j < temp; j++) {
					if (compare.equals(arr[j])) { // 같은것이 있으면
						System.out.println("arr[i]"+arr[j]);
						System.out.println("st[i]"+st[i]);
						break; // 빠져나옴
					}
				}
				if (j < temp) { // j가 temp보다 작을때
					cnt[j]++; // count 증가
					System.out.println(j);
				}
				if (temp == 0 || j == temp) {
					System.out.println("cntt"+cnt[temp]);
					cnt[temp] = 1;
					System.out.println("cnttt"+cnt[1]);
					arr[temp] = compare;
					System.out.println("compare"+compare);
					temp++;
					System.out.println("temp="+temp);
				}

			}
			count++;
			if (count == 30) {
				for (int i = 0; i < temp; i++) {
					System.out.println(temp);
					System.out.println(arr[i] + ":" + cnt[i]);
				}
				break;
			}
		} while (count < 30);

	}

}