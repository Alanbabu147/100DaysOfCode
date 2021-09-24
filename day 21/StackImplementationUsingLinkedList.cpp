#include<stdio.h>
#include<conio.h>
#include<malloc.h>
struct node
{
   int data;
   struct node *next;
};
typedef struct node* list;
list push(list,int);
list top (list);
list pop(list);
void view(list);

void main()
{
   list l=NULL,tmp;
   int choice,cont,x;
   do
   {
      printf("**********Stack using linked list************* ");
      printf("\n1.Push\n2.top\n3.pop\n4.Display\n");
      printf("\nEnter your option(1,2,3,4):");
      scanf("%d",&choice);
      switch(choice)
      {
         case 1:
            printf("Enter the element to be pushed:");
            scanf("%d",&x);
            l=push(l,x);
            break;
         case 2:
            tmp=top(l);
            if(tmp!=NULL)
                printf("The poped element is %d",tmp->data);
            break;
         case 3:
            l=pop(l);
            break;
         case 4:
            view(l);
            break;
      }
      printf("\nEnter 0 to exit and 1 to continue:");
      scanf("%d",&cont);
 }while(cont==1);
}
list push(list l1,int v)
{
   list newnode;
   newnode=malloc(sizeof(struct node));
   newnode->data=v;
   newnode->next=l1;
   return newnode;
}
list top(list l1)
{
    list tmp;
    if(l1!=NULL)
        return l1;
    else
    {
        printf("Stack Empty");
        return NULL;
    }
}
list pop(list l1)
{
   list tmp;
   if(l1==NULL)
   {
      printf("\n Stack is empty");
      return NULL;
   }
   else
   {
      tmp=l1;
      printf("\nThe element popped out from stack is %d",tmp->data);
      l1=l1->next;
      free(tmp);
      return l1;
   }
}
void view(list l1)
{
   printf("\nStack contents\n");
   while(l1!=NULL)
   {
      printf("\n%d",l1->data);
      l1=l1->next;
   }
}
