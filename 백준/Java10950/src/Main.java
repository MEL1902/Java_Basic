//문제출처: https://www.acmicpc.net/problem/10950
// 스캐너와 for 문으로 간단히 조합하면 된다.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {   // for 문

            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a + b);

        }
    }
}
