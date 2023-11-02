package String;

// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다.
// 만약 길이가 긴 단어중 길이가 같은 문장에서 가장 앞쪽에 위치한 단어를 답으로 한다.

import java.util.Scanner;
public class 문장속단어 {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;  // 가장 작은값으로 초기화
        String[] s = str.split(" ");
        // split은 ()안에 들어가 있는 문자를 기준으로 문장들을 분리해준다. 즉 " " 띄어쓰기를 기준으로 각각 String형 배열 s에 들어간다.
        for(String x : s) {
            // 위에 split 함수로 인해서 String 배열 s에 들어간 문자들을 x에 대입시켜서 int형 변수의 값 len(x의 길이)을 구해준다.
            // if 조건문으로 max와 비교하여 len이 max보다 값이 초과이면 max를 len으로 바꿔주고 answer의 값에 x의 값을 넣어준다.
            int len = x.length();
            if(len> max) { // 문장의 앞부터 탐색하기 때문에 만약 같은 길이가 나와도 if 조건문은 false 반환
                max = len;
                answer = x;
            }
        }
        // 다른 풀이
        // indexOf와 subString 사용. indexOf는 ()안에 있는 문자에 index 번호를 반환
        // while((pos = str.indexOf(' ')) != -1 ) {
        //     String tmp = str.subString(o,pos);  --> subString(0,pos)는 0번 인덱스부터 pos-1번 인덱스까지 짜른 문자를 반환
        //     int len = tmp.length();
        //     if(len > m) {
        //     m = len;
        //     answer = tmp;
        //     }
        //     str = str.subString(pos+1);
        // }
        // if(str.length() > m) answer = str;  --> 마지막 단어 study뒤에 공백이 없으므로 -1을 반환한다. 그러면 마지막 단어 전 길이가 가장 긴 단어가
        // 답으로 출력되기 때문에 마지막 단어를 체크해주어야한다.만약 마지막 남은 단어가 길이가 가장 길다면 그 단어가 답이므로 꼭 체크해주어야한다.
        // return answer;
        return answer;
    }
    public static void main(String[] args) {
        문장속단어 t = new 문장속단어();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // 문장을 입력받아야 하기 때문에 nextLine 사용
        System.out.println(t.solution(str));
    }
}
