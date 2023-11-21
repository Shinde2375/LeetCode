class Solution9 {
    public int strStr(String haystack, String needle) {
 
        if(haystack.contains(needle))
        {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        System.out.println(s.strStr("Vishal", "Hii"));
    }
}