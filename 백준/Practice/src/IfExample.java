public class IfExample {
    public static void main(String[] args) {
        // 조건문
        // 조건식에 따라 다른 실행문을 실행하기 위해 사용
        //If문: 조건식 결과의 true.false 여부에 따라 실행문 결정
        //Switch문: 변수의 값에 따라 실행문 결정
        //중괄호부분은 If 문이 True가 될떄 실행
        int score = 93;

        if(score>=90) { // If의 값이 True면 중괄호 실행
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }

        if(score<90)  //중괄호가 없는 if 문은 바로 밑에 결과만 출력한다 하지만 False 이기때문에
            // 바로 밑에것을 출력한다. 이런한 이유로 자칫하다가는 착각해 많은 코드를 작성후 실행할때 오류가 올수있다.
            System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B 입니다.");

    }
}
