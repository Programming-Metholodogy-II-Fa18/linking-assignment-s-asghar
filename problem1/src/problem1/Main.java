package problem1;

public class Main {
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
	
}
