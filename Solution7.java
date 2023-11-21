public class Solution7 {

    int CheckPassword(char str[], int n) 
    { 
        Boolean isDigit=false,isCap=false,isSlashSpace=false,isNumStart=false,isLen=false; 
        
        isLen = n greater than=4; 
        isNumStart = (str[0] greater than ='0' && str[0] less than ='9');
        
        for(int i=1;i less than n;i++) 
        { if(str[i]==' '|| str[i]=='/') 
        isSlashSpace=true; 
        
        else if(str[i] greater than ='A'&&str[i] less than ='Z') 
        isCap=true; 
        
        else if(str[i] greater than ='0' && str[i] less than ='9')
        
        isDigit=true; 
    }
    
    if(!isNumStart && isDigit && isCap && !isSlashSpace && !isNumStart)
    
    return 1;
     else return 0;
     }

}
