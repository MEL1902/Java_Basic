//문제출처 : https://www.acmicpc.net/problem/11382
//문제
//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//
//입력
//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
//
//출력
//A+B+C의 값을 출력한다.
//나는 스캐너를 이용해 입력값을 받아 문제를 풀어 볼 것이다.스캐너 사용을 위해 java.util 패키지를 통해 스캐너를 호출한다.
//스캐너 이름을 선언한뒤 객채를 생성해 시스템 in 을 선언해준다.1 ~ 10의 12진수 사이의 공백을 사이에 두고 주어진다에 초점을 맞춘다.
//변수 int 가 아니라 저장값이 많은 64bit인 롱을 변수로 받는다.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner candy = new Scanner(System.in);

        long A = candy.nextLong();
        long B = candy.nextLong();
        long C = candy.nextLong();

        System.out.println(A + B + C);

    }
}
