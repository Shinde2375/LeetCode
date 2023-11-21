import java.util.List;

class Solution17 {
    public String findDifferentBinaryString(List<String> nums) {
        int n = nums.size();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            char ch = nums.get(i).charAt(i);
            
            result.append((ch == '0') ? '1' : '0');
        }
        
        return result.toString();
    }
}
