package problem3;
import java.util.NoSuchElementException;

public class StackLinkedList {
    Node nodeSorted;
    Node head;
    Node updated;
    
    public StackLinkedList(){
        head=null;
    }
    
    void push(int val){
        Node newnode = new Node();
        newnode.value=val;
        newnode.next = head;
        head = newnode;

        Node newnodeP = new Node();
        newnodeP.value=val;
        newnodeP.next = updated;
        updated = newnodeP;
    }
    
    public int peek() {
		if(head==null)
			throw new NoSuchElementException("Stack is empty. ");
		return head.value;
	}
    
    public int pop() {
		if(head==null) 
			throw new NoSuchElementException("Stack is empty. ");
		if(head.value == updated.value) {
			int tempUpdated=updated.value;
			updated=updated.next;
		}
		int tempData= head.value;
		head=head.next;
		return tempData;
	}
    
    public void insertionSort(){
       
    	nodeSorted = null;
        Node ptr = head;
        while (ptr != null){
        	Node next = ptr.next;
            sortedInsert(ptr);
            ptr = next;
            printlist();
          //  System.out.println("\nSwapped " + newnode.value + " with " + nodeSorted.value); 
            System.out.println("\n");
        
        }
        head = nodeSorted;
        
        System.out.println("Sort finished!");
    }

    void sortedInsert(Node newnode){
    	if (nodeSorted == null || (nodeSorted.value) >= newnode.value){
        	newnode.next = nodeSorted;
            nodeSorted = newnode;
            //System.out.println("Swapped" + newnode.value + "with" + nodeSorted.value);
        }
        else{
            Node ptr = nodeSorted;
            while (ptr.next != null && ptr.next.value < newnode.value){
                ptr = ptr.next;
            }
            newnode.next = ptr.next;
            ptr.next = newnode;
           System.out.println("\nSwapped " + newnode.value + " with " + nodeSorted.value); 
        	
        }
    }

    void printlist(){
        Node ptr=head;
        while (ptr != null){
            System.out.print(ptr.value + " - ");
            ptr = ptr.next;
        }
    }


    void printPeek(){
        
    	Node ptr=updated;
        while (ptr != null){
            System.out.print(ptr.value + " - ");
            ptr = ptr.next;
        }
    }

    public int pastpeek() {
    	if(updated==null)
			throw new NoSuchElementException("Stack is empty. ");
		
    	return updated.value;
    }
}


