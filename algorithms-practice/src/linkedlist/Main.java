package linkedlist;

import linkedlist.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addToHead("First added");
		linkedList.addToHead("Second added");
		linkedList.addToHead("Third added");
		linkedList.addToEnd("Should be at end");
		linkedList.add(1, "Adding to index 1");
		linkedList.remove(0);
		linkedList.display();
	}

}
