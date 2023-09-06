public class BreakExample {
    public static void main(String[] args) {
        while(true) {
            int num = (int)(Math.random()*6) + 1;// Math random 은 1,2,3,4,5,6
            System.out.println(num);
            if(num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
