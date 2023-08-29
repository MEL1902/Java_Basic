public class DiceExample {
    public static void main(String[] args) {
        //Math.random 메소드는 0~부터 1사이에 임의에 실수를 리턴한다
        //0.0을 포함하고 1.0 포함 X 이 사이의 임의
        int num = (int)(Math.random()*6) + 1; // 0.0 <= ~ <6.0

        if(num==1) {
            System.out.println("1번이 나왔습니다.");
        } else if (num==2) {
            System.out.println("2번이 나왔습니다.");
        } else if (num==3) {
            System.out.println("3번이 나왔습니다.");
        } else if (num==4) {
            System.out.println("4번이 나왔습니다.");
        } else if (num==5) {
            System.out.println("5번이 나왔습니다.");
        } else {
            System.out.println("6번이 나왔습니다.");
        }
    }
}
