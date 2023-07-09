package sec02.exam02;

public class ForSymFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0; //어떤 수를 더해도 자기 자신이 되는 숫가자 0이기 떄문

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1~100까지의 합은" + sum);
    }
}
