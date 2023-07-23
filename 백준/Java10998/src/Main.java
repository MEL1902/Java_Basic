import java.util.Scanner;

// 문제는 백준홈페이지에 단계별로 푸는 문제들어가서 사칙연산 4번쨰문제 번호는 10998번
// 문제: 두 정수 A와 B를 입력받은 다음,AxB를 출력하는 프로그램을 작성해라.
// 문제 풀이전 문제 설계구조 파악.  스캐너(입력받기) 선언한다. 정수를 입력받는 Int 타입 변수에 입력받기 sc.nextInt(); 를 선언한다.
// 마지막은  System.out.println() 를 사용해 결괏값을 낸다.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        System.out.println(A * B);
    }
}