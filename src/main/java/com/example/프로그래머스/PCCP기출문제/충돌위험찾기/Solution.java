package com.example.프로그래머스.PCCP기출문제.충돌위험찾기;

import java.util.*;


public class Solution {
    public int solution(int[][] points, int[][] routes) {
        List<Map<String, Integer>> listResultHashMap = new ArrayList<>();
        int answer = 0;

        List<List<int[]>> routeList = new ArrayList<>();
        for(int[] route :  routes){
            List<int[]> list = new ArrayList<>();
            for(int index = 0; index < route.length-1; index ++) {
                int[] prv = points[route[index]-1];
                int[] pos = points[route[index+1]-1];
                if(index == 0){
                    list.add(prv);
                }
                channel(prv, pos, list);
            }
            routeList.add(list);
        }


        for(List<int[]> route : routeList){
            for(int i = 0 ; i < route.size(); i++){
                if(listResultHashMap.size() < i+1){
                    listResultHashMap.add(new HashMap<>());
                }
                Map<String, Integer> map = listResultHashMap.get(i);
                int value = 1;
                String key = "X"+route.get(i)[0] + "Y"+route.get(i)[1];
                if(map.containsKey(key)){
                    value = map.get(key)+1;
                    if(value == 2){
                        answer++;
                    }
                }
                map.put(key, value);
            }
        }


        return answer;
    }

    public List<int[]> channel(int[] prv, int[] pos, List<int[]> list){


        int[]current = new int[]{prv[0], prv[1]};
        while(true){
            if(current[0]< pos[0]){
                current[0] = current[0]+1;
            }else if(current[0] > pos[0]){
                current[0] = current[0]-1;
            }else if(current[1] < pos[1]){
                current[1] = current[1]+1;
            }else if(current[1] > pos[1]){
                current[1] = current[1]-1;
            }else {
                return list;
            }
            list.add(new int[]{current[0], current[1]});
        }
    }
}