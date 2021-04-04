package com.linkedList.add;

public class LinkedListLastAdd {

	Node head;
	
	    public void addLast(int val)
	    {
	        Node newNode = new Node();
	        newNode.data = val;
	        newNode.next = null;

	        if(head == null)
	            head = newNode;
	        else
	        {
	            Node lastNode = head;

	            while(lastNode.next != null)
	            {
	                lastNode = lastNode.next;
	            }

	            lastNode.next = newNode;
	        }
	    }

	    public void print()
	    {
	        Node temp = head;

	        while(temp != null)
	        {
	            System.out.println(temp.data);
	            temp = temp.next;
	        }
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListLastAdd la = new LinkedListLastAdd();
		la.addLast(5);
		la.addLast(10);
		la.addLast(15);
		la.print();

	}

}
