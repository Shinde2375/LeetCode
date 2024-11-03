//2706. Buy Two Chocolates  20/12/2023(Wednusday)


class Solution50 {
    public int buyChoco(int[] arr, int key) {

        int ans = Integer.MAX_VALUE;
        int fin;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j ) {
                    int sum = arr[i] + arr[j];
                    ans = Math.min(ans, sum);
                }
            }
        }
       
        fin = key - ans;
        if(fin>=0){
        return fin;
        }
        else{
            return key;
        }
    }
}
