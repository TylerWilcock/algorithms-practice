package linkedlist;

public class Link {
	private Object data = null;
	private Link next = null;
	
	public Link(Object data) {
		this.setData(data);
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Link getNext() {
		return this.next;
	}
	
	public void setNext(Link newNext) {
		this.next = newNext;
	}
}
