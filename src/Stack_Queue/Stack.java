package Stack_Queue;

// Stack
// 편의를 위해 int 자료형만 저장 가능한 형태
public class Stack {
	private static final int maxCount = 100;
	private int size; // 총 크기이자 size를 가리키는 변수
	private int[] values;

	// 생성자를 통한 초기화
	public Stack() {
		size = 0;
		values = new int[maxCount];
	}

	// 가장 위에 값 삽입
	public void push(int data) {
		values[size++] = data;
	}

	// 가장 위에 있는 값 추출
	public int pop() {
		int rData = values[size];
		values[size--] = 0;

		return rData;
	}

	// 가장 위에 있는 값 조회
	public int peek() {
		if (size > 0) {
			return values[size - 1];
		} else {
			return -1;
		}

	}

	// 모든 값 삭제
	public void clear() {
		for (int i = 0; i < size; i++) {
			pop();
		}
		size = 0;
	}

	// 출력을 위한 String 반환
	public String toString() {
		String str = "";
		if (size > 0) {
			str = String.valueOf(values[size - 1]);
			for (int i = size - 2; i >= 0; i--) {
				str += ", " + String.valueOf(values[i]);
			}
		}else {
			str = "No Data";
		}

		return str;
	}
}
