package com.example.공통;

public class 이진탐색 {
    int min;
    int max;
    int goal=0;

    public void start(){
        while (min <= max) {
            goal = (min + max) / 2;
            if (binarySearch(goal)) {
                max = goal -1;
            }else {
                min = goal +1;
            }
        }
    }


    public boolean binarySearch(int goal){
        //탐색조건


        return true;
    }

}
