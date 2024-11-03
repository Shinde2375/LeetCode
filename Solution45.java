//1436. Destination City        15/12/2023(Friday);


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution45 {
    
    public String destCity(List<List<String>> paths) {

         Set<String> st = new HashSet<>();
       for(List<String>path : paths)
       {
           String source = path.get(0);
           st.add(source);
       }
       for(List<String>path : paths)
       {
           String dest = path.get(1);
           
           if(!st.contains(dest))
           {
               return dest;
           }
       }
        return "";
    }
    }