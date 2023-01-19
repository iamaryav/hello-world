#include<stdio.h>
#include<stdlib.h>
int main(){
	
	int size,i,count=0;
	
	printf("Enter the size of string :");
	scanf("%d",&size);
	printf("Enter string :");
	char *str = (char*)malloc(size * sizeof(char));
	scanf("%s",str);
	
	for(i=0;i<size;i++){
		if(*(str+i)>=48 && *(str+i)<=57){
			
			count++;
		}
	}
	printf("Number of digit :%d",count);
	return(0);
}
