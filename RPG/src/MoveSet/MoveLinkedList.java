package MoveSet;

public class MoveLinkedList {

	private MoveNode Head;
	
	private MoveNode curr;
	
	private int ListSize;
	
	public void addMove(MoveNode newNode) {
		
		if (Head == null) {
			Head = newNode;
		}
		else {
			
			curr = Head;
			
			for (int i = 0 ; curr.getNext() != null ; i++) {
				curr = curr.getNext();
			}
			
			curr.setNext(newNode);
			
		}
		
		ListSize++;
		
		curr.getNext().setNodeNum(ListSize);
		
	}
	
	public void removeMove(int num) {
		
		curr = Head;
		
		for (int i = 1 ; curr.getNext().getNodeNum() != num ; i++) {
			
			curr = curr.getNext();
			
		}
		
		curr.setNext(curr.getNext().getNext());
		
		for (int i = curr.getNodeNum() ; curr.getNext() != null ; i++) {
			
			curr = curr.getNext();
			curr.setNodeNum(i);
			
		}
		
		ListSize--;
		
	}
	
}
