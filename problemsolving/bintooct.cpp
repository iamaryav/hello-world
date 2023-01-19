#include<stdio.h>
#include<math.h>
int main(){
	
	long int num,dec=0,octal=0,bin;
	int count=0;
	printf("Enter binary no. : ");
	scanf("%d",&bin);
	while(bin !=0 )
	{
		dec = dec+(bin%10*(pow(2,count)));
		count++;
		bin = bin/10;
	}
	printf("%d\n",dec);
	count=1;
	while(dec !=0 )
	{
		octal += (dec%8)*count;
		dec = dec/10;
		count *= 10;
	}
	printf("Octal no. is : %d",octal);
	return 0;
}
