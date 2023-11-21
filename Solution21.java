
//2391. Minimum Amount of Time to Collect Garbage
class Solution21 {
    public int garbageCollection(String[] garbage, int[] travel) {
     int n = garbage.length;

     int G =0;
     int P =0;
     int M =0;

     int total = 0;

     for(int i=0;i<n;i++)
     {
         for(int j=0;j<garbage[i].length();j++)
         {
             if(garbage[i].charAt(j)== 'M')
           
           {  M=i;
         }
         else if(garbage[i].charAt(j) == 'P')
         {
             P=i;
         }
         else
         {
             G=i;
         }
         
         total++;
         
     }
     }

        for(int i=1;i<travel.length;i++)
        {
            travel[i] += travel[i-1];
        }

        total += M > 0 ? travel[M-1] :0;
        total += P> 0 ? travel[P-1] :0;
        total += G >0 ? travel[G-1]:0;

        return total;
     
    }

    public static void main(String[] args) {
        Solution21 s = new Solution21();
        String [] g={"GG", "MM", "GG"};
        int [] t={4,6,8};
        System.out.println("Minimum amount of time is "+s.garbageCollection(g,t));


    }
}