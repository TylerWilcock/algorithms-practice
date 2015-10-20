package linkedlist;

import linkedlist.Link;

public class LinkedList {
	public Link firstLink;
	public int listCount;
	
	public LinkedList() {
		firstLink = null;
		listCount = 0;
	}
	
	public boolean isEmpty() {
		return listCount == 0;
	}
	
	public void addToHead(Object data) {
		Link newHead = new Link(data);
		newHead.setNext(firstLink);
		firstLink = newHead;
		listCount++;
	}
	
	public void addLinkToHead(Link newHead) {
		newHead.setNext(firstLink);
		firstLink = newHead;
		listCount++;
	}
	
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
	
	public void removeHead() {
		firstLink = firstLink.getNext();
	}
	
	public void display() {
		if(firstLink == null || firstLink.getData() == null) return;
		Link currentLink = firstLink;
		while(currentLink != null) {
			System.out.print("[" + currentLink.getData() + "]" + "-->");
			currentLink = currentLink.getNext();
		}
	}
}
