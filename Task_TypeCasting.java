
public class Task_TypeCasting {

	public static void main(String[] args) {
		
		int score = 93;
		System.out.println(score);
		System.out.println((float) score);
		System.out.println((double) score);
		
		float score_f = 93.3f;
		System.out.println((int) score_f);
		
		score = 93 + (int) 98.8f;
		System.out.println(score);
		
		String s1 = String.valueOf(93);
		s1 = Integer.toString(93);
		System.out.println(s1);
		
		String s2 = String.valueOf(98.8);
		s2 = Double.toString(98.8);
		System.out.println(s2);		 
		
	}

}
