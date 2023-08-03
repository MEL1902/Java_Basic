//문제출처:https://www.acmicpc.net/problem/14681
//문제안에 정답이 있다... 각 좌표가 다른 4가지 면에서 각 면에 속해있는 좌표를 입력 받아
//어느면에 속해있는지 알아내면 된다.
// 입력받은 값을 이용해 if 문을 사용해 x,y 각 값을 이용해 비교연산으로 (True 인지 , False 인지)
//System out 으로 비교해준다.
//이 문제는 입력받기 Scanner 객체와 if를 사용해서 문제를 푼다.
//입력 받기 위해 스캐너 객체를 이용하기위해 java.util 클래스에서 스캐너 호출후 객체를 생성해 준다.
//그리고 인트를 사용해 변수를 만들어 스캐너 객체를 Int 변수에 넣어준다
// 여기서 if 문에 들어갈 각 분면을 비교연산 식을 잘 고민해 출력 방식을 넣어준다.
//이 이외에 다른 사람들은 어떤 방법으로 풀고있는지 검색후 확인해본다.
// &&: 비교연산(True,False)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);
        }
        if (x < 0 && y > 0) {
            System.out.println(2);

        }   if (x < 0 && y < 0) {

            System.out.println(3);

        }   if(x > 0 && y < 0) {

            System.out.println(4);

        }
    }
}