//문제출처:https://www.acmicpc.net/problem/2588
//나는 개인적으로 이 문제가 어렵다. 일단 (2) 의 각 숫자를 (1) 숫자에 하나씩 곱해서 값을 구하는것은 알겠다.
//근데 이것을 어떻게 풀어내야할지 도무지 모르겠다. 그래서 검색을 통해 도움을 받았지만 무슨말인지 모르겠다.
//다시한번 하나하나 계산해보겠다.
// 입력 받기로 연산을 하는데 그전에 java util 패키지에
//문제출처 : https://www.acmicpc.net/problem/2588
// 도움 받은곳: https://ontheway.tistory.com/63
//이번문제는 사칙연산중 % 에 대한 이해가 없어서 어려운 문제다 B 의 1의 자리 10 의 자리 100 의 자리를 구한후
//마지막은 원래 곱하기 사칙연산을 해주면된다.
// * 오늘 알게된 사실 Scanner 을 사용했을 주의점은 최적화 관점에서 Close 를 하는게 좋고 만약 닫게된다면
// 프로그램 상에서 다시는 Scanner를 사용할 수 없으니 유의해야한다.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner candy = new Scanner(System.in);

        int A = candy.nextInt();
        int B = candy.nextInt();

        System.out.println(A * (B % 10));
        System.out.println(A * (B % 100/10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);

        candy.close();
    }
}