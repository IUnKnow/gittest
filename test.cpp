#include <ctype.h>
#include <stdio.h>
#include <string.h>


int main(int argc,char* argv[]){
	
    char szBuf[] = "12345@#$#fs&*(&";
	int i;
	
    for(i = 0; i < strlen(szBuf); i++){
		
        if(isalnum(szBuf[i]))
		{
            printf("%c This is a character \r\n",szBuf[i]);
        }else
		{
            printf(" %c This is not a character \r\n",szBuf[i]);
        }
    }
	
	return 0;
}
