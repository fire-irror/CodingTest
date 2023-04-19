package cospro;

import java.util.Arrays;

class Solution {

    public int[] solution(int[] scores) {
        int[] ranks = new int[scores.length]; // 각 요소의 석차를 저장할 배열
        Arrays.fill(ranks, 1); // 초기 석차는 1로 설정

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    ranks[i]++; // 자신보다 높은 점수가 있을 경우 석차를 1 증가시킴
                }
            }
        }

        return ranks; // 석차를 포함하는 배열 반환
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] scores = {20, 60, 98, 59};
        int[] ret = sol.solution(scores);
        System.out.println("점수: " + Arrays.toString(scores));
        System.out.println("석차: " + Arrays.toString(ret));
    }
}

