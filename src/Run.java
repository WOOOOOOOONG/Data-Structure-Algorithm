import List.LinkedList.*;

public class Run {

	/* linkedList
	public static void main(String[] args) {
		linkedList linkedList = new linkedList();

		int count = 1;
		for(int i = 0; i < 10; i++) {
			linkedList.add(count++);
		}
		
		System.out.println(linkedList.toString());
		System.out.println(linkedList.remove(0));
		System.out.println(linkedList.toString());
		System.out.println(linkedList.indexOf(8));
		
	}
	*/
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		int count = 1;
		for(int i = 0; i < 10; i++) {
			linkedList.add(count++);
		}
		
		System.out.println(linkedList.toString());
		System.out.println(linkedList.remove(2));
		System.out.println(linkedList.toString());
		System.out.println(linkedList.indexOf(8));
	}
}
