// Write a program in java to display the table of a number and print the sum of all the multiples in it
// Input:
// 5
// Expected Result Value:
// 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
// 275

import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int val=0, sum=0;
        for(int i=1;i<=10;i++)
        {
            val = n*i;
            System.out.print(val+" ");

            sum = sum+val;
        }
        System.out.println("\n"+sum);   
        

    }
}