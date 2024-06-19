package com.company;

class Lc{
    public String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        if (strs == null) {
            return longestCommonPrefix.toString();
        }
        int minimumLength = strs[0].length();

        for (String c : strs) {
            minimumLength = Math.min(minimumLength, c.length());
        }

        for(int i = 0 ; i < minimumLength; i++){
            char current = strs[0].charAt(i);

            for(String str : strs){
                if(str.charAt(i) != current){
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }
}
public class LC_longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Lc l = new Lc();
        String ans = l.longestCommonPrefix(strs);
        System.out.println(ans);
    }

}


