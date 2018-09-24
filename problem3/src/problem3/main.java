package problem3;

public class main {
	public static void main(String[] args){
        StackLinkedList list = new StackLinkedList();
        list.push(1);
        list.push(7);
        list.push(5);
        list.push(2);
        //System.out.println("unsorted");
        //list.printlist();
        list.insertionSort();
       
        //list.insertionSort();
       // list.pop();
        //list.pop();
        //System.out.println("\npastpeek head: " + list.pastpeek());
        
       // System.out.println("\npeek list");
        //list.printPeek();
        
        
        System.out.println("\nsorted");
        list.printlist();
           
    }

}
