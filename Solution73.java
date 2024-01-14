//1347. Minimum Number of Steps to Make Two Strings Anagram         13/01/2024(Saturday);

import java.util.HashMap;

public class Solution73 {

        public int minSteps(String s, String t) {
            HashMap<Character, Integer> h1 = new HashMap<>();
    
            for (char c : s.toCharArray()) {
                h1.put(c, h1.getOrDefault(c, 0) + 1);
            }
    
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
    }
