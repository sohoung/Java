package String;

// n개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

import java.util.ArrayList;
import java.util.Scanner;
public class 단어뒤집기 {
    public ArrayList<String> solution(String[] str, int n) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            // StringBuilder을 사용하기 위해서는 객체가 필요하므로 new을 붙여주고 다시 String화 시켜주기 위해서 toString을 넣어준다.
            // String은 불변이 법칙이므로 하나 생성되어지면 변화를 줄 수 없으므로 새로운 객체를 생성해야한다.
            // StringBuilder는 만들어진 하나의 객체로 사용하기 때문에 메모리 낭비도 없고 가벼운 장점이 있다.
            answer.add(tmp);
        }
        /*
        전체를 뒤집는게 아니라 일부분만 뒤집는 경우(손코딩)
        for(String x : str) {
             char[] c = x.toCharArray();  --> x에 대입된 문자를 char형 배열에 단어 하나하나를 쪼개서 넣어준다.
             int lt = 0;  --> 왼쪽 포인터
             int rt = x.length() - 1;  --> 오른쪽 포인터
             while(lt < rt ) {  --> lt와 rt가 서로 만나기 전까지 while문 수행
                 char tmp = c[lt];  --> 순서 바꿔주는 손코딩 꼭 암기!
                 s[lt] = s[rt];
                 s[rt] = tmp;
                 lt++;
                 rt--;
             }
             String tmp = String.valueOf(c);  --> ()안에 있는 문자를 String화 시켜준다.
             answer.add(tmp);
         }
         */
        return answer;
    }
    public static void main(String[] args) {
        단어뒤집기 t = new 단어뒤집기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for(String x : t.solution(str,n)) {
            System.out.println(x);
        }
    }
}
