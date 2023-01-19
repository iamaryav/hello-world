// Program for heap sort
#include<iostream>
using namespace std;
#define max 25
int heap[max];
void printheap(int);
void heapsort(int*,int);
void build_heap(int*,int);
void del_heap(int*,int);
void swap(int*,int*);
int main()
{
	int i,size;
	cout<<"Enter no. 0f element of an array :";
	cin>>size;
	for(i=0;i<size;i++)
	{
		cout<<"Enter Heap "<<i<<":";
		cin>>heap[i];
	}
	cout<<"The unsorted array is :"<<endl;
	printheap(size);
	heapsort(heap,size);
	cout<<"The sorted array is :"<<endl;
	printheap(size);
	return(0);
}
void printheap(int size)
{
	/*
	  For printing heap
	  */
	int i;
	for(i=0;i<size;i++)
	{
		cout<<heap[i]<<"\t";
	}
	cout<<endl;
}
void heapsort(int *heap,int size)
{
	build_heap(heap,size);
	del_heap(heap,size);
}
void build_heap(int *heap,int size)// For building a max heap
{
	int i,son,father,temp;
	for(i=1;i<size;i++)
	{
		son = i;
		temp = heap[i];
		father = (son-1)/2;
		while(son>0 && heap[father]<temp)
		{
			heap[son] = heap[father];
			son = father;
			father = (son-1)/2;
		}
		heap[son] = temp;
	}
}
void del_heap(int *heap,int size)// For sorting a heap in increasing order
{
	int i;
	for(i=size-1;i>0;i--)
	{
		swap(&heap[0],&heap[i]);
		build_heap(heap,i);//For readjust the remaining heap
	}
}
void swap(int *a,int *b)// For swaping two vlaues
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
