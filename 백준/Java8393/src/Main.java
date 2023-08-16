//문제출처: https://www.acmicpc.net/problem/8393


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int sum = 0; // sum 변수 선언뒤 for 문으로 1 부터 n 까지 더한 뒤 출력한다.
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }
}
