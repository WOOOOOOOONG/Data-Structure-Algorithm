package List.ArrayList;

// ArrayList

public class ArrayList {
	private int size = 0;
	private int maxSize = 10;
	private int[] list = new int[maxSize];

	// 마지막 위치에 값 추가
	public void add(int data) {
		// 최대 크기 초과시, 최대 크기를 10 늘려 재할당
		if (size >= maxSize) {
			maxSize += 10;
			int[] nextList = new int[maxSize];
			for (int i = 0; i < size; i++) {
				nextList[i] = list[i];
			}
			list = nextList;
		}

		list[size] = data;
		size++;
	}

	// index 위치에 값 추가
	public void add(int data, int index) {
		// index 위치가 현재 사이즈보다 크거나, 0보다 작은 값을 입력했을 경우
		if (index >= size || index < 0) {
			System.out.println("Please try again");
			return;
		}
		
		// index 추가 시 최대 사이즈보다 커지는 경우
		if (size >= maxSize) {
			maxSize += 10;
			int[] nextList = new int[maxSize];
			for (int i = 0; i < size; i++) {
				nextList[i] = list[i];
			}
			list = nextList;
		}
		
		// 삽입 지점 이후 값 미루기
		for(int i = size; i > index; i--) {
			list[i] = list[i-1]; 
		}
			
		list[index] = data;
		size++;
	}

	// index 위치 값 삭제
	public int remove(int index) {
		int removeData = list[index];
		
		// 값 당겨오기
		for(int i = index; i < size-1; i++) {
			list[i] = list[i+1]; 
		}
		
		list[size-1] = 0;
		size--;
		
		return removeData;
	}

	// 현재 크기
	public int size() {
		return size;
	}

	// 해당 데이터 위치(앞에서부터 첫 번째 값)
	public int indexOf(int data) {
		for(int i = 0; i < maxSize; i++ ) {
			if(list[i] == data) {
				return i;
			}
		}
		return -1;
	}

	// 문자열 출력
	public String toString() {
		String str = "";
		
		if (size != 0) {
			str = String.valueOf(list[0]);
			
			for (int i = 1; i < size; i++) {
				// 10 단위마다 줄바꿈
				if(i % 10 == 0) {
					str += "\n";
					str += String.valueOf(list[i]);
				}else {
					str += ", " + String.valueOf(list[i]);
				}
				
			}
		}

		return str;
	}
}
