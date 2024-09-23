package com.example.프로그래머스.PCCE기출문제.공원;

//지민이는 다양한 크기의 정사각형 모양 돗자리를 가지고 공원에 소풍을 나왔습니다. 공원에는 이미 돗자리를 깔고 여가를 즐기는 사람들이 많아 지민이가 깔 수 있는 가장 큰 돗자리가 어떤 건지 확인하려 합니다. 예를 들어 지민이가 가지고 있는 돗자리의 한 변 길이가 5, 3, 2 세 종류이고, 사람들이 다음과 같이 앉아 있다면 지민이가 깔 수 있는 가장 큰 돗자리는 3x3 크기입니다.\
//지민이가 가진 돗자리들의 한 변의 길이들이 담긴 정수 리스트 mats, 현재 공원의 자리 배치도를 의미하는 2차원 문자열 리스트 park가 주어질 때 지민이가 깔 수 있는 가장 큰 돗자리의 한 변 길이를 return 하도록 solution 함수를 완성해 주세요. 아무런 돗자리도 깔 수 없는 경우 -1을 return합니다.
public class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int max = 1;
        for(int i = 0 ; i < park.length - max; i++){
            for(int j = 0; j  < park[0].length - max; j++){
                if(park[i][j].equals("-1")){
                    max = Math.max(start(park, i, j), max);
                }
            }
        }
        for (int mat : mats) {
            if(mat == max){
                return max;
            }else if(mat < max) {
                answer = Math.max(mat, answer);
            }
        }
        return answer;
    }


    public int start(String[][] park, int start, int j_start){
        int length = Math.min(park.length - start, park[0].length - j_start);


        for(int i = start ; i < start + length; i++){
            for(int j = j_start; j  < j_start + length; j++){
                if(!park[i][j].equals("-1")){
                    length = j - j_start;
                }
            }
        }
        return length;
    }
}