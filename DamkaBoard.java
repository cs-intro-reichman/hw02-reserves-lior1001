public class DamkaBoard {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);

		//go over the columns
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {	//go over the rows
				System.out.print("*");
				if((i % 2 == 0) || (j < n-1) )
					System.out.print(" ");
			}
			if(i % 2 == 0) {
				System.out.println();
				System.out.print(" ");
			}
			else 
				System.out.println();
		}
	}
}