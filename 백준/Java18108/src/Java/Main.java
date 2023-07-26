
package Java;
// 문제출처: https://www.acmicpc.net/problem/18108
// 이 문제는 입력받기를 사용해서 풀면 좋을것같다. 태국에서는 석가모니가 열반한 해를 기준으로
//연도를 세는 불기기를 사용하는데 불기연도와 서기연도의 값을 뺀후 남는 값 만큼 입력 받기에 적용 하면
// 될 것 같다.
import java.util.Scanner;
  // Scanner 클래스 호출
// Scanner 특징* 클래스를 사용하기 위해서는 호출해줘야한다.
// 자바의 경우 java.utill 패키지 안에 Scanner 클래스가 있으므로 다음과같이 import를
//를 쓴 후 해당 클래스 경로를 호출하도록한다.

public class Main {
    public static void main(String[] args) {

        Scanner candy = new Scanner(System.in);

        int year = candy.nextInt();
        System.out.println( year - 543);

    }
}
