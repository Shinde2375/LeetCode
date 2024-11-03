//1347. Minimum Number of Steps to Make Two Strings Anagram         13/01/2024(Saturday);

import java.util.HashMap;

public class Solution73 {
    //Approach 1;
        public int minSteps(String s, String t) {
            HashMap<Character, Integer> h1 = new HashMap<>();
    
            for (char c : s.toCharArray()) {
                h1.put(c, h1.getOrDefault(c, 0) + 1);
            }
                                                                       //T.C = O(n);its execute   runtime = 60ms
            int count = 0;
            for (char c : t.toCharArray()) {
                if (!h1.containsKey(c) || h1.get(c) == 0) {
                    count++;
                } else {
                    h1.put(c, h1.get(c) - 1);
                }
            }
    
            return count;
        }

            //Approach 2
    //             public int minSteps(String s, String t) {
    //                 int[] count = new int[26];
    //                 byte[] sb = s.getBytes(), tb = t.getBytes();
    //                 for (byte b : sb) {
    //                   count[b - 'a']++;
    //                 }                                                              //T.C = O(N) But its execute verry fast  runtime = 5ms
    //                 for (byte b : tb) {
    //                   count[b - 'a']--;
    //                 }
    //                 int res = 0;
    //                 for (int i : count) {
    //                   res += Math.abs(i);
    //                 }
    //                 return res / 2;
    // }



}