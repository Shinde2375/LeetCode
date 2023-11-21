// Int Calculate(int m, int n);

// The function accepts 2 positive integer ‘m’ and ‘n’ as its arguments.You are required to calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive and return the same.
// Note

import java.util.Scanner;

public class Solution4 {

    int sum = 0;
public int valu(int m,int n)    
{
    for(int i=m ;i<n;i++)
    {
        if((i%3 == 0) && (i%5==0))
        {
            sum = sum+ i;
        }
    }
    return sum;
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    Solution4 s = new Solution4();
   System.out.println( s.valu(m, n));
}
}
