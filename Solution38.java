//1903. Largest Odd Number in String                    07/12/2023  (Thursday)


class Solution38 {
   public String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1;i>=0;i--)
        {
            if(Character.getNumericValue(num.charAt(i))%2 !=0)
            {
                return num.substring(0, i+1);

            }
        }
        return "";

    }
}