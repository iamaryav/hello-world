// Representation of binary Tree using linked list 
#include<conio.h>
#include<iostream>
#include<stdlib.h>
using namespace std;
class Btree{
	private:
		int data;
		Btree *left,*right,*nw,*root;
	public:
		Btree()
		{
			root = NULL;
		}
		void insert(Btree *bp,int val)
		{
			if(bp==NULL)
			{
				bp = (Btree *)malloc(sizeof(Btree));
				bp->left = NULL;
				bp->data = val;
				bp->right = NULL;
			}
			else
			{
				if(bp->left == NULL)
					insert(left,val);
				else
					insert(right,val);	
			}
		}
		
	 
};
int main()
{
	
}
