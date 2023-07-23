// 문제 출처: https://www.acmicpc.net/problem/10869
// 이 문제는 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
// 유틸 스캐너 임포트 후 scan 이라는 변수 스캐너를 선언 후 출력값 int A,B 선언후
//문제에 따라 연산을 해준다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}