package com.linkedList.add;

public class LinkedListAddFirst {
	
	Node head;
	
	public void addFirst(int val) {
		
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = head;
		head = newNode;
		display();
	}
	
	public void display() {
		
		Node temp= head;
		
		while(temp != null) {
			
			System.out.println(temp.data);
			temp = temp.next;
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		LinkedListAddFirst l = new LinkedListAddFirst();
		l.addFirst(10);
		l.addFirst(5);
		l.addFirst(15);
	}

}
