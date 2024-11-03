//2125. Number of Laser Beams in a Bank                     03/01/2024 (Wednusday);



public class Solution63 {

    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int total =0;
         for(String row: bank)
         {
             int cur = calc(row);
             if(cur==0)
             continue;

             total += cur * prev;
             prev = cur;
         }
         return total;
    }

    private int calc(String s)
    {
        int count =0;
        for(char c : s.toCharArray())
        count += c - '0';

        return count;
    }
}
