package Stack_Queue;

// Queue
// 편의를 위해 int 자료형만 저장 가능한 형태
public class Queue {
	private static final int maxCount = 100;
	private int size; // 총 크기이자 size를 가리키는 변수
	private int[] values;
	
	// 생성자를 통한 초기화
	public Queue() {
		size = 0;
		values = new int[maxCount];
	}
	
	// 가장 앞에 값 삽입
	public void push(int data) {
		for(int i = size; i >= 1; i--) {
			values[i] = values[i-1];
		}
		values[0] = data;
		size++;
	}
	
	// 가장 앞에 있는 값 추출
	public int pop() {
		int rData = values[0];
		for(int i = 0; i < size; i++) {
			values[i] = values[i+1];
		}
		size--;
		
		return rData;
	}
	
	// 가장 위에 있는 값 조회
	public int peek() {
		return values[0];
	}
	
	// 모든 값 삭제
	public void clear() {
		for(int i = 0; i < size; i++) {
			pop();
		}
		size = 0;
	}
	
	// 출력을 위한 String 반환
	public String toString() {
		String str = "";
		if(size > 0) {
			str = String.valueOf(values[0]);
			for(int i = 1; i < size; i++) {
				str += ", " + String.valueOf(values[i]);
			}
		}else {
			str = "No Data";
		}
		
		return str;
	}
}
