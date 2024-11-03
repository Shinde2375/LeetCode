//1422. Maximum Score After Splitting a String      22/12/2023 (Friday);

public class Solution52 {
    public int maxScore(String s) {
	       
        int res =0;
        
        for(int i=0;i<s.length()-1;i++)
        {
            int curcount =0;
            for(int j=0;j<=i;j++)
            {
                if(s.charAt(j)=='0')
                {
                    curcount++;
                }
            }
            
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(j) == '1')
                {
                    curcount++;
                }
            }
            
            res = Math.max(res, curcount);
        }
        
        return res;
       }

}
