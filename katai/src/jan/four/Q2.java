package jan.four;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2.10 개의 숫자를 입력받아 중복 된 숫자를 제외한 수를 출력하시오 
 * 
 * "<입력형식> 10 개의 수가 입력으로 주어진다. 각 수는 -10 이상 10 이하의 정수이다. "
 * 
 * 
 * "<출력형식> 단 한번 만 쓰인 숫자를 오름차순으로 출력한다."
 * 
 * 
 * 입력 예 : 1 2 3 3 5 2 7 1 8 9 
 * 출력 예 : 5 7 8 9
 * 
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 10개를 입력받을 배열
        int[] arr = new int[10];

        // 10번을 반복해서 입력받는다
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            // 배열에 입력된 값을 중복체크 하기 위핸 for문
            for (int j = i + 1; j < 10; j++) {
                // arr[i]가 임의의 숫자가 되면 바꿀 필요가 없음
                if (arr[i] == 99) {
                    continue;
                }
                // arr[i]의 배열과 arr[j]의 배열을 비교하여 값이 같으면 
                // 두 개의 값을 임의의 숫자로 지정하여 똑같이 만든다
                if (arr[i] == arr[j]) {
                    arr[i] = 99;
                    arr[j] = 99;
                    continue;
                }
            } // end for
        } // end for

        // 배열 정렬을 시킨다
        Arrays.sort(arr);

        for (int i = 0; i < 10; i++) {
            // 배열의 값이 임의의 숫자가 되면 출력을 하지 않는다. 그 수는 중복이기 때문
            if (arr[i] != 99) {
                System.out.print(arr[i] + " ");
            } 
        } // end for
        s.close();
    }
}
