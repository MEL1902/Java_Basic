public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for (int m=2; m<=9; m++) {
            System.out.println("*** " + m + "단 ***");
            for (int n=1; n<=9; n++) { // 중첩 For 은 바깥 for 문이 한번 반복할때마다
                //중첩 for에 지정돼있는 조건에따라서 계속 반복하다가 중첩for 문이 끝나면 다시 바깥 for문 증감식으로가서 바깥for문을 반복하는것.
                System.out.println(m + " x " + n + " = " + (m*n));
            }
        }
    }
}

// 중첩 for 문을 사용한 구구단 오!! 신기하다