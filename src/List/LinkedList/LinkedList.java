package List.LinkedList;

// 양방향 연결 리스트
public class LinkedList {
	// 노드 정의
	private class Node {
		Node prev; // 이전 노드의 정보를 가지고 있는 객체
		int data; // 현재 노드에 들어있는 값
		Node next; // 다음 노드의 정보를 가지고 있는 객체

		Node() {}
		
		// 노드에 값을 바로 삽입하기 위한 생성자
		Node(int data) {
			this.data = data;
		}
	}

	private Node head; // 가장 앞 노드의 정보를 가지고 있음
	private Node tail; // 가장 뒤 노드의 정보를 가지고 있음
	private Node cur; // 현재 가리키고 있는 노드의 정보를 가지고 있음
	private int size; // 현재 리스트의 크기

	// 노드 초기화를 위한 생성자 정의
	public LinkedList() {
		head = new Node();
		tail = new Node();
		cur = new Node();

		size = 0;
	}

	public void add(int data) {
		// 첫 데이터 추가인 경우와 아닌 경우 구분
		if (size == 0) {
			Node newNode = new Node(data);

			head.next = newNode;
			newNode.prev = head;

			newNode.next = tail;
			tail.prev = newNode;

			size++;
		} else {
			Node newNode = new Node(data);

			// 마지막 노드로 이동.
			cur = head.next;
			while (cur.next != tail) {
				cur = cur.next;
			}

			cur.next = newNode;
			newNode.prev = cur;

			newNode.next = tail;
			tail.prev = newNode;

			size++;
		}
	}

	public void add(int data, int index) {
		// 전체 크기보다 큰 곳에 데이터를 삽입하려는 경우
		if(index > size) {
			System.out.println("Please try again");
			return;
		}
		
		// 첫 데이터 추가인 경우와 아닌 경우 구분
		if (size == 0) {
			Node newNode = new Node(data);

			head.next = newNode;
			newNode.prev = head;

			newNode.next = tail;
			tail.prev = newNode;

			size++;
		} else {
			Node newNode = new Node(data);

			// 마지막 노드로 이동
			cur = head.next;
			for(int i = 0; i < index; i++) {
				cur = cur.next;
			}

			cur.next = newNode;
			newNode.prev = cur;

			newNode.next = tail;
			tail.prev = newNode;

			size++;
		}
	}

	public int remove(int index) {
		Node rNode;
		
		// 데이터 초과일 경우
		if(index > size) {
			System.out.println("Please try again");
			return -1;
		}
		
		// 인덱스 값 찾아가기
		cur = head.next;
		for(int i = 0; i < index; i++) {
			cur = cur.next;
		}
		rNode = cur;
		 
		// 이전 노드와 이후 노드 포인터 변경
		cur.prev.next = cur.next;
		cur.next.prev = cur.prev;
		size--;
		
		return rNode.data;
	}

	public int size() {
		return size;
	}

	public int indexOf(int data) {
		int count = 0;
		boolean bFind = false;
		
		cur = head.next;
		while(cur.next != tail) {
			if(cur.data == data) {
				bFind = true;
				break;
			}
			cur = cur.next;
			count++;
		}
		
		if(bFind) {
			return count;
		}else {
			return -1;
		}
	}

	public String toString() {
		String str = "";
		cur = head.next;
		str = String.valueOf(cur.data);
		
		while(cur.next != tail) {
			cur = cur.next;
			str += String.valueOf(", " + cur.data);
		}
		
		return str;
	}

}
