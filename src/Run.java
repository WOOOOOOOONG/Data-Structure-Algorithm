import Tree.*;
import Tree.Tree.Node;

public class Run {

	/* LinkedList
	 * public static void main(String[] args) { 
	 * linkedList linkedList = new linkedList();
	 * 
	 * int count = 1; for(int i = 0; i < 10; i++) { linkedList.add(count++); }
	 * 
	 * System.out.println(linkedList.toString());
	 * System.out.println(linkedList.remove(0));
	 * System.out.println(linkedList.toString());
	 * System.out.println(linkedList.indexOf(8)); }
	 */
	
	/* Stack
	 * public static void main(String[] args) { 
	 * 		Stack s = new Stack();
	 * 
	 * 		s.push(1); s.push(2); s.push(3); s.push(4); s.push(5); s.push(6);
	 * 
	 * 		System.out.println(s.toString()); 
	 * 		System.out.println(s.peek());
	 * 
	 * 		s.pop(); s.pop(); 
	 * 		System.out.println(s.toString());
	 * 
	 * 		s.clear(); 
	 * 		System.out.println(s.toString()); 
	 * }
	 */
	
	/* Queue
	 * public static void main(String[] args) { 
	 *  	Queue q = new Queue();
	 * 
	 * 		q.push(1); q.push(2); q.push(3); q.push(4); q.push(5); q.push(6);
	 * 
	 * 		System.out.println(q.toString()); 
	 * 		System.out.println(q.peek());
	 * 
	 * 		q.pop(); q.pop(); 
	 * 		System.out.println(q.toString());
	 * 
	 * 		q.clear(); 
	 * 		System.out.println(q.toString()); 
	 * }
	 */
	
	public static void main(String[] args) {
		// 트리 생성
		Tree tree = new Tree();
		
		// 노드 생성
		Node node1 = tree.addNode(1);
		Node node2 = tree.addNode(2);
		Node node3 = tree.addNode(3);
		Node node4 = tree.addNode(4);
		Node node5 = tree.addNode(5);
		Node node6 = tree.addNode(6);
		Node node7 = tree.addNode(7);
		
		// 트리 연결관계 생성
		/*  트리 모양       
		 *        1
		 *     2     3
		 *   4  5  6   7
		 */
		node1.addLeft(node2);
		node1.addRight(node3);
		node2.addLeft(node4);
		node2.addRight(node5);
		node3.addLeft(node6);
		node3.addRight(node7);
		
		// 순회
		tree.preOrder(node1);
		System.out.println();
		tree.inOrder(node1);
		System.out.println();
		tree.postOrder(node1);
		System.out.println();
		
		// 삭제
		node2.deleteLeft();
		node3.deleteRight();
		/* 삭제 이후 트리 모양
		 *        1
		 *     2     3
		 *      5  6   
		 */
		
		// 순회
		System.out.println();
		tree.preOrder(node1);
		System.out.println();
		tree.inOrder(node1);
		System.out.println();
		tree.postOrder(node1);
		System.out.println();
	}
}
