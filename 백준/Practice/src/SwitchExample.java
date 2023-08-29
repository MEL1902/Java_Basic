public class SwitchExample {
    public static void main(String[] args) {
        //변수가 어떤 값을 갖는가에 따라 실행문 선택
        //같은 기능의 If문보다 코드가 간결
      //switch(변수) {
        int num = (int)(Math.random()*6) + 1;

        switch(num) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
                break;


        }
    }
}
