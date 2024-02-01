public class OneOfEach {
	public static void main(String[] args) {

		boolean both = true;
		int girls = 0;
		int boys = 0;

		while(both) {

			if(Math.random() < 0.5) {
				girls++;
				System.out.print("g ");
			}
			else {
				boys++;
				System.out.print("b ");
			}

			if((girls > 0) && (boys > 0))
				both = false;
		}

		System.out.println();
		System.out.println("You made it... and now you have " + (boys + girls) + " children.");
	}
}