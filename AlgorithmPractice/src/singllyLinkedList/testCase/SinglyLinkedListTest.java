package singllyLinkedList.testCase;

import singllyLinkedList.SinglyLinkedList;

public class SinglyLinkedListTest {
	public SinglyLinkedListTest () {}
	
	private void test1() {
		SinglyLinkedList<String> sll = new SinglyLinkedList();
		sll.addFirst("1");
		sll.addFirst("2");
		sll.addFirst("3");
		sll.addFirst("A");
		sll.addLast("$");
	}
}
