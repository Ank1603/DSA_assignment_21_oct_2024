package assignment5;

import java.util.Scanner;

public class SinglyListMain {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        SinglyLinkedList list = new SinglyLinkedList();
	        int choice, data;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Create linked list");
	            System.out.println("2. Display linked list");
	            System.out.println("3. Search node in linked list");
	            System.out.println("4. Insert at last position");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data to create linked list: ");
	                    data = sc.nextInt();
	                    list.createList(data);
	                    break;
	                case 2:
	                    list.displayList();
	                    break;
	                case 3:
	                    System.out.print("Enter value to search: ");
	                    data = sc.nextInt();
	                    if (list.searchNode(data)) {
	                        System.out.println(data + " found in the list.");
	                    } else {
	                        System.out.println(data + " not found in the list.");
	                    }
	                    break;
	                case 4:
	                    System.out.print("Enter data to insert at last position: ");
	                    data = sc.nextInt();
	                    list.insertAtLast(data);
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	    }
	
}
