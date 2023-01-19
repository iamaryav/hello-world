//Program for binary search tree
#include<iostream>
#include<stdlib.h>
using namespace std;
typedef struct btreenode{
	struct btreenode *left,*right;
	int data;
}btree;
void create_empty_node(btree **bp)
{
	*bp = NULL;
}
void insert(btree **bp,int item)
{
	if(*bp == NULL)
	{
		(*bp)= (btree *)malloc(sizeof(btree));
		(*bp)->left = NULL;
		(*bp)->data = item;
		(*bp)->right = NULL;
	}
	else
	{
		if(item<(*bp)->data)
			insert(&((*bp)->left),item);
		else
			insert(&((*bp)->right),item);
	}
}
void btreeprint(btree *bp,int h)
{
	int i;
	if(bp != NULL)
	{
		btreeprint(bp->left,h+1);
		for(i=0;i<h;i++)
			printf(" ");
		printf("%d\n",bp->data);
		btreeprint(bp->right,h+1);
	}
}
void btheight(btree *bp,int *h)
{
	int hleft,hright;
	if(bp==NULL)
	{
		*h = 0;
	}
	else
	{
		btheight(bp->left,&hleft);
		btheight(bp->right,&hright);
		if(hleft>hright)
		{
			*h = hleft+1;
		}
		else
		{
			*h = hright+1;
		}
	}
}
btree* search(btree *root,btree **par,int val)
{
	
	while(root != NULL && root->data != val)
	{
		*par = root;
		if(val<root->data)
		{
			root = root->left;
		}
		else
		{
			root = root->right;
		}	
	}
	return root;
}
void del_case_ab(btree**,btree*,btree*);
void del_case_c(btree**,btree*,btree*);
void del_node(btree **root,int item)
{
	btree *loc,*par,*bp;
	bp = *root;
	loc = search(bp,&par,item);
	if(loc==NULL)
	{
		printf("Node is not found in the tree\n");
		exit(0);
	}
	if(loc->right != NULL && loc->left != NULL)
	{
		del_case_c(root,loc,par);
	}
	else
		del_case_ab(root,loc,par);
}
void del_case_ab(btree **root,btree *loc,btree *par)
{
	btree *child;
	if((loc->left==NULL) && (loc->right==NULL))
		child = NULL;
	else if(loc->left!=NULL)
		child=loc->left;
	else
		child=loc->right;
	if(par!='\0')
	{
		if(loc==par->left)
			par->left = child;
		else
			par->right = child;
	}
	else
		*root = child;
	free(loc);
}
void del_case_c(btree **root,btree *loc,btree *par)
{
	btree *child,*suc,*parsuc,*ptr,*save;
	ptr = loc->right;
	save = loc;
	/*find Inorder successor of and parent*/
	while(ptr->left != NULL)
	{
		save = ptr;
		ptr = ptr->left;
	}
	suc = ptr;
	parsuc = save;
	/*Delete in-order successor using del_case_ab*/
	del_case_ab(root,suc,parsuc);
	/*Replace node by its inorder successor*/
	if(par != '\0')
	{
		if(loc == par->left)
			par->left = suc;
		else
			par->right = suc;
	}
	else 
		*root = suc;
	suc->left = loc->left;
	suc->right = loc->right;
}
int main()
{
	int choice,e,height,btsrch;
	btree *root,*rtmax,*rtmin,*bp,*par;
	printf("\n Options availabel\n");
	printf("\n1. Insert node\n2. delete node\n3. height of tree\n4. searching a node\n5. print original binary tree\n0. Exit\n");
	create_empty_node(&root);
	while(1)
	{
		printf("\n\nEnter your choice\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:printf("\nEnter Element to be inserted:");
				   scanf("%d",&e);
				   insert(&root,e);
				   break;
			case 2:printf("\nEnter Element to be deleted:");
				   scanf("%d",&e);
				   del_node(&root,e);
				   break;
			case 3:btheight(root,&height);
			       printf("\nHeight of binary tree = %d",height);
			       break;
			case  4:printf("\nEnter element to search :");
					scanf("%d",&e);
					par = root;
					bp = search(root,&par,e);
					if(bp != NULL)
					{
						printf("\n search is sucessfull");
						printf("\nparent is %d",par->data);
					}
					else
						printf("\nSearch is unsucessfull");
					break;
			case 5:btheight(root,&height);
				   btreeprint(root,height);
				   break;
			case 0:exit(1); 
		}
	}
}
