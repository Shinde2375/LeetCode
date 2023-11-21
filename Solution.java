// import java.util.Arrays;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] res=new int[2];
//         for(int i=1;i<nums.length;i++){
//             for(int j=0;j+i<nums.length;j++){
                            
//                 if(nums[j]+nums[j+i]==target){
                   
//                     res[0]=j;
//                     res[1]=j+i;
//                     return res;
                    
//                 }
//             }            
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         // System.out.println(Arrays.toString(s.twoSum(new int[]{3,5,2,4}, 9)));
//         System.out.println(Arrays.toString(s.twoSum(new int[] {4,6,3,9} , 9)));
//     }
// }

// import java.util.Arrays;
// import java.util.HashMap;

// class Solution {
//     static class pair{
//         int ele;int bit_count;
//         pair(int e,int b){
//             this.ele=e;
//             this.bit_count=b;
//         }
//     }
//     public static void swap(int i,int j,int arr[]){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//         return;
//     }
//     public static int[] sort(HashMap<Integer,Integer> map,int arr[]){
//         int size=arr.length;
//         // lets implement bubble sort in here
//         for(int i=0;i<size;i++){
//             for(int j=i+1;j<size;j++){
//                 if(map.get(arr[i])>map.get(arr[j])) swap(i,j,arr);
//                 else if(map.get(arr[i])==map.get(arr[j])){
//                     if(arr[i]>arr[j]) swap(i,j,arr);
//                 }
//             }
//         }
//         return arr;
//     }
//     public int[] sortByBits(int[] arr) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int size=arr.length;
//         for(int i=0;i<size;i++){
//             int bits=Integer.bitCount(arr[i]);
//             map.put(arr[i],bits);
//         }
//        // System.out.println(map);
//         return sort(map,arr);
//     }

//     public static void main(String[] args) {
//         Solution s = new Solution();
//         System.out.println(Arrays.toString(s.sortByBits(new int[]{4,6,3,9})));
//     }
// }

import java.util.Arrays;
import java.util.Comparator;

/**
 * Solution
 */
public class Solution {

    static void sortBySetBitCount(Integer arr[], int n)
    {
    Arrays.sort(arr,new MIN());
    }
    static class MIN implements Comparator<Integer>
    {
        public int compare(Integer a,Integer b)
        {
            int aa=Integer.bitCount(a);
            int bb=Integer.bitCount(b);
            if(aa>bb)
            return 1;
            else if(aa<bb)
            return -1;
            else
            return 0;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        Integer arr[]={4,6,3,9};
        int n=arr.length;
        
        s.sortBySetBitCount(arr,n);
        System.out.print("Sorted array: ");
        for (int i=0; i < n; ++i)
        {}
        System.out.print(arr[i] + " ");
    }
    }
    
    

