//program for dequeue
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct dequeue{
	int arr[30],f1,f2;
}dq;
void insert1(dq *q,int data)
{
	if(q->f1 == -1)
	{
		printf("Dequeue is full \n");
	}
	else
	{
		q->arr[q->f1--] = data;
	}
}
void insert2(dq *q,int data)
{
	if(q->f2 == 19)
	{
		printf("Dequeue is full \n");
	}
	else
	{
		q->arr[++q->f2] = data;
	}
}
void delete1(dq *q)
{
	if(q->f1 == q->f2)
	{
		printf("Dequeue is empty \n");
	}
	else
	{
		printf("Deleted value is %d \n",q->arr[++q->f1]);
	}
}
void delete2(dq *q)
{
	if(q->f1 == q->f2)
	{
		printf("Dequeue is empty \n");
	}
	else
	{
		printf("Deleted value is %d \n",q->arr[q->f2--]);
	}
}
void display(dq *q)
{
	if(q->f1 == q->f2)
	{
		printf("Dequeue is empty \n");
	}
	else
	{
		int i;
		for(i=q->f1+1;i<=q->f2;i++)
		{
			printf("%4d",q->arr[i]);
		}
	}
}
int main()
{
	dq q;
	int ch,x;
	q.f1 = q.f2 =9;
	while(1)
	{
		printf("\npress 1 for insert 1st end\npress 2 for insert at 2nd end\npress 3 for delete at 1st end\npress 4 for delete at 2nd end\npress 5 for display dequeue\npress 6 for exit\n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:printf("Enter value for insertion at first end\n");
				   scanf("%d",&x);
				   insert1(&q,x);
				   printf("Value inserted\n");
				   break;
			case 2:printf("Enter value for insertion at 2nd end\n");
				   scanf("%d",&x);
				   insert2(&q,x);
				   printf("Value Inserted\n");
				   break;
			case 3:delete1(&q);
				   printf("Value deleted at first end\n");
				   break;
			case 4:delete2(&q);
				   break;
			case 5:display(&q);
				   break;
			 
			case 6:exit(1);
			
			default:printf("Invalid selection\n");	
				   
		}
	}
}
