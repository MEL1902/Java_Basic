public class WhileSumForm1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;   // 최종 값이 101 이니까 i-1
        } while(i<=100);

        System.out.println("1~" + (i-1) + " 합: " + sum);
    }
}
