public class IfElseExample {
    public static void main(String[] args) {
        //If 문을 else 블록과 함께 사용
        //조건식의 결과에 따라 실행 블록 선택
        //if문 조건식이 true 일 경우 괄호안 조건식 실행
        //False 일경우 else 괄호문 실행
         int score = 85;

         if(score>=90) {
             System.out.println("점수가 90보다 큽니다.");
             System.out.println("등급은 A 입니다.");
         } else {
             System.out.println("점수가 90보다 작습니다.");
             System.out.println("등급은 B 입니다.");
         }
        System.out.println("종료");
    }
}
