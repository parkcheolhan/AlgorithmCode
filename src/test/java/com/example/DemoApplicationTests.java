package com.example;

import com.example.프로그래머스.PCCP기출문제.충돌위험찾기.Solution;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes =Solution.class)
class DemoApplicationTests {

    @Test
    void contextLoads() {
        Solution solution = new Solution();
        int[][] points = {{2, 2}, {2, 3}, {2, 7},{6, 6}, {5,2}};
        int[][] routes = {{2,3,4,5},{1,3,4,5}};
        solution.solution(points, routes);
    }

}
