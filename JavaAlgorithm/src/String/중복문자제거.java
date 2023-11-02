package String;

/*
소문자로 이루어진 한 개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요. 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지한다.
*/

import java.util.Scanner;
public class 중복문자제거 {
    public String solution(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
             if(str.indexOf(str.charAt(i)) == i) {  // 이 문자가 처음 발견된 인덱스 번호인 indexOf와 현재 탐색문자 i가 같다면 answer에 저장
                 answer += str.charAt(i);
             }
        }
        return answer;
    }
    public static void main(String[] args) {
        중복문자제거 t = new 중복문자제거();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
