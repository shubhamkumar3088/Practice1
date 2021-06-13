import java.util.*;
public class Reverse_Of_String_UsingStack {
	int size;
	char arr[];
	int top;
	public Reverse_Of_String_UsingStack(int size)
	{
		this.size=size;
		this.arr=new char[size];
		this.top=-1;
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return(top==size-1);
	}
	public void push(char c)
	{
		if(!isFull())
		{
			top++;
			arr[top]=c;
			//System.out.println("The character has been pushed in the stack");
			
		}
		else
		{
			System.out.println("stack is full cannot enter more items");
		}
	}
	int count=0;
	public void reverse()//only for string reverse//
	{  
		while(!isEmpty())
		{    char temp=arr[top];
			top--;
			
			arr[count]=temp;
			count++;
			
		}
	}
public void display()
{
	for(int i=0;i<count;i++)
	{
		System.out.println(arr[i]);
	}
}
	

	public static void main(String[] args) {
		
		Reverse_Of_String_UsingStack obj=new Reverse_Of_String_UsingStack(10);
		obj.push('a');
		obj.push('b');
		obj.push('c');
		obj.push('d');
		obj.push('e');
		obj.push('f');
		obj.push('g');
		obj.reverse();
		obj.display();
		
		
	

	}

}
