/* 문자열을 기본타입으로 강제타입변환법
* 문자열 스트링을 객체를 생성후 문자열값을 넣는다 그리고
* 문자열을 어떤 기본타입으로 변환할지 정한후 기본타입 변수를 만든다. 예를들어 int 타입 변수로 강제타입변환을한다면
* int value = Integer.parseInt;
* int 타입의 value 라는 객체를 생성후 강제타입변환단어 parseInt를 적어주는데
* 여기서 주의점은 int 변환시 Int가 아닌 Integer가 들어간다. */

public class Main {
    public static void main(String[] args) {

        String str = "10";
        byte value1 = Byte.parseByte(str);
        System.out.println(value1);
        String str1 = "200";
        short value2 = Short.parseShort(str1);
        System.out.println(value2);
        String str2 = "30000";
        int value3 = Integer.parseInt(str2);
        System.out.println(value3);
        String str3 = "40000000000";
        long value4 = Long.parseLong(str3);
        System.out.println(value4);
        String str4 = "12.345";
        float value5 = Float.parseFloat(str4);
        System.out.println(value5);
        String str5 = "12.345";
        double value6 = Double.parseDouble(str5);
        System.out.println(value6);
        String str6 = "true";
        boolean value7 = Boolean.parseBoolean(str6);
        System.out.println(value7);
    }
}
