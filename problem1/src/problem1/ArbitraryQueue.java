package problem1;

import java.util.NoSuchElementException;

public class ArbitraryQueue<T> {

	DLLNode<T> head;	//doing this with a circular doubly linkedlist
//	DLLNode<T> tail;
	
    public ArbitraryQueue() { 
        this.head = null;
  //      this.tail = null; 
    } 
       
	public static void main (String [] args) {
		ArbitraryQueue <Integer> example = new ArbitraryQueue <Integer> ();
		example.push (3);
		example.push (4);
		example.push (6);
		example.push (7);
		example.push(2);
		example.enqueue(6);
		
		example.dequeue();
		example.dequeue();
		
		
		example.printList();	
		
	}
	
	public void printList()
	{
		DLLNode<T> n = head;
		System.out.print("[ ");
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println("]");
	}
	
	public void enqueue (T data) {	//inserts at tail of arbitrary queue
		DLLNode <T> newNode = new DLLNode <T> (data);
		if (head == null) {	//if its the first element to add
			head = newNode;
		} 
		else {
			DLLNode<T> ptr = head;
			while(ptr.next != null)
			{
				ptr = ptr.next;
			}
			ptr.next = newNode;
		}	   	
	}
	
	public T dequeue () {	//removes from tail of list and returns it
		if (head == null) {
			throw new NoSuchElementException ("Arbitrary Queue is empty.");
		}
		//otherwise traverse to end:
		DLLNode<T> ptr = head;
		while(ptr.next.next != null)
		{
			ptr = ptr.next;
		}
		T remov = ptr.next.data;
		ptr.next = null;
				
		return remov;
		
	}
	
	
	public void push(T data) {
		DLLNode<T> newNode= new DLLNode<T>(data);
		newNode.next=null;
		if(head==null) 
			head=newNode;
		else { 
			newNode.next=head;
			head=newNode;
		}
	}
	
	public T pop() {
		if (head == null) {
			throw new NoSuchElementException ("Arbitrary Queue is empty.");
		}
		//otherwise:
		T remov = head.data;
		head=head.next;
		
		return remov;
	}
	
	public T traverse(int index) {
		if(head==null)
			throw new NoSuchElementException("list is empty");
		DLLNode<T> ptr= head;
		int i=0;
		while(i!=index) {
			ptr=ptr.next;
			i++;
		}
		return ptr.data;
	}
	
	
}

