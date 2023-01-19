#include<iostream>
using namespace std;
void mergeSort(int [],int,int,int);
int temp[20];
void part(int a[],int lb,int ub)
{
	if(lb<ub)
	{
		int mid;
		mid = (lb+ub)/2;
		part(a,lb,mid);
		part(a,mid+1,ub);
		mergeSort(a,lb,mid,ub);
	}
}
void mergeSort(int a[],int lb,int mid,int ub)
{
	int i,j,k;
	//int temp[20];
	i=lb;
	j = mid+1;
	k = lb;
	while(i<=mid && j<=ub)
	{
		temp[k++]=(a[i]<=a[j])?a[i++] : a[j++];
	}
	while(i<=mid)
	{
		temp[k++] = a[i++];
	}
	while(j<=ub)
	{
		temp[k++] = a[j++];
	}
	for(k=lb ;k<=ub;k++)// for saving sorted order in arrays
	{
		a[k] = temp[k];
	}
}
int main()
{
	int a[20],i,size;
	cout<<"Enter size of an array :";
	cin>>size;
	cout<<"Enter an array "<<endl;
	for(i=0;i<size;i++)
	{
		cin>>a[i];
	}
	part(a,0,size-1);
	for(i=0;i<size;i++)
	{
		cout<<a[i]<<"\t";
	}
	return(0);
}
