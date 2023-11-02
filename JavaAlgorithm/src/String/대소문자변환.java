package String;

// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

import java.util.Scanner;
public class 대소문자변환 {
    public String solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()) {  // for each문으로 매개변수 str을 char형 배열로 만들어준다.
            if(Character.isLowerCase(c)) { // if 조건문으로 c가 대문자인지 소문자인지 분류
                // isLowerCase = 이 문자가 소문자이냐?
                // isUpperCase = 이 문자가 대문자이냐?
                // toUpperCase = 이 문자를 대문자로 바꾸어라
                // toLowerCase = 이 문자를 소문자로 바꾸어라
                answer += Character.toUpperCase(c); // String형 변수 answer에 조건문으로 바뀐 문자를 넣어준다.
            }
            else {
                answer += Character.toLowerCase(c);
            }
        }
        // 아스키 넘버를 사용하여 프로그램을 작성할 수 있다.
        // a~z의 아스키 넘버는 97~122
        // A~Z의 아스키 넘버는 65~90
        // 서로의 차이를 이용하여
        // for(char x : str.toCharArray()) {
        //     if(x >= 65 && x <= 90) --> 대문자의 경우
        //     if(x >= 97 && x <= 122) --> 소문자의 경우
        //     answer += (char)(x-32)  --> 소문자의 경우 대문자로 변환
        //     answer += (char)(x+32)  --> 대문자의 경우 소문자로 변환
        // 주의할 점은 answer에 누적합 할 때 형변환을 해주어야한다.
        return answer;
    }
    public static void main(String[] args) {
        대소문자변환 t = new 대소문자변환();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
