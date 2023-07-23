
import java.util.Scanner;
//문제정보 : 정수 입력받기
//https://www.acmicpc.net/problem/1001
//Scanner (입력받기) 사용해서 A,B int 로 선언된 A,B 변수를 입력받기
//스캐너 변수 선언
// A,B 인트 변수 만들고 스캐너로 선언된 변수와 . nextInt 를 입력

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        System.out.println(A - B);



    }
}
