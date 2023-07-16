package sec02.exam06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum = 0;

        for (int i = 0; i<scores.length; i++) { //length는 index보다 하나의값이 더 크다 늘
            sum += scores[i];  // += : Replace the value on the right with the left or after calculation.
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("평균: " + avg);
       }
    }