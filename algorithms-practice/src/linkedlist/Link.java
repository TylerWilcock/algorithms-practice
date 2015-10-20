package linkedlist;

public class Link {
	private Object data = null;
	private Link next = null;
	
	/**
	 * Constructor that immediately sets this link's data.
	 * @param data
	 */
	public Link(Object data) {
		this.setData(data);
	}
	
	/**
	 * Get this link's data.
	 * @return This links data
	 */
	public Object getData() {
		return data;
	}
	
	/**
	 * Set this link's data.
	 * @param data
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	/**
	 * Gets the next link.
	 * @return The next link
	 */
	public Link getNext() {
		return this.next;
	}
	
	/**
	 * Set the next link.
	 * @param newNext
	 */
	public void setNext(Link newNext) {
		this.next = newNext;
	}
}
