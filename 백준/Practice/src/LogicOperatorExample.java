public class LogicOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A'; // char type 으로는 65
        if((charCode>=65) & (charCode<90) ) {
            System.out.println("It is a Kapital");
        }

        if ( (charCode>=97) && (charCode<=122) ) {
            System.out.println("소문자 이군요");
        }
            if ( !(charCode<48) && !(charCode>57)) {
                System.out.println("0~9 숫자 이군요");

            }

            int value = 6;

            if ( (value % 2 == 0 ) | (value%3 == 0) ) { //6을 2로나눈 나머지가 0이냐
                // value
                System.out.println("2또는 3의 배수");

            }

            if( (value % 2 == 0) || (value % 3 == 0) ) {
                System.out.println("2또는 3의 배수 이군요");
            }

            // 논리곱 연산은 & 과 && 는 연산 방식이 다르다
            // 첫 피연산자가 False 로 나오면은 논리곱으로 계산시 뒤에 연산은 할 필요가 없다
            //그럼에도 & 논리곱 연산은 앞이 False가 나오더라도 뒤에것을 조사한다. 의미가 없지만 다시 조사한다.
        // && 는 첫 연산식이 false 일경우 두번째 연산식은 보지도 않는다.
            //속도 면에서는 && 연산속도는 빠르다.

        // || 파이프 1개일때는
    }
}
 //% 왼쪽을 오른쪽으로 나눈나머지

 //대입 연산자

       //  복합 대입연산자    += 저장하기전 더하기 -= 빼기
       // x += 2;// x의 값에 2를 더하고 다시 X에 저장하라는 뜻 X = x + 2
        //x *= 3;
       // x = x * 3;