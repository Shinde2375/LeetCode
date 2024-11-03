//1704. Determine if String Halves Are Alike            12/01/2024(Friday)

public class Solution72 {
    public boolean halvesAreAlike(String s){

        int i =0;
        int j=s.length()-1;
        int lcount=0;
        int rcount=0;
        while(i< j)
        {
            if(isVovel(s.charAt(i)))
                    {
                lcount++;
                    }
            if(isVovel(s.charAt(j)))
                    {
                rcount++;
                    }
            i++;
            j--;
            
        }
        return lcount== rcount;
        
}

    public static boolean isVovel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u' ||  
                ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' ||  ch == 'U')
                return true;
                else
                    return false;
    }
}
