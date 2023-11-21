import java.util.Arrays;

class Solution16{
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

      Arrays.sort(arr);
      arr[0] =1;
      for(int i=1;i<arr.length;i++)
      {
        if(Math.abs(arr[i] -arr[i-1])<=1)
        {
            continue;
        }
        else{
            arr[i] = arr[i-1]+1;
        }
      }
      return arr[arr.length -1];




    }
    public static void main(String[] args) {
        Solution16 s = new Solution16();
        int[] arr = {3,9,7,3};
        System.out.println(s.maximumElementAfterDecrementingAndRearranging(arr));
    }
}