package com.example.demo;

public class DoubleLinkedList {
	Node head = null;

// For Node creation 
	class Node {
		int data;
		Node Prev;
		Node next;

		Node() {
		}

		Node(int data) {
			this.data = data;
		}

	}

	// For inserting the data in the double linked list
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.Prev = null;
		node.next = null;
		if (head != null) {
			Node n = head;
			while (n.next != null) {

				n = n.next;
			}

			n.next = node;
			node.Prev = n;

		} else {
			head = node;
		}
	}

	//Method to insert at particular node
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.Prev = null;
		node.next = null;
		
		// if it is at index 0
		if (index == 0) {
			Node n = head;
			n.Prev = node;
			node.next = head;
			head = node;
		}
		
		Node n = head; 
		
		while(n.next!= null) {
			n =n.next;
			for(int i =0; i< index -1; i++) {
				n =n.next;
			}
			node.Prev = n;
			node.next = n.next;
			n.next = node;
			n.Prev = n;
		}
	}

	// Method to display to list
	public void display() {
		Node n = head;
		System.out.println("head of the node" + n.data);
		while (n.next != null) {
			n = n.next;
			System.out.println("current node data" + n.data);
			System.out.println("previous node data" + n.Prev.data);
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.insert(5);
		list.insert(6);
		list.insert(10);
		list.insert(13);
		list.insertAt(0, 1);
		list.insertAt(1, 2);
		list.display();
	}

}
