package book.base.array.repeatNumber;
/*
不改变数组,二分查找O(logn)
 */
public class FindDumplication {
    //查找重复个数
    public int countRange(int[] array , int low, int high){
        if(array == null || array.length<0)
            return -1;
        int count = 0;
        for (int i : array){
            if (i >= low && i <= high)
                count++;
        }
        return count;
    }
    public int getDumplication(int[] array){
        if (array ==null)
            return -1;
        int low = 0 ,high =array.length-1 , middle = 0;
        while(low <= high){
            middle = low + (high - low)/2;
            //前半数字有重复,在前半数字中继续寻找
            if(countRange(array , low ,middle )> (middle - low) ){
                high = middle - 1;
            }
            else if (countRange(array , middle , high )> (high - middle) ){
                low = middle + 1;
            }
            //low==high的个数>1
            if (low == high && countRange(array,low , high)>1){
                return low;
            }
        }
        return -1;
    }

}
