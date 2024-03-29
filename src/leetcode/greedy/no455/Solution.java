package leetcode.greedy.no455;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g==null || s==null)
            return -1;
        int[] child = g;
        Arrays.sort(child);
        int[] cookie = s;
        Arrays.sort(cookie);

        int gi = 0 , si = 0 , count = 0;
        while(gi<g.length && si<s.length ){
            if(g[gi]<=s[si]) {
                count++;
                gi++;
                si++;
            }else{
                si++;
            }

        }
        return count;

    }
}
