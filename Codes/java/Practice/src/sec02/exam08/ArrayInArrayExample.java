package sec02.exam08;

public class ArrayInArrayExample {
    public static void main(String[] args) {

        int[][] mathScores = new int[2][3]; //다차원 배열의 선언문 int[][] a배열 두개b배열3개의값이있음
        for (int i = 0; i < mathScores.length; i++) {  //For 문
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]="
                        + mathScores[i][k]);
            }
        }
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2]; //배열 B (englishScores) 에대한 값이 2개
        englishScores[1] = new int[3];  // 배열 C (javaScores) 에대한 값이3개
        for (int i = 0; i < englishScores.length; i++) { //For문
            for (int k = 0; k < englishScores[i].length; k++) { // Length 뜻은 길이에대한 값을 갖는다.
                System.out.println("englishScores[" + i + "][" + k + "]="
                        + englishScores[i][k]);  //결과값
            }
        }
        System.out.println(); // 선언

        int[][] javaScores = { {95, 80}, {92, 96, 80} };
        for (int i = 0; i < javaScores.length; i++) {
            for (int k = 0; k < javaScores[i].length; k++) {
                System.out.println("javaScores[" + i + "][" + k + "]="
                        + javaScores[i][k]);
            }
        }
    }
}