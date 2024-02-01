public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int i = 0;
		int girls = 0;
		int boys = 0;
		boolean both = true;
		int famOf2 = 0;
		int famOf3 = 0;
		int fourOrMore = 0;
		double numOfChildren = 0;
		double avg = 0;
		int moreThan4 = 0;

		while(i < T) {
			while(both) {
				if(Math.random() < 0.5) {
					girls++;
					//System.out.print("g ");
				}
				else {
					boys++;
					//System.out.print("b ");
				}

				if((girls > 0) && (boys > 0))
					both = false;
			}
			//System.out.println();
			//System.out.println("You made it... and now you have " + (boys + girls) + " children.");

			if(boys + girls == 2) {
				famOf2++;
			} else if (boys + girls == 3) {
				famOf3++;
			} else {
				fourOrMore++;
			}
			numOfChildren += (boys + girls);
			both = true;
			girls = 0;
			boys = 0;
			i++;
		}

		avg = (numOfChildren/T);

		//System.out.println(numOfChildren);
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + famOf2);
		System.out.println("Number of families with 3 children: " + famOf3);
		System.out.println("Number of families with 4 or more children: " + fourOrMore);

		int max = Math.max(famOf2, (Math.max(famOf3, fourOrMore)));
		String common = "";

		if(max == famOf2) {common= "2";}
		else if (max == famOf3) {common= "3";}
		else if (max == fourOrMore) {common= "4 or more";}
		System.out.println("The most common number of children is " + common + ".");
	}
}