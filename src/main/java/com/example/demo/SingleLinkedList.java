package com.example.demo;

public class SingleLinkedList {

	Node head = null;

	class Node {
		int data;
		Node next;

		public Node() {
			super();
		}

		public Node(int data) {
			this.data = data;
		}
	}

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
		linkedList.display();
	}
}
