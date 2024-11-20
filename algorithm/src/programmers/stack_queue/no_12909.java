package programmers.stack_queue;

import java.util.Queue;

public class no_12909 {
    public static void main(String[] args) {

        String input = "()()";
        String input4 = "(()(";

        System.out.println(solution(input4));
    }

    private static boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        for (int index = 0; index < s.length(); index++) {


//            if ("(".equals(Character.toString(s.charAt(index)))) {
            if ('(' == (s.charAt(index))) {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        if (count != 0) {
            return false;
        }

        return answer;
    }

}
