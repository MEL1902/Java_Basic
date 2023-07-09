package sec03.exam03;
//변수의 범위: 메서드 브록 내에서 선언된 변수를 로컬 변수(Local Variable)라고 한다.
public class VariableExample {// 메서드 블록 내에서만 사용 가능하고 메소드 실행이 끝나면 자동 삭제된다.
    public static void main(String[] args) {
        int value = 10;
        int sum = value + 20;
        System.out.println(sum);

    }
    //이 위치에서는 value와 sum 변수는 사용 못함
}
