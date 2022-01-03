package com.example.demo;

public class DoubleLinkedList {
	Node head = null;

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

	public void insertAt(int index, int data) {

	}

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
		list.display();
	}

}
