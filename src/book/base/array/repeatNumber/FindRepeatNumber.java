package book.base.array.repeatNumber;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class FindRepeatNumber {
    public Set<Integer> find(int[] array){
        int[] arr = array ;
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        Set<Integer> set = new TreeSet<>();

        for(int i = 0 ; i < arr.length ; i++){
            if (!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],i);
            }
            else{
                set.add(arr[i]);
            }
        }
        return set;
    }

    public static void main(String[] args){
        FindRepeatNumber test = new FindRepeatNumber();
        int[] array = {2,4,3,2,4,1,5};
        Set<Integer> set = test.find(array);
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
