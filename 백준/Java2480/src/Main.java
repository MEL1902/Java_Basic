//문제출처:https://www.acmicpc.net/problem/2480
// 문제안에 정답이 있다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        //만약 모든 변수가 다른 경우
        if (a != b && b != c && a != c) {

            // != 값의 비교 연산 다른지.
            // && And 또는 Or
            int max;
            //만약 a > b 라면
            if (a > b) {
                // c > a > b 라면
                if (c > a) {
                    max = c;
                }
                //a > (b, c)
                else {
                    max = a;
                }
            }
            //b > a 라면
            else {
                // c > b > a 라면
                if (c > b) {
                    max = c;
                }
                // b > (a, c)
                else {
                    max = b;
                }
            }
            System.out.println(max * 100);

            //적어도 한 쌍 이상의 서로 같은 변수가 존재할 겨우
        } else {
            // 3개의 변수가 모두 같은 경우
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            } else {
                // a가 b혹은 c랑만 같은 경우
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                //b 가 c랑 같은 경우
                else {
                    System.out.println(1000 + b * 100);
                }
            }
        }
    }
}