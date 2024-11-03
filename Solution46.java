//242. Valid Anagram        16/12/2023 (Saturday)


import java.util.Arrays;

public class Solution46 {
    
    public boolean isAnagram(String s, String t) {
    
        if(s.length() != t.length())
        {
            return false;
        }

        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();

        Arrays.sort(chs);
        Arrays.sort(cht); 

        return Arrays.equals(chs,cht);
    }
}