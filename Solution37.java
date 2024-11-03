//1716. Calculate Money in Leetcode Bank                        6/12/2023(Wednusday)
 

class Solution37 {
     int sum =0;
int k=1;

    public int totalMoney(int n) {
          
        while(n > 0)
        {
            
         
            for(int i=0;i<Math.min(n, 7);i++)
            {
                sum += i+k;
            }
               n -= 7;
            k++;
         
        }
        return sum;
    }
}