
public class Task_SwitchCase {

	public static void main(String[] args) {
		
		// Switch Case
		// 등급에 따른 가격 책정 (1등급(최상), 4등급(최하))
		
		int grade = 1;
		int price = 7000;
		
		switch (grade) {
			case 1:
				price += 1000;
			case 2:
				price += 1000;
			case 3:
				price += 1000;
				break;
			
		}
		System.out.println(grade + "등급 제품의 가격 : " + price + "원");
	}

}
