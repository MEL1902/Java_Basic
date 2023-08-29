public class If_ElseIf_ElseExample {
    public static void main(String[] args) {
        //If_Else If_Else 문은 3가지 식이 주어진다
        // IfElse 문과 같이 조건문이 True 면 괄호 실행 False 면 다음 조건식으로 움직임
        int score = 75;

        if (score >= 90) {
            System.out.println("점수가 100~90 입니다.");
            System.out.println("등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80~89 입니다.");
            System.out.println("등급은 B 입니다.");

        } else if (score >= 70) {
            System.out.println("점수가 70~79 입니다.");
            System.out.println("등급은 C 입니다.");
        } else {
            System.out.println("점수가 70 미안 입니다.");
            System.out.println("등급은 D 입니다.");

        }
        System.out.println("종료");
    }
}
