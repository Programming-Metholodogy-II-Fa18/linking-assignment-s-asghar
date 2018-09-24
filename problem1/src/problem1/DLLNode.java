package problem1;

public class DLLNode<T>{
//	DLLNode<T> prev;
	DLLNode<T> next;
	T data;
	
	public DLLNode(T data) {
//		prev=null;
		next=null;
		this.data=data;
	}
}