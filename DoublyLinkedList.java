package assignment5;

import java.util.Scanner;

public class DoublyLinkedList {

	Node2 root;

	public void addNode(int data) {
		Node2 newNode = new Node2(data);
		if (root == null) {
			root = newNode;
		} else {
			Node2 current = root;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}

	public void displayOddNodes() {
		Node2 current = root;
		boolean foundOdd = false;

		while (current != null) {
			if (current.data % 2 != 0) {
				System.out.print(current.data + " ");
				foundOdd = true;
			}
			current = current.next;
		}

		if (!foundOdd) {
			System.out.println("No odd values found in the list.");
		} else {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		int choice, data;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Add node to doubly linked list");
			System.out.println("2. Display nodes with odd values");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter data to add to the list: ");
				data = sc.nextInt();
				list.addNode(data);
				break;
			case 2:
				System.out.println("Nodes with odd values:");
				list.displayOddNodes();
				break;
			case 3:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 3);

	}

}
