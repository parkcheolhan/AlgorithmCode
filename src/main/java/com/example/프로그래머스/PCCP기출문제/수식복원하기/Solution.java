package com.example.프로그래머스.PCCP기출문제.수식복원하기;

import lombok.extern.log4j.Log4j2;

import java.util.*;

//당신은 덧셈 혹은 뺄셈 수식이 여러 개 적힌 고대 문명의 유물을 찾았습니다. 이 수식들을 관찰하던 당신은 이 문명이 사용하던 진법 체계가 10진법이 아니라는 것을 알아냈습니다. (2 ~ 9진법 중 하나입니다.)
//
//수식들 중 몇 개의 수식은 결괏값이 지워져 있으며, 당신은 이 문명이 사용하던 진법에 맞도록 지워진 결괏값을 채워 넣으려 합니다.
//
//다음은 그 예시입니다.
//
//<수식>
//
//14 + 3 = 17
//        13 - 6 = X
//51 - 5 = 44
//X로 표시된 부분이 지워진 결괏값입니다.
//51 - 5 = 44에서 이 문명이 사용하던 진법이 8진법임을 알 수 있습니다. 따라서 13 - 6 = X의 지워진 결괏값을 채워 넣으면 13 - 6 = 5가 됩니다.
//
//다음은 또 다른 예시입니다.
//
//<수식>
//
//1 + 1 = 2
//        1 + 3 = 4
//        1 + 5 = X
//1 + 2 = X
//주어진 수식들에서 이 문명에서 사용한 진법이 6 ~ 9진법 중 하나임을 알 수 있습니다.
//        1 + 5 = X의 결괏값은 6진법일 때 10, 7 ~ 9진법일 때 6이 됩니다. 이와 같이 결괏값이 불확실한 수식은 ?를 사용해 1 + 5 = ?와 같이 결괏값을 채워 넣습니다.
//1 + 2 = X의 결괏값은 6 ~ 9진법에서 모두 3으로 같습니다. 따라서 1 + 2 = X의 지워진 결괏값을 채워 넣으면 1 + 2 = 3이 됩니다.
//
//덧셈 혹은 뺄셈 수식들이 담긴 1차원 문자열 배열 expressions가 매개변수로 주어집니다. 이때 결괏값이 지워진 수식들의 결괏값을 채워 넣어 순서대로 문자열 배열에 담아 return 하도록 solution 함수를 완성해 주세요.
@Log4j2
public class Solution {
    public String[] solution(String[] expressions) {
        int 최소진법 = 2;
        char 기호 = '+';
        char 기호2 = '-';
        char 등호 = '=';
        int 최대진법 = 9;
        Set<Integer> resultSet = new LinkedHashSet<>();
        List<List<String>> resultList = new ArrayList<>();
        List<List<String>> resultList2 = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String expression : expressions) {
            List<String> expressionResult = new ArrayList<>();
            String s = "";
            boolean 미지수 = false;
            for (char c : expression.toCharArray()) {
                if (최소진법 < c - 47 && c > 기호 && c < 등호) {
                    최소진법 = ((int) c) - 47;
                }

                if (c == ' ') {
                    continue;
                }
                if(c == 'X'){
                    미지수 = true;
                }
                if (c == 등호) {
                    expressionResult.add(s);
                    s = "";
                    continue;
                }
                if (c == 기호 || c == 기호2) {
                    expressionResult.add(s);
                    expressionResult.add(String.valueOf(c));
                    s = "";
                    continue;
                }
                s = s.concat(String.valueOf(c));

            }
            expressionResult.add(s);
            if(미지수){
                resultList2.add(expressionResult);
            }else {
                resultList.add(expressionResult);
            }
        }
        for (int i = 최소진법; i <= 최대진법; i++) {
            resultSet.add(i);
        }
        for (List<String> strings : resultList) {
            if(resultSet.size() <= 1){
                break;
            }
            진법계산기(strings, resultSet);
        }
        for(List<String> strings : resultList2){
            result.add(Test(strings, resultSet));
        }
        return result.toArray(new String[0]);
    }

    public String Test(List<String> exList, Set<Integer> resultSet){
        String 앞자리 = exList.get(0);
        String 뒷자리 = exList.get(2);
        String 부호 = exList.get(1);
        Iterator<Integer> iterator = resultSet.iterator();
        String 정답 = "";
        boolean end = true;
        while (iterator.hasNext() && end) {
            Integer i = iterator.next();
            int 앞 = Integer.parseInt(앞자리, i);
            int 뒷 = Integer.parseInt(뒷자리, i);

            switch (부호) {
                case "+": {
                    if(!정답.isEmpty()) {
                        if(Integer.valueOf(Integer.toString(앞+뒷, i)) != Integer.valueOf(정답)){
                            정답 = "?";
                            end = false;
                            break;
                        }
                    }else {
                        정답 = Integer.toString(앞+뒷, i);
                    }
                }
                break;
                default: {
                    if(!정답.isEmpty()) {
                        if(!Integer.valueOf(Integer.toString(앞 - 뒷, i)).equals(Integer.valueOf(정답))){
                            정답 = "?";
                            end = false;
                            break;
                        }
                    }else {
                        정답 = Integer.toString(앞-뒷, i);
                    }
                }
            }
        }
        return 앞자리 + " " + 부호 + " "+ 뒷자리 + " = " + 정답;
    }

    public void 진법계산기(List<String> exList, Set<Integer> resultSet) {
        String 앞자리 = exList.get(0);
        String 뒷자리 = exList.get(2);
        String 부호 = exList.get(1);
        int 정답 = Integer.parseInt(exList.get(3));
        int 진수답;
        switch (부호) {
            case "+": {
                진수답 = Integer.parseInt(앞자리) + Integer.parseInt(뒷자리);
            }
            break;
            default: {
                진수답 = Integer.parseInt(앞자리) - Integer.parseInt(뒷자리);
            }
        }
        if (진수답 != 정답) {
            Iterator<Integer> iterator = resultSet.iterator();
            while (iterator.hasNext()) {
                Integer i = iterator.next();
                int 앞 = Integer.parseInt(앞자리, i);
                int 뒷 = Integer.parseInt(뒷자리, i);

                switch (부호) {
                    case "+": {
                        if (Integer.valueOf(Integer.toString(앞+뒷, i)) != 정답) {
                            iterator.remove();
                        }
                    }
                    break;
                    default: {
                        if (Integer.valueOf(Integer.toString(앞-뒷, i)) != 정답) {
                            iterator.remove();
                        }
                    }
                }
            }
        }
    }
}