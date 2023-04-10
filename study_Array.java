
public class study_Array {

	public static void main(String[] args) {
		
		// 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
		// 배열을 활용하여, 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램
		
		int[] sizeArray = new int[10]; // int 형태의 sizeArray 배열 만들기, 초기화 후 사이즈는 10
		
		for (int i = 0; i < sizeArray.length; i++) { // sizeArray의 길이인 10만큼 반복되는 반복문
			sizeArray[i] = 250 + (5*i); // 250부터 5*i 단위로 커지는 값 배열에 넣기
		}
		
		for (int size : sizeArray) { //foreach로 각각의 값 순회하기
			System.out.println("사이즈 " + size + " (재고있음)");			
		}
	}
}
