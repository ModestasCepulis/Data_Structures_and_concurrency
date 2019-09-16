import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
     private class Node {
		public E data;
		public Node next;
	}
	private Node first;
		
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		first = newLink;
	}

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public E removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}

	public boolean isEmpty()
	{
		/** if (first == null)
		return true:
		else
		return false;
		 */
		//this is same as the one above :
		return first == null;
	}

	public void print()
	{
		/**output content of list*/
		Node current = first;
		while(current != null)
		{
			/**prints out the current data of the current node*/
			System.out.println(current.data);
			/**sets the current node to the next node (movies it)*/
			current = current.next;
		}
	}

	public int size()
	{
		Node current = first;
		int theSize = 0;
		while(current != null)
		{
			theSize ++;
			/**sets the current node to the next node (movies it)*/
			current = current.next;
		}

		return theSize;
	}

	
}
