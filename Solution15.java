
//  2785. Sort Vowels in a String       13/11/23    Monday

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution15 {
   
    public String sortVowels(String s)
    {
            List<Character> vowleList = new ArrayList<>(); // lEetcOde
           List<Integer> vowelPosition = new ArrayList<>();

           for(int i=0;i<s.length();i++)
           {
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
            {
                vowleList.add(ch);
                vowelPosition.add(i);

            }
        }
            Collections.sort(vowleList);
            char[] ans= s.toCharArray();
            for(int j=0;j<vowelPosition.size();j++)
            {
               ans[vowelPosition.get(j)] = vowleList.get(j);
            }
    return new String(ans);
}
public static void main(String[] args) {
    Solution15 s =new Solution15();
    System.out.println("Sorted string is : "+s.sortVowels("hellO"));
    
  }
}