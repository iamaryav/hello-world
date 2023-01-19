#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
	
	int num,count=1,sume=0,sumo=0;
	scanf("%d",&num);
	while(num!=0)
	{
		
		if(count%2==0)
		{
			sume = sume+(num%10);
		}
		else
		{
			sumo = sumo+(num%10);
		}
		num = num/10;
		count++;
	}
	int dif = fabs(sume-sumo);
	printf("%d",dif);
	return 0;
}

