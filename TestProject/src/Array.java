import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array1 = new int [] {23,78,75,34,90,12};
		
		Arrays.sort(array1);
		
		
		System.out.println(array1);
		
		for(int i=0;i< array1.length;i++) {
			System.out.println(array1[i]);
		}
		
	}

}
