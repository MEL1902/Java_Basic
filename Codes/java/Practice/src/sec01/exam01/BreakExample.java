package sec01.exam01;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 6) + 1;// 1~6까지의 정수 랜덤
            System.out.println(num);
            if (num == 6) {
                break;

            }
        }
        System.out.println("무인도를 빠져나왔습니다.");
    }
}
