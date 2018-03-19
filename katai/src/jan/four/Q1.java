package jan.four;

import java.util.Scanner;

/**
 * 
 * 1.원하는 구구단의 범위를 입력받아 해당 구간의 구구단을 출력하기
 * 
 * (1) 구간의 처음과 끝을 입력받는다. (2) 입력된 구간은 반드시 처음 입력 값이 끝의 입력 값보다 작아야 하는 것은 아니다. 즉 입력된
 * 구간의 범위는 증가하거나 감소하는 순서 그대로 출력되어야 한다."
 * 
 * 
 * "구구단의 시작 범위 s,와 끝 범위 e를 입력받는다. (s와 e는 2부터 9사이의 정수)"
 * 
 * 
 * "데이터의 크기가 주어진 범위를 벗어날 경우는 ""INPUT ERROR!""를 출력하고 s와 e를 다시 입력받는다. 하나의 결과가 출력되면
 * 프로그램을 종료한다. "
 *
 */
public class Q1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 시작 범위와 끝 범위를 입력한다
        int start = scan.nextInt();
        int end = scan.nextInt();

        // 범위를 벗어날 경우의 조건을 입력한다
        if (start < 2 || start > 10 || end < 2 || end > 10) {
            System.out.println("INPUT ERROR");
        } else {
            if (start < end) {
                // 시작 범위가 끝 범위보다 작을 때
                for (int i = start; i <= end; i++) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.println(i + " * " + j + " = " + i * j);
                    } // end for
                    System.out.println();
                } // end for
            } else if (start > end) {
                // 시작 범위가 끝 범위보다 클 때 
                for (int i = start; i >= end; i--) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.println(i + " * " + j + " = " + i * j);
                    }
                    System.out.println();
                } // end for
            } // end if
        } // end if
        scan.close();
    }
}
