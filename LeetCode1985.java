package com.company;

import java.util.PriorityQueue;

public class LeetCode1985 {
    public static void main(String[] args) {
        String[] arr = {"683339452288515879","7846081062003424420","4805719838","4840666580043","83598933472122816064","522940572025909479","615832818268861533","65439878015","499305616484085","97704358112880133","23861207501102","919346676","60618091901581","5914766072","426842450882100996","914353682223943129","97","241413975523149135","8594929955620533","55257775478129","528","5110809","7930848872563942788","758","4","38272299275037314530","9567700","28449892665","2846386557790827231","53222591365177739","703029","3280920242869904137","87236929298425799136","3103886291279"};
        String ans = kthLargestNumber(arr,3);
        System.out.println(ans);
    }
    private static String kthLargestNumber(String[] arr, int k){
       PriorityQueue<String> pq = new PriorityQueue<>(k,(a, b)->{
           if(a.length()==b.length()){
               return a.compareTo(b);
           }
           return Integer.compare(a.length(),b.length());
       });
       for(String num: arr){
           pq.add(num);
           if(pq.size()>k){
               pq.remove();
           }
       }
       return pq.poll();
    }
}
