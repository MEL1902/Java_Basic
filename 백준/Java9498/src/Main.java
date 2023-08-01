//문제 출처:https://www.acmicpc.net/problem/9498
// 시험 점수를 입력받아 A,B,C,D 나머지F 등급을 출력하는 프로그램 작성이다.
//입력받기 Scanner 와 if -else if -else 문으로 하면 될 것 같은데 정확한 응용 식이 기억이나지 않는다
//구글에 검색해서 힌트를 얻기로 결정했디.  그러면서 동시에 백준과 혼자바 책을 통해
//번갈아가며 병행 공부를 실행 하겠다.
/* **해석은 입력받기 사용을 위해 Scanner 를 사용해줘여한다. java util package 에서 Scanner 를 불러온다
* 불러올땐 "import" 후 불러준다 Scanner 의 객체를 생성해준다 이름은 "scan" = new Scanner(System.in) 해준다
* 더이상 스캐너 객체 scan을 사용 하지않는다면 최적화를 위해 scan이라는 객체를 close 해준다
* 그다음 if /else if/ else  를 사용해서 문제를 푼다. 문제를 잘 살펴봐야한다 문제안에 답이있다.
* 입력 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다
* 문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.*/
// && 는 AND (논리곱) 연산식이다  True 를 T False 를 F 라고 한다면  T T = T, T F = F , F T = F , F F = F 이다.
//입력받아 출력 프로그램을 작성할시 연산자가 중요한 역할이 되는것같다. 잘 기억해 두자.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();

        scan.close();
        if (num1 <= 100 && num1 >= 90) {
            System.out.println("A");
        } else if (num1 <= 89 && num1 >= 80) {
            System.out.println("B");
        } else if (num1 <= 79 && num1 >= 70) {
            System.out.println("C");
        }  else if (num1 <= 69 && num1 >= 60) {
            System.out.println("D");
        }    else {
            System.out.println("F");
        }
    }
}