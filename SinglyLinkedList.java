package assignment5;

public class SinglyLinkedList {
	
	 Node root;

	    public void createList(int data) {
	        Node newNode = new Node(data);
	        if (root == null) {
	        	root = newNode;
	        } else {
	            Node current = root;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }
	    public void displayList() {
	        if (root == null) {
	            System.out.println("The list is empty.");
	            return;
	        }
	        Node current = root;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    public boolean searchNode(int key) {
	        Node current = root;
	        while (current != null) {
	            if (current.data == key) {
	                return true;
	            }
	            current = current.next;
	        }
	        return false;
	    }

	    public void insertAtLast(int data) {
	        Node newNode = new Node(data);
	        if (root == null) {
	        	root = newNode;
	        } else {
	            Node current = root;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

}
