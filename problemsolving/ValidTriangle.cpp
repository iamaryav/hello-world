#include<stdio.h>
#include<math.h>

struct point{
	int x,y;
};
int main(){
	struct point *a, *b, *c,d,e,f;
	double l1,l2,l3;
	
	a=&d;
	b=&e;
	c=&f;
	
	printf("Enter the first coordinate of point :");
	scanf("%d %d",&a->x,&a->y);
	printf("Enter the second coordinate of point :");
	scanf("%d %d",&b->x,&b->y);
	printf("Enter the second coordinate of point :");
	scanf("%d %d",&c->x,&c->y);
	
	//scanf("%d %d %d",&l1,&l2,&l3);// for checking purpose
	
	l1 = pow((pow((a->x - b->x),2)+pow((a->y - b->y),2)),0.5);
	l2 = pow((pow((b->x - c->x),2)+pow((b->y - c->y),2)),0.5);
	l3 = pow((pow((c->x - a->x),2)+pow((c->y - a->y),2)),0.5);
	
	//double max = l1>l2?(l1>l3?l1:l3):(l2>l3?l2:l3);// NO need of this
	
	if(l1>=l2+l3 || l3>= l1+l2 || l2>= l1+l3)
	{
		printf("wrong Triangle :\n");
	}
	else{
		printf("Right Triangle :\n");
	}
	
	//printf("%lf\n",l1);
	//printf("%lf\n",l2);
	//printf("%lf\n",l3);
	//printf("%lf",max);
	
	return 0;
}
