package sec02.exam02;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        //배열에대한 참조 변수를 먼저 선언
        int[] scores;
        scores = new int[] {83, 90, 86};

        int sum1 = 0;
        for(int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }

        System.out.println("총합: " + sum1);

        double avg1 = (double) sum1 /3;
        System.out.println("평균: " + avg1);
    }
}
