//1578. Minimum Time to Make Rope Colorful   27/12/23(Wednusday);


public class Solution56 {
    
    public int minCost(String colors, int[] n)  {
        int totalTime =0;
        int i=0,j=0;
        while(i<n.length && j<n.length)
        {
            int currTotal=0,currMax =0;
            while(j<n.length && colors.charAt(i)==colors.charAt(j))
            {

                currTotal += n[j];
                currMax = Math.max(currMax,n[j]);
                j++;
            }
            totalTime += currTotal - currMax;
            i=j;
        }
        return totalTime;
     }
}
