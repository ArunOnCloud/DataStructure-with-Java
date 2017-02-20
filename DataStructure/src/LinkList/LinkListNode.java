package LinkList;

public class LinkListNode<T> {
	private T data;
	public T getData() {
		return data;
	}



	public void setData(T data) {
		this.data = data;
	}



	public LinkListNode<T> getNext() {
		return next;
	}



	public void setNext(LinkListNode<T> next) {
		this.next = next;
	}



	private LinkListNode<T> next;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
