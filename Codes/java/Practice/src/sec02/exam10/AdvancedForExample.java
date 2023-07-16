package sec02.exam10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 99, 22, 98, 95};

        int sum = 0;

        for (int score :scores) {
            sum += score;
        }

        System.out.println("총합: " + sum);

        double avg = (double) sum / scores.length;

        System.out.println("평균: " + avg);
        }
    }
