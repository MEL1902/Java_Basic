// 문제 출처:https://www.acmicpc.net/problem/10430
// 이문제는 사칙연산 입력 받기 문제인 것 같다.
//풀이 과정은 언제나 그렇듯 문제에 정답이있다.
import java.util.Scanner; // 스캐너 클래스를 사용하기위해  Java.util package 안에 Scanner를 호출해준다.
//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C,
// 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
public class Main {
    public static void main(String[] args) {

     Scanner candy = new Scanner(System.in); // 그다음 객체 생성을 한다.
        //클래스_이름  객체_이름  = new 클래스_이름()
        //** 주의사항 : Scanner을 생성할 때 System.in 이 들어간다는점이다.
        int A = candy.nextInt();
        int B = candy.nextInt();
        int C = candy.nextInt();

        System.out.println((A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println((A%C)*(B%C)%C);





    }
}
