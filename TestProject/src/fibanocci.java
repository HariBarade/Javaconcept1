
public class fibanocci {

	public static void main(String[] args) {

		
	// 0 1 1 2 3 5 8 13 21 34
		
		int i = 0,j=1,k,l,count= 10;
		
		//System.out.println(i+" "+j);

		for(l=0;l<=count;l++) {
		
			//System.out.println(l);
			k = i+j;
			System.out.println("" +k);
			i=j;
			j=k;			
		}
	}

}
