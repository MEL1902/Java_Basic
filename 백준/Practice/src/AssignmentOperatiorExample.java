public class AssignmentOperatiorExample {
    public static void main(String[] args) {

        int result = 0;
        result += 10;
        System.out.println("reault=" + result); //10
        result -= 5;
        System.out.println("reault=" + result); // 5
        result *= 3;
        System.out.println("reault=" + result); //15
        result /= 5;
        System.out.println("reault=" + result);// 3
        result %= 3;
        System.out.println("reault=" + result); // 0
    }
}
// 3항연산자 3개의 피연산자를 필요로하는 연산자
//? 앞의 조건식에 따라 콜론 앞뒤의 피연산자 선택
//1. 조건식 ? 2.값 또는 연산식 : 3.값 또는 연산식  콜론 뒤에있는 것이 결괏값이다


                    /*    int score = 95; // int 타입 변수에 95를 선언
                     char grade = (score > 90) ? 'A' : 'B' ;
                char grade; // char 타입변수 grade 를 선언하고 여기에는 char 값인 A 또는 B 가 들어갈 것이다.

                if(score > 90) { // True 가 되면 괄호부분을 실행해서 Grade 에 If 를 저장하게됨
                        grade = 'A';
                        } else {
                    grade = 'B';
                        } */
