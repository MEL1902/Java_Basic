// 문제출처:https://www.acmicpc.net/problem/2525



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int min = 60 * A + B; // A: 시간 B : 분     60 곱하기 시간 더하기 분
        min += C;   // "+=" 대입연산 뜻 : min = min + C.

        int hour = (min / 60) % 24;  //%: 오른쪽을 왼쪽으로 나눈후 나머지.  합계나온 분을 60으로 나눈후 24로 나눈후 나머지로 계산
        int minute = min % 60; //int minute 에 min % 60결괏값 저장

        System.out.println(hour + " " + minute);

    }
}