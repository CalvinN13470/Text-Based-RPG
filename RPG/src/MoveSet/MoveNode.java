package MoveSet;

public class MoveNode {

	private MoveNode next;
	
	private Move nodeMove;
	
	private int NodeNum;
	
	public void setNext(MoveNode newNext) {
		
		next = newNext;
		
	}
	
	public MoveNode getNext() {
		
		return next;
		
	}
	
	public void setMove(Move newMove) {
		
		nodeMove = newMove;
		
	}
	
	public Move getMove() {
		
		return nodeMove;
		
	}
	
	public void setNodeNum(int newNum) {
		
		NodeNum = newNum;
		
	}
	
	public int getNodeNum() {
		
		return NodeNum;
		
	}
	
}
