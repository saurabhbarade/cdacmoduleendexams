class Stack{
	int arr[];
	int top1;
	int top2;
	int size;
	
	Stack(int size){
		this.size=size;
		int arr[]= new int[size];
		top1=-1;
		top2=size;
	}
	
	boolean isEmpty1(){
		return (top1<0);
	}
	
	boolean isEmpty2(){
		return (top2==size);
	}
	
	boolean isFull(){
		return (top1==top2);
	}
	
	void push1(int data){
		if(isFull())
			return;
		else
		{
			arr[++top1]=data;
		}
	}
	
	void push2(int data){
		if(isFull())
			return;
		else
		{
			arr[--top2]=data;
		}
	}
	
	int pop1(){
		if(isEmpty1())
			return -1;
		else
		{
			int element=arr[top1];
			top1--;
			return element;
		}
		
	}
	
	
	int pop2(){
		if(isEmpty2())
			return -1;
		else
		{
			int element=arr[top2];
			top1++;
			return element;
		}
		
	}
	
	public static void main(String args[]){
		
		Stack s = new Stack(7);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		System.out.println("Popped element from stack1 is "+s.pop1());
		System.out.println("Popped element from stack1 is "+s.pop2());
	}
}