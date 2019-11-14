package test;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(factVal(20));
	}
	
	private static int factVal(int n) {
		int k = 1;
		for(int i=1;i<=n;i++){    
		      k=k*i;    
		  }    
		return k;
	}

}
