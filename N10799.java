package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
 
public class N10799 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bf.readLine();
        Stack<Character> stack = new Stack<>();
 
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') { // 열린 괄호면 스택에 추가.
                stack.push('(');
                continue;
            }
            if (input.charAt(i) == ')') { // 닫힌 괄호일 경우,
                stack.pop(); // 일단 stack에서 pop을 실행.
 
                if (input.charAt(i - 1) == '(') { // 그 전 괄호가 열린 괄호면 레이저를 의미.
                    result += stack.size(); // 현재 stack의 사이즈만큼 더해 줌.
                } else { // 그 전 괄호가 닫힌 괄호면 레이저가 아님.
                    result++; // 단순히 1을 더해 줌.
                }
            }
        }
 
        bw.write(result + "\n");
        bw.flush();
        bf.close();
        bw.close();
    }
 
}

/*import java.io.*;
import java.util.*;

public class N10799 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        Stack<Point> stack = new Stack();
        ArrayList<Integer> arr = new ArrayList<>(); // 레이저 배열(닫는 괄호 인덱스)
        int sum = 0;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(s.charAt(i) == '('){ //여는 괄호 추가
                stack.push(new Point(i,c));
            }else if(s.charAt(i-1) == ')' && s.charAt(i) == ')'){ //스택이 비면 막대기 끝
                if(!stack.isEmpty()){
                    int start = stack.pop().idx;
                    int end = i;
                    int count = 1;
                    for(int r : arr){
                        if(start<r && r < end) count++;
                    }
                    sum += count;
                }else{
                    sum += arr.size()+1;
                    arr.clear();
                }
            }else if(s.charAt(i) == ')') { //닫는 괄호가 나오면 레이저 배열 추가
                stack.pop();
                arr.add(i);
                if (stack.isEmpty()) arr.clear();
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
    static class Point{
        int idx;
        char p;
        Point(int idx, char p){
            this.idx = idx;
            this.p = p;
        }
    }
}
*/