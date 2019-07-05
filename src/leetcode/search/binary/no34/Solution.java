package leetcode.search.binary.no34;

import java.util.Arrays;

public class Solution {
    public int[] searchRange(int[] nums , int target){
        int[] res = {-1,-1};
        int idx1 = -1;
        int idx2 = -1;
        int low = 0 ,high = nums.length-1 , mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(nums[mid]==target){
                idx1 = idx2 = mid;
                //向左遍历
                while((idx1-1)>=0 && nums[idx1-1]==target){
                    idx1--;
                }
                //向右遍历
                while((idx2+1)<nums.length && nums[idx2 + 1] == target){
                    idx2++;
                }
                low = high + 1;

            }else if(nums[mid]<target){
                low = mid + 1;
            }else if(nums[mid]> target){
                high = mid - 1;
            }
        }
        res[0] = idx1;
        res[1] = idx2;
        return res;
    }
}
