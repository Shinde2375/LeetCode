//380. Insert Delete GetRandom O(1)         16/01/2024(Tuesday);

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Solution76 {
 //here class name is RandomizeSet{} coz we use its constructor 
	Set<Integer> s = new HashSet<>();
	 private List<Integer> vals = new ArrayList<>();

	public RandomizedSet() {

	}

	public boolean insert(int val) {

		int v = val;
		
		if(s.contains(v))
		{
			return false;
		}
		else
		{
			s.add(v);
			vals.add(v);
			return true;
		}

	}

	public boolean remove(int val) {
		 if (s.contains(val)) {
	            s.remove(val);
	            vals.remove(Integer.valueOf(val)); // Remove the Integer object, not the index
	            return true;
	        } else {
	            return false;
	        }
	}

	public int getRandom() {

		int random = new Random().nextInt(vals.size());
	      return vals.get(random);
	}
	


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
