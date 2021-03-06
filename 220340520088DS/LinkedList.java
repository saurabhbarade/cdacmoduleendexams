import java.util.*;
class LinkedList{
	LinkedListNode head;
	static class LinkedListNode{
		int data;
		LinkedListNode next;
		LinkedListNode prev;
	
	LinkedListNode(int data){
		this.data=data;
		next=null;
		prev=null;
		}
	}
	
	boolean isEmpty(){
		return (head==null);
	} 
	
	void insert(int data){
		LinkedListNode newnode = new LinkedListNode(data);
		if(isEmpty()){
			head=newnode;
		}
		else
		{
			LinkedListNode temp=head;
			while(temp.next!=null){
				temp=temp.next;
				}
			newnode.prev=temp;
			temp.next=newnode;
		}			
	}
	
	LinkedListNode reverse(LinkedListNode head){
		LinkedListNode temp=head;
		LinkedListNode pre=null;
			while(temp!=null){
				pre=temp;
				temp=temp.next;
				}
			while(pre!=null){
				System.out.print(pre.data+" ");
				pre=pre.prev;
			}
			return pre;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("2");
		int elements = sc.nextInt();
		LinkedList l = new LinkedList();
		
		for(int i=1; i<=elements; i++){
			l.insert(sc.nextInt());
		}

		l.reverse(l.head);
		
	}
}