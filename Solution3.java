import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter no of array");
        int n= sc.nextInt();
       
        int ans = Integer.MAX_VALUE;

        int [] arr= new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value of x");
        int x = sc.nextInt();
        System.out.println("enter value of y");
        int y = sc.nextInt();
        ArrayList<Integer> v_x = new ArrayList<>();
        ArrayList<Integer> v_y = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                v_x.add(i);
            }
            if(arr[i]==y)
            {
                v_y.add(i);
            }
        }

        if(v_x.isEmpty() || v_y.isEmpty())
        {
            System.out.println(-1);
        }
        else{
            for(int i=0;i<v_x.size();i++)   
            {
                for(int j=0;j<v_y.size();j++)
                {
                    int diff =Math.abs((v_x.get(i) - v_y.get(j) )- 1);
                    
                    if(diff < ans)
                    {   
                        ans = diff;
                    }
                }
            }
            System.out.println(ans);
        }
        
      
    }
}
