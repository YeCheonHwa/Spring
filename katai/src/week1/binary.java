package week1;

import java.util.Scanner;

public class binary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0; // 배열에 쓰일 변수값을 선언

        System.out.println("변환할 숫자를 입력하세요");

        int n = scan.nextInt();

        int[] binary = new int[16]; // 입력받은 이진수를 출력받기 위한 배열 선언

        while (n != 1) { // 1이 남으면 이진수가 끝나기 때문에 그 전까지 반복한다
            binary[i++] = n % 2; // 2로 나눈 나머지를 배열에 저장하고 1씩 증가시켜준다
            n = n / 2; // 2로 나눈 몫을 n에 다시 저장한다
        }
        binary[i] = n; // while문이 끝나고 나온 n값을 i값에 입력한다

        System.out.println("2진수로 변환된 숫자");
        for (int j = i; j >= 0; --j) {
            // 2진수는 값을 역순으로 출력을 해야 하기 때문에
            // 배열의 마지막 값을 시작값에 입력하고 하나씩 줄여가면서 출력한다
            System.out.print(binary[j]);
        }
        scan.close();
    }
}
