
public class Arrayone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = new int [] {2, 6, 4, 5, 8};
		
		int max = test[0];

		for (int i= 0; i<test.length;i++) {
			
			if (test[i]>max)
			max = test[i];
			
			System.out.println("" +max);
			
			
		}
		

	}

}
