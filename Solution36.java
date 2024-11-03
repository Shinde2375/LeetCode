//1688. Count of Matches in Tournament             || 5-12-23 (Tuesday);

//Approach- 1 : 

class Solution {
    public int numberOfMatches(int n) {
        if (n == 1)
            return 0;
        if (n % 2 == 0)
            return n / 2 + numberOfMatches(n / 2);
        else
            return (n - 1) / 2 + numberOfMatches((n - 1) / 2 + 1);
    }
}

// Approach- 2: (Tricky Question but Its not an Interview Solution)

// public class Solution36 {
// public int numberOfMatches(int n) {
// return n-1;
// }
// }
