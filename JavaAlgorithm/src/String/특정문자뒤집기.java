package String;

/*
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작서하세요.
*/

import java.util.Scanner;
public class 특정문자뒤집기 {
    public String solution(String str) {
        String answer;
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) {  // c[lt]가 특수 문자 일 때
                lt++;
            }
            else if(!Character.isAlphabetic(c[rt])) {  // c[rt]가 특수 문자 일 때
                rt--;
            }
            else {  // 둘 다 알파벳일 때
                // 순서 바꾸는 손코딩
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);  // char형 변수 c를 String화 시켜준다.
        return answer;
    }
    public static void main(String[] args) {
        특정문자뒤집기 t = new 특정문자뒤집기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
