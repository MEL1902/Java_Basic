public class CompareOperatorExample {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 10;

        boolean result1 = num1 == num2; //== 두연산자의 값이 같은지 검사
        boolean result2 = num1 != num2; //!= 두연산자의 값이 다른지 검사
        boolean result3 = num1 <= num2; //<= 피연산자 1이 작거나 같은지 검사

        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 == char2);
        System.out.println("result4=" + result4);


        int v2 = 1;
        double v3 = 1.0;

        System.out.println(v2 == v3);  //타입이 다른 두 변수는 용량이 많은 타입으로 바뀐다. boolean 타입이로 바뀐다
        // 부동 소수점 방식 때문이다 정확히 0.1을 저장할수 없어서 이다.
        double v4 = 0.1;
        float v5 = 0.1F;
        System.out.println((double)v5); //float 타입의 0.1을 double 타입으로
        System.out.println(v4 == v5);
        System.out.println((float)v4 == v5);
        System.out.println((int)(v4*10) == (int)(v5*10));

        }
    }

   /*  논리 연산자
         And(논리곱)    &&, &  //피 연산자가 모두 True일 경우에만 연산 결과가 true 이다.
           OR(논리합) ||, | 피연산자 중 하나만 True 이면 연산 결과는 True 둘다 True 도 True 이다
        논리곱은 true true 일 경우에만 true 논리합은 false false 일 경우에만 false
             XOR (배타적 논리합)  ^   피연산자가 하나는 true이고 다른 하나가 false일 경우에만 연산 결과가 true
        Not(논리부정)    ! 피연산자의 논리값을 바꿈

&& 논리곱
       논리합 ||
^ 배타적 논리합
! 논리부정 */