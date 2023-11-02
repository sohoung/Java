package String;

// 한 개의 문자열을 입력받고 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요. 대소문자는 구분하지 않고
// 문자열의 길이는 100을 넘지 않습니다.

import java.util.Scanner;

public class 문자찾기 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();  // 대소문자를 구분하지 않기 때문에 입력받은 문자를 다 대문자나 소문자로 변환
        c = Character.toUpperCase(c);  // 매개변수로 받은 c는 char형이기 때문에 Character로 대소문자 변환
        for(int i = 0; i < str.length(); i++) {  // for 반복문으로 if 조건문을 이용해서 문제의 조건 탐색
            if(str.charAt(i) == c) {  // str형을 index 사용하기 위해서 charAt으로 c와 같은 문자인기 확인한다.
                answer++;
            }
        }
        return answer;

        // 문제를 for each(향상된 for문)으로 풀게 되면
        // for(char t : str.toCharArray())  --> 즉 배열이나 Colletion 프레임워크로 만들어서 사용해야한다. 바로 str을 넣으면 오류
    }
    public static void main(String[] args) {
        문자찾기 t = new 문자찾기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // 입력받은 문자열
        char c = sc.next().charAt(0);  // 입력받은 문자
        System.out.println(t.solution(str,c));
    }
}
