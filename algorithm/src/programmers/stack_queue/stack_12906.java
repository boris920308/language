package programmers.stack_queue;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * no.12906
 * 같은 숫자는 싫어
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */

public class stack_12906 {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(solution(arr1)));

    }


    private static int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();


        for (int currentNum : arr) {
            if (answer.isEmpty()) {
                answer.add(currentNum);
            } else if (currentNum != answer.get(answer.size() - 1)) {
                answer.add(currentNum);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
