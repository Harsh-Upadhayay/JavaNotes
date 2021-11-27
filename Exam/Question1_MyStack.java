/*
Write a java class MyStack in file MyStack.java that implements stack with following methods. – 

1. public void push(E item) : Pushes the item onto the top of the stack. 

2. public E pop() : Removes the element at the top of the stack and returns it. Throw EmptyStackException if the stack is empty. 

3.  public E peek() : Returns the top element without removing from top of the stack. Throw EmptyStackException if the stack is empty. 

4. The program should throw an exception if the stack is empty and the peek or pop function is called.

All other methods or variables in your implementation should be private. 
*/

package Exam;

import java.util.Scanner;

class MyStack extends RuntimeException
{
	
	private static final Exception StackFullException = null;
	private static final Exception StackEmptyException = null;
	private int elements[]=new int[10];
	private int top;
	
	MyStack()
	{
		top = -1;        // -1 used to show empty stack
	}

	public void push(int item) throws Exception  
	{
	if(top == 10)                      
		{
		throw StackFullException;
		}
		else
		{
		 elements[++top] = item;
		}
	}
	
	public int pop() throws Exception	
	{
		if(top<0)
		{
			throw StackEmptyException;
		}
		else
			return elements[top--];
	}
	
	private boolean isEmpty() 
	{
		return (top == -1);
	}
	
	public int peek() throws Exception
	{
		if (top == -1) throw StackEmptyException;
		else return elements[top];
	}
	
	public void printStack()		//for printing the stack contains
	{
		int value=0;
		
		if(!isEmpty())
		{
			try {
				value = pop();
			} catch (Exception stackEmpty) {
				System.out.println("Stack empty Exception Occured");
				stackEmpty.printStackTrace();
			}
			System.out.println(value);
			printStack();
		}
		try {
			push(value);
		} catch (Exception StackFull) {
			System.out.println("Stack FUll Exception Occured");
			StackFull.printStackTrace();
		}
	}
	
	
	
	// Main
	public static void main(String[] args) 
	{
								  
		MyStack ob1=new MyStack();           
		int choice;
		Scanner s = new Scanner(System.in);    

		while(true)
		{
			System.out.println("ente your choice");
			System.out.println("1 to Push");
			System.out.println("2 to pop");
			System.out.println("3 to peek");
			System.out.println("4 to exit");
			choice = s.nextInt();							
			switch(choice)
			{
			case 1: System.out.println("Enter your element :");
				try {
					ob1.push(s.nextInt());
				} catch (Exception e) {
					System.out.println("Stack Full Exception Occured");
					e.printStackTrace();
				}                  
					break;

			case 2: try {
					System.out.println("popped element  "+ ob1.pop());
				} catch (Exception e) {
					System.out.println("Stack empty Exception Occured");
					e.printStackTrace();
				}
					break;

			case 3: System.out.println("stack element is ");
				try {
					ob1.peek();
				} catch (Exception e) {
					System.out.println("Stack empty Exception Occured");
					e.printStackTrace();
				}
					break;
			default: System.out.println("Good Bye"); 
					return ;

			}
		
		}
		
	}

};

