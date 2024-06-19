package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class minMaxFrequencies {
    public static void main(String[] args) {
        int[] arr = {10,10,10,3,3,3};
        int[] result = getFrequencies(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] getFrequencies(int[] arr){
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num : arr){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        int elementWithMaxFrequency = -1;
        int elementWithMinFrequency = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()){
            int num = entry.getKey();
            int frequency = entry.getValue();

            if(frequency < frequencyMap.getOrDefault(elementWithMinFrequency, Integer.MAX_VALUE)){
                elementWithMinFrequency = num;
            }

            if(frequency == frequencyMap.getOrDefault(elementWithMinFrequency, Integer.MAX_VALUE)){
                elementWithMinFrequency = Math.min(num, elementWithMinFrequency);
            }

            if (frequency > frequencyMap.getOrDefault(elementWithMaxFrequency, Integer.MIN_VALUE)) {
                elementWithMaxFrequency = num;
            }
            if(frequency == frequencyMap.getOrDefault(elementWithMaxFrequency, Integer.MAX_VALUE)){
                elementWithMaxFrequency = Math.min(num, elementWithMaxFrequency);
            }
        }
        return new int[]{elementWithMaxFrequency,elementWithMinFrequency};

    }
}

