
public class SudokuSquareLinkedList {

	private SudokuSquareNode head;
	private SudokuSquareNode next;
	private SudokuSquareNode last;


	public SudokuSquareLinkedList(SudokuSquareNode n) {
		head = n;
		next = n;
		last = n;
	}

	public void append(SudokuSquareNode n) {
		last.setNext(n);
		last = n;
	}

	public SudokuSquareNode getNext() {
		SudokuSquareNode current = next;
		if (next != null) {
			next = next.getNext();
		}
		return current;
	}
	
}