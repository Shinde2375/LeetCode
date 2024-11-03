//  1561. Maximum Number of Coins You Can Get


import java.util.Arrays;
import java.util.Scanner;

public class Solution25 {
      public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
    int res =0;
        for(int M = n/3;M<n;M +=2)
        {
            res +=  piles[M];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution25 s = new Solution25();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many no of array you want ! ");//Array must be multiple X3 i.e(3,6,9,12 ..etc)
        int n = sc.nextInt();
        int[] piles = new int[n];
        System.out.println("Enter "+n+" Array value:");
        for(int i=0;i<n;i++)
        {
            piles[i] = sc.nextInt();
        }
        System.out.println("Max value take by me is :"+s.maxCoins(piles));

    }
}
