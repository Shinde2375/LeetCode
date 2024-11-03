//191. Number of 1 Bits

public class Solution30 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
    return Integer.bitCount(n);
    
    }
}

//Example 1:

// Input: n = 00000000000000000000000000001011
// Output: 3
// Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.