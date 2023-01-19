//Program for quick sort using pivot element
#include<iostream>
using namespace std;
int quickSort(int*,int,int);
void swap(int *a,int *b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
void part(int a[],int lb,int ub)
{
	int l;
	if(lb<ub)
	{
		l = quickSort(a,lb,ub);
		part(a,lb,l-1);
		part(a,l+1,ub);
	}
}
int quickSort(int a[],int lb,int ub)
{
	int pivot,i,j;
	pivot = a[ub];
	i = lb-1;
	for(j=lb;j<ub;j++)
	{
		if(a[j]<=pivot)
		{
			i += 1;
			swap(&a[i],&a[j]);
		}
	}
	swap(&a[i+1],&a[ub]);
	return(i+1);
}
int main()
{
	int a[20],size,i;
	cout<<"Enter size of array :";
	cin>>size;
	cout<<"Enter array "<<endl;
	for(i=0;i<size;i++)
	{
		cin>>a[i];
	}
	part(a,0,size-1);
	cout<<"Sorted array is"<<endl;
	for(i=0;i<size;i++)
		cout<<a[i]<<"\t";
	return(0);
}
