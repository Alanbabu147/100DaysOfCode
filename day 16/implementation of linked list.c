#include <stdio.h>
#include <conio.h>
struct node
{
	int elem;
	struct node *next;
};
typedef struct node*list;
list insert(list l1,int pos,int v);
list del(list l1,int v);
list find(list l1,int v);
list findprevious(list l1,int v);
void print(list);
void main()
{
	list l=NULL,t=NULL;
	int val,pos,choice=0;
	while(choice<5)
	{
		printf("\n1.Insert\n2.delete\n3.find\n4.Print list\n5.Exit");
		printf("\nEnter Your Choice :");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				printf("Enter position and element");
				scanf("%d %d",&pos,&val);
				l=insert(l,pos,val);
				break;
			case 2:
				printf("Enter element to delete");
				scanf("%d",&val);
				l=del(l,val);
				break;
			case 3:
				printf("Enter element to find");
				scanf("%d",&val);
				t=del(l,val);
				printf("element found at %d",t->elem);
				break;
			case 4:
				print(l);
				getch();
				break;
		}
	}
}
list find (list l1,int v)
{
	while(l1!=NULL)
	{
		if(l1->elem==v)
			return l1;
		l1=l1->next;
	}
	return NULL;
}
list findprevious (list l1,int v)
{
	while(l1->next!=NULL)
	{
		if(l1->next->elem==v)
			return l1;
		l1=l1->next;
	}
	return NULL;
}
list insert(list l1,int pos,int v)
{
	list newnode,l2;
	int i;
	l2=l1;
	newnode=malloc(sizeof(struct node));
	newnode->elem=v;
	if(pos==1)
	{
		newnode->next=l1;
		return newnode;
	}
	else
	{
		for(i=1;i<pos-1&&l1->next!=NULL;i++)
		{
			l1=l1->next;
		}
		newnode->next=l1->next;
		l1->next=newnode;
		return l2;
	}
}
list del(list l1,int v)
{
	list tmp,fp;
	if(l1->elem==v)
	{
		tmp=l1;
		l1=l1->next;
		free(tmp);
		return l1;
	}
	else
	{
		fp=findprevious(l1,v);
		tmp=fp->next;
		fp->next=fp->next->next;
		free(tmp);
		return l1;
	}
}
void print(list l1)
{
	while(l1!=NULL)
    {
        printf("%d\n",l1->elem);
		l1=l1->next;
    }
}
