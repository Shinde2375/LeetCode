import java.util.Arrays;

class Solution2 {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = countBit(arr[i]) * 10001 + arr[i];
        }
        Arrays.sort(res);
        for (int i = 0; i < n; i++) {
            res[i] %= 10001;
        }
        return res;
    }

    private int countBit(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.sortByBits(new int[]{3,8,1,9,6,4})));
    }
}