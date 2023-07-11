package sec02.exam01;

public class ArrayCreateByValueListExample  {
    public static void main(String[] args) {
        //배열 참조 변수 선언과 동시에 값을 할당
        int[] scores = {83, 90, 87,};
        System.out.println("scores[0]: " + scores[0]);
        System.out.println("scores[1]: " + scores[1]);
        System.out.println("scores[2]: " + scores[2]);

        int sum = 0;

        //index 0~2까지 반복
        for(int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        double avg = (double)  sum / 3;
        System.out.println("평균: " + avg);

    }
}
