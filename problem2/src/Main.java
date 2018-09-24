
public class Main {
	public static void main (String [] args) {
		ArbitraryQueueArray <Integer> example = new ArbitraryQueueArray <Integer> ();
		example.push (1);
		example.push (2);
		example.push (3);
		example.push (4);
		example.push(5);
		example.enqueue(0);
		
		//example.dequeue();
		example.pop();
		
		
		example.printArr();		
	}
	
}
