
public class prime {

	public static void main(String[] args) {

// 0,1,3,5,7,11,13,17
		
		int i,z=0,flag=0;
		
		int y= 16;
		 z = y/2;
		 
		 if(y==0||y==1) {
		 
		 System.out.println(y+"Not Prime Number");
		
	}else {
		
		for(i=2;i<=z;i++) {
			
			if(y%i==0) {
				 System.out.println(y+"  not prime number");	
				 flag = 1;
				 
				break;
			}
			
	}
		
	}	

		 if(flag==0) {
			 System.out.println(y+"prime number");
		 }
		 
		 
		 
	}

}
