#include<stdio.h>
int toh(char,char,char,int);
int main(){
	
	int n;
	char s,d,v;
	
	printf("Enter number of disk :");
	scanf("%d",&n);
	
	s='A';
	d='C';
	v='B';
	
	toh(s,v,d,n);
	
	return(0);
}
int toh(char s, char v, char d, int n){
	
	if(n==1){
		return (printf("Move a disk from : %c -> %c \n",s,d));
	}
	else{
		
		toh(s,d,v,n-1);
		toh(s,v,d,n-1);
		toh(v,s,d,1);
		
	}
}
