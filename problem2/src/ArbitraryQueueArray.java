import java.util.NoSuchElementException;

public class ArbitraryQueueArray<T> {
	 private Object[] arr;
	 private int numItems=0; 
	 int origSize=10;
	 Object item;
	 
	 public ArbitraryQueueArray() { 
		 arr= new Object[origSize]; 
	 } 
	 
	 private void resize(int capac){	//doubles array when overflow about to occur
		 Object[] copy = new Object[capac]; 
		 for (int i=0;i<numItems;i++) {
	           copy[i]=arr[i];
		 }
	     arr=copy;
	 }
	 
	 public Object traverse(int index) {
		int i=0;
		for(i=0; i<numItems; i++) {
			if(i==index)
				break;
		}
		return arr[i];
		
	 }
	 public void push(T item){
		if (numItems==arr.length){ 
			resize(2*arr.length);}
	        Object[] copy = new Object[arr.length];
	        for (int i=0;i<=numItems;i++){
	        	copy[i+1]=arr[i];
	        }
	         copy[0]=item;
	         arr=copy;
	         numItems++;
	    }
	
	 public Object pop(){
		 if(numItems==0){
			 System.out.println("cannot pop from an empty stack");
	    	   return null;
	     }
	       Object item =arr[0]; //pops from the top of the array
	       Object[] store = new Object[arr.length];
	       
	       numItems=numItems-1;	//decrement this to keep track
	       
	       for(int i=1;i<=numItems;i++){
	           store[i-1]=arr[i];
	       }
	       
	       arr=store;
	       if(numItems>0 && numItems==arr.length/4)
	           resize(arr.length/2);
	       
	       return item;
	    
	    }

	    public void enqueue(T item){
	        if (numItems==arr.length){ //push to the end of the array
	            resize(2*arr.length);}
	            arr[numItems++]=item;
	    }

	    public Object dequeue(){
	        Object item = arr[numItems--]; //returns object at the end of the queue
	        arr[numItems]=null;
	        if(numItems>0 && numItems==arr.length/4){
	            resize(arr.length/2);}
	            return item;
	    }

	public void printArr(){
		for (int i=0;i<arr.length;i++){
	            if(arr[i]!=null){
	                System.out.print( arr[i] + " ");
	            }else{
	                System.out.print("\\"+ " ->");
	            }
	        }
	    }

	 
	

}
