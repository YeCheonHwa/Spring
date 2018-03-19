package jan.four;

import java.util.Scanner;

/**
 * 3.동전교환
 * 
 * "동전 단위가 1원, 5원, 10원, 50원, 100원, 500원의 6단계로 이루어졌을때, 최소의 동전 개수로 잔돈 256원을 내주려면
 * 500원 0개, 100원 2개, 50원 1개, 5원 1개, 1원 1개로 해서 모두 5개의 동전이 필요하다. "
 * 
 * "동전 단위가 1원, 4원, 6원의 3단계로 이루어졌을때, 8원을 내주려면 6원 1개, 1원 2개도 가능하고, 4원 2개로 가능하다. 앞의
 * 경우에는 동전 3개, 뒤의 경우에는 동전이 2개 필요하다. 동전의 개수를 최소로 하면서 동전을 내주는 것이 목적이라면 뒤의 방법을 택해야
 * 한다. 동전의 단위들이 주어지고, 원하는 잔돈이 주어질 때, 그 잔돈에 맞추기 위해 필요한 최소의 동전 수를 구하시오. 갖고 있는 동전의
 * 수는 무한하다."
 * 
 * "<입력형식> 첫 줄은 동전의 단계 수 N(1≤N≤10), 둘째 줄은 N개로 이루어진 동전들의 단위들이며, 셋째 줄은 잔돈
 * W(1≤W≤64,000)을 나타낸다."
 * 
 * "<출력형식> 첫 줄에 잔돈을 맞추기 위한 최소의 동전 수를 출력한다. 만약 동전을 맞추기가 불가능한 경우는 ""impossible""을
 * 출력한다."
 * 
 * 
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // 동전의 단계 수
        System.out.println("동전 갯수 입력");
        int coinCount = s.nextInt();
        
        //동전갯수를 입력받아서 동전의 단위를 생성
        int[] coinLevel = new int[coinCount];
        // 동전의 단위
        System.out.println("동전의 단위");
        for (int i = 0; i < coinCount; i++) {
            coinLevel[i] = s.nextInt();
        }
        System.out.println("잔돈");
        int w = s.nextInt();
        if (w < 1 || w > 64000) {
            System.out.println("impossible");
            System.exit(0);
        }
        
        for (int i = 0; i < coinLevel.length; i++) {
         // 동전 단위가 하나일 때 
            if (coinLevel.length == 1) {
                // 잔돈을 나눴을 경우 0이 아니면 X
                if (w % coinLevel[0] != 0) {
                    System.out.println("impossible");
                }
            }
            // 
            if (i == coinLevel[i]) {
                   
            }
            // 
        }
    }
}
