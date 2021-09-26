#include<stdio.h>
#include<conio.h>
int max=20;
int i,a[20],top=-1,n;
void main()
{
	void push(int x),pop(),display();
	int choice,cont,x;
	do
	{
	    printf("\n\n1.push \n2.pop \n3.display\n");
	    printf("\nEnter Your choice:");
        scanf("%d",&choice);
	    switch(choice)
	    {
		case 1:
		{
		     printf("\nEnter the element to be pushed:");
             scanf("%d",&x);
		     push(x);
		     break;
		}
		case 2:
		{
		     pop();
		     break;
		}
		case 3:
		{
		    display();
		    break;
		}
	}
	printf("\nEnter 0 to quit and 1 to continue...\n");
    scanf("\n%d",&cont);
    } while(cont==1);
}
void push(x)
{
	if(top<max)
	{
		top=top+1;
		a[top]=x;
	}
	else
	    printf("unable to push...");
}
void pop()
{
	if(top<0)
	{
		printf("stack is UNDERFLOW");
	}
	else
	{
		printf("\nThe top element %d is deleted",a[top]);
		top=top-1;
		n=top;
	}
}
void display()
{
	if(top<0)
	{
		printf("stack is UNDERFLOW");
	}
	else
	{
		printf("\nThe elements in the stack are...\n");
		for(i=top;i>=0;i--)
		    printf("\n%d",a[i]);
	}
}
