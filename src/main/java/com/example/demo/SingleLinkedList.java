package com.example.demo;

public class SingleLinkedList {
//Head will be pointing to the first node in the linked list(used to traverse)
	Node head = null;

//Creating the Node class
	class Node {
		// Node contains data and Next(Stores the adddress of the next object)
		int data;
		Node next;

		public Node() {
			super();
		}

		public Node(int data) {
			this.data = data;
		}
	}

//Method to insert into the Linked List
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head != null) {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		} else {
			head = node;
		}
	}

//Method to insert at start of the list
	public void inserAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

//Method to insert at particular Node
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;
		if (index == 0) {
			inserAtStart(data);
		} else {
			while (n.next != null) {
				n = n.next;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				node.next = n.next;
				n.next = node;
			}
		}
	}

//Method to delete the data in the list
	public void delete(int index) {
		// Deletion of head node(First entry of the list)
		Node n = head;
		Node temp = null;
		if (index == 0) {
			head = head.next;
		} else {
			;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			temp = n.next;
			n.next = temp.next;
		}
	}

//Method to see the data in the linked list
	public void display() {
		Node n = head;
		System.out.println(n.data);
		while (n.next != null) {
			n = n.next;
			System.out.println(n.data);
		}
	}

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.insert(5);
		linkedList.insert(10);
		linkedList.insert(12);
		linkedList.inserAtStart(1);
		linkedList.insertAt(0, 2);
		linkedList.delete(1);

		linkedList.display();
	}
}
