//1758. Minimum Changes To Make Alternating Binary String   (24/12/2023) Sunday;

public class Solution54 {
        public int minOperations(String s) {
            char a[]=s.toCharArray();
            int cnt=0;
            char next=a[0]=='0'?'1':'0';
            for(int i=1;i<a.length;i++)
            {
               if(a[i]!=next)
               cnt++;
               next=next=='0'?'1':'0';
            }
            return Math.min(cnt,a.length-cnt);
        }
    }