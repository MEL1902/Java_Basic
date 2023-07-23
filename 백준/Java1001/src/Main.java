
// 두 수를 입력받고 합을 출력하는 문제.
//https://www.acmicpc.net/problem/1001
//
import java.util.Scanner; // 임폴트해 자바 유틸 스캐너를 가져와
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너(입력받기) 하겠다고 선언을하는거야

        int A = sc.nextInt();  //Int(정수 타입) 변수 A 선언하고 A 변수에서 입력받은 숫자를 넣는 다고 선언하는거같다. "sc.nextInt()" 로
        int B = sc.nextInt();  // 이하동문


        System.out.println( A - B); // 이거는 결괏값 출력인데 입력받기한 정수A,B 를 연산해서 출력한다는 뜻이다.
    }
}