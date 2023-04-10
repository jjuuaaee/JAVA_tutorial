
public class Task_NestLoop {

	public static void main(String[] args) {
		
// 왼쪽으로 치우친 별
		
		for (int i = 0; i < 5; i++) {	
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}

		
// 오른쪽으로 치우친 별
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4- i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}