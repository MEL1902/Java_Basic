public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85; // int Type score라는 변수에 85를 저장하
        char grade = (score > 90 ) ? 'A' :((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");


    }
}

//증감 연산자 : ++ , -- 를 말하면 변수의 값을 1씩 증가 1씩 감소시킴
//비교 연산자 : ==, != 등을 말하며 값이 같은지, 다른지를 비교하고 boolean 값을 산출
//논리 연산자 : && , ||,!,^ 등을 말하면 논리곱, 논리합, 논리부정,베타적 논리합을 수행하고 boolean 값을 산출
//대입 연산자 : =, +=, -= 등을 말하며 오른쪽의 값을 왼쪽에 대입하거나 연산 후 대입
//삼항 연산자 : 조건식 ? A : B 를 말하며 조건이 true이면 A를 산출, false 이면 B 를 산출


//&& 논리곱
//|| 논리합
