package week1;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 1. 임의의 문장을 입력받아 각 단어별로 나눈 후에 단어들의 중복되는 개수를 구하는 프로그램을 작성하시오
 * 
 * 
 * "<처리조건> (1) 입력된 스트링은 글자의 제한은 없다. 즉 공백이나 ', ' 등도 입력으로 들어 올 수 있다. (2) 입력된 문장에서
 * 각 단어사이의 구분은 공백으로 한다. (3) 단어에는 공백을 제외한 단어들만이 포함된다."
 * 
 * 
 * "<입력형식> 임의의 문장을 입력받는다.(문장의 길이는 200 이하) 하나의 결과가 나온 후에도 계속 새로운 입력을 받다가,
 * ""END""가 입력되면 프로그램을 종료한다. (문장의 개수를 30을 넘지 않는다.)"
 * 
 * 
 * 
 * "<출력형식> 각 단어들의 발생 빈도를 사전순으로 출력한다."
 * 
 * 
 * 입력 예 : I AM DOG DOG DOG DOG A AM I I AM OLYMPIAD JUNGOL JUNGOL OLYMPIAD END
 * 
 * 출력 예 : A : 1 AM : 2 DOG : 4 I : 2 AM : 1 I : 1 JUNGOL : 2 OLYMPIAD : 2
 * 
 * @author MY-com
 *
 */
public class map {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String s = scan.nextLine();

            if (s.equals("END")) {
                break;
            }

            String[] arr = s.split(" ");

            Map<String, Integer> map = new TreeMap<>();

            int l = arr.length;

            for (int i = 0; i < l; i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String k = it.next();
                System.out.println(k + " : " + map.get(k));
            }
        }
        scan.close();
    }
}
