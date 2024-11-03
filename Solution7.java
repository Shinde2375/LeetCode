public class Solution7 {

    int CheckPassword(char str[], int n) 
    { 
        Boolean isDigit=false,isCap=false,isSlashSpace=false,isNumStart=false,isLen=false; 
        
        isNumStart = (str[0] >='0' && str[0]<='9');
        
        for(int i=1;i< n;i++) 
        { if(str[i]==' '|| str[i]=='/') 
        isSlashSpace=true; 
        
        else if(str[i] >='A'&&str[i] <='Z') 
        isCap=true; 
        
        else if(str[i] >='0' && str[i] <='9')
        
        isDigit=true; 
    }
    
    if(!isNumStart && isDigit && isCap && !isSlashSpace && !isNumStart)
    
    return 1;
     else return 0;
     }

}
