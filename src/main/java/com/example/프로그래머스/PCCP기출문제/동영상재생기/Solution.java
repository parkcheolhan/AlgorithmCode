package com.example.프로그래머스.PCCP기출문제.동영상재생기;

//당신은 동영상 재생기를 만들고 있습니다. 당신의 동영상 재생기는 10초 전으로 이동, 10초 후로 이동, 오프닝 건너뛰기 3가지 기능을 지원합니다. 각 기능이 수행하는 작업은 다음과 같습니다.
//
//        10초 전으로 이동: 사용자가 "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동합니다. 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동합니다. 영상의 처음 위치는 0분 0초입니다.
//10초 후로 이동: 사용자가 "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동합니다. 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동합니다. 영상의 마지막 위치는 동영상의 길이와 같습니다.
//오프닝 건너뛰기: 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동합니다.
//동영상의 길이를 나타내는 문자열 video_len, 기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos, 오프닝 시작 시각을 나타내는 문자열 op_start, 오프닝이 끝나는 시각을 나타내는 문자열 op_end, 사용자의 입력을 나타내는 1차원 문자열 배열 commands가 매개변수로 주어집니다. 이때 사용자의 입력이 모두 끝난 후 동영상의 위치를 "mm:ss" 형식으로 return 하도록 solution 함수를 완성해 주세요.
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        int videoTime= (Integer.parseInt(video_len.substring(0,2)) * 60) + Integer.parseInt(video_len.substring(3,5));

        int posTime = Integer.parseInt(pos.substring(0,2)) * 60 + Integer.parseInt(pos.substring(3,5));

        int osTime = Integer.parseInt(op_start.substring(0,2)) * 60 + Integer.parseInt(op_start.substring(3,5));

        int oeTime = Integer.parseInt(op_end.substring(0,2)) * 60 + Integer.parseInt(op_end.substring(3,5));

        int currentTime = posTime;

        if(posTime >= osTime && posTime <= oeTime){
            currentTime = oeTime;
        }

        for(String command : commands){
            if(command.equals("next")){
                currentTime = Math.min(currentTime+10, videoTime);
            }else {
                currentTime = Math.max(currentTime-10, 0);
            }
            if(currentTime >= osTime && currentTime <= oeTime){
                currentTime = oeTime;
            }

        }
        String answer = "";
        if(currentTime < 600){
            answer = answer.concat("0");
            if(currentTime<60){
                answer = answer.concat("0");
            }else {
                answer = answer.concat(String.valueOf(currentTime/60));
            }
        }else {
            answer = answer.concat(String.valueOf(currentTime/60));
        }
        answer = answer.concat(":");
        int sec =  currentTime % 60;
        if(sec < 10){
            answer = answer.concat("0");
        }
        answer = answer.concat(String.valueOf(sec));
        return answer;
    }
}