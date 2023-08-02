// 문제출처: https://www.acmicpc.net/step/4
// 입력받기 스캐너와 if 문을 사용해보자
// 스캐너를 사용을 하기전 java util 패키지에서 Scanner 를 호출을 해야 스캐너 사용이 가능하다.
// 그다음 스캐너 객체 생성후 new Scanner(System.in) 을 해준다

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a <= 4000 && a >= 1) {
//첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
            if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
                // if 문 안에있는 연산 기호 설명하기
                // % 산술연산, 왼쪽 피연산자를 오른쪽 피연산자로 나눈 나머지를 구하는 연산
                // == 비교연산, 같은지 비교하는것
                // && 논리연산, 은 간단히 true false 결과값을 내기위해 사용하는데 이것은 논리곱에 해당된다.
                // && 은  연산식이 T T = T, T F or F T or F F 모두 = F 이다.
                // != 는 비교연산, 다른지 비교하는것.
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            scan.close(); // 최적화를 위해 scanner 을 닫아준다.
            }

        }
    }