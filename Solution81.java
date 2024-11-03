//796. Rotate String                    //04-11-2024



public class Solution81 {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        return false;
            
            return (s+s).contains(goal);
            }    
}

