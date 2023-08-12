//문제출처 :https://www.acmicpc.net/problem/2739
// 구구단 만드는 예제는 for 문을 써서 반복되는 계산을 해주면 된다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();


        for(int i = 1; i<10; i++) {  // for문 구문
            System.out.println(a + " * " + i + " = " +  (a*i));
        }
    }
}
