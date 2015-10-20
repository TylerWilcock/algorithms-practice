package linkedlist;

import linkedlist.Link;

public class LinkedList {
	private Link firstLink;
	private int listCount;
	
	public LinkedList() {
		firstLink = null;
		listCount = 0;
	}
	
	/**
	 * Determines whether or not the linked list is empty.
	 * @return true if empty, false if not
	 */
	public boolean isEmpty() {
		return listCount == 0;
	}
	
	/**
	 * Adds a new link with the input data to the head of the linked list.
	 * @param data
	 */
	public void addToHead(Object data) {
	    Link newHead = new Link(data);
		newHead.setNext(firstLink);
		firstLink = newHead;
		listCount++;
	}
	
	/**
	 * Adds the specified link to the head of the linked list.
	 * @param newHead
	 */
	public void addLinkToHead(Link newHead) {
		newHead.setNext(firstLink);
		firstLink = newHead;
		listCount++;
	}
	
	/**
	 * Creates a link containing the input data and 
	 * adds it to the end of the linked list.
	 * @param data
	 */
	public void addToEnd(Object data) {
		Link newEnd = new Link(data);
		Link current = firstLink;
		//crawl through the list to get to the end
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newEnd);
		listCount++;
	}
	
	/**
	 * Adds a new link with the input data at the specified index in the list.
	 * @param index
	 * @param data
	 */
	public void add(int index, Object data) {
		Link newLink = new Link(data);
		Link current = firstLink;
		//crawl to the specified index or to the last element in the list, whichever comes first
		for(int i = 1; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		newLink.setNext(current.getNext());
		current.setNext(newLink);
		listCount++;
	}
	
	/**
	 * Removes the link at the specified index.
	 * @param index
	 * @return
	 */
	public boolean remove(int index) {
		Link current = firstLink;
		if(index > listCount) {
			return false;
		} else if (index == 0) {
			this.removeHead();
		}
		
		current = firstLink;
		//crawl through the list til we get to the specified element
		for(int i = 1; i < index; i++) {
			if(current.getNext() == null) {
				return false;
			}
			
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--;
		return true;
	}
	
	/**
	 * Removes the head link of the linked list.
	 */
	public void removeHead() {
		firstLink = firstLink.getNext();
	}
	
	/**
	 * Prints the contents of the linked list to the console.
	 */
	public void display() {
		if(firstLink == null || firstLink.getData() == null) return;
		Link currentLink = firstLink;
		while(currentLink != null) {
			System.out.print("[" + currentLink.getData() + "]" + "-->");
			currentLink = currentLink.getNext();
		}
	}
}
