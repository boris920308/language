package programmers.stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * no.42586
 * 기능개발
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */


public class stack_42586 {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));

    }

    private static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        // 남은 작업일수 계산
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.offer(day);
        }

        // 배포
        while (!queue.isEmpty()) {
            int current = queue.poll(); // 가장 앞의 작업
            int count = 1; // 배포할 기능의 수

            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }

            //결과에 추가
            answer.add(count);
        }

        return answer.stream().mapToInt(num -> num).toArray();
    }
}
