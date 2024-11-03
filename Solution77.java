//1207. Unique Number of Occurrences            17/01/2024(Wednusday)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution77 {
    
    public boolean uniqueOccurrences(int[] arr) {
        
	  Arrays.sort(arr);
      List<Integer> li = new ArrayList<>();
      int count = 1; // Initialize count to 1 for the first element

      for (int i = 1; i < arr.length; i++) {
          if (arr[i - 1] == arr[i]) {
              count++;
          } else {
              li.add(count);
              count = 1; // Reset count for a new element
          }
      }

      // Add the count of the last element to the list
      li.add(count);

      // Check if all counts in the list are distinct
      for (int i = 0; i < li.size(); i++) {
          for (int j = i + 1; j < li.size(); j++) {
              if (li.get(i).equals(li.get(j))) {
                  return false;
              }
          }
      }

      return true;
    }
}
