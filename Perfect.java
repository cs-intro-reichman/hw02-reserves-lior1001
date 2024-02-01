public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int newNum = 1;
		String perf = n + " is a perfect number since " + n + " = 1";

		for(int factor = 2; factor < n; factor++) {
			if(n % factor == 0) {
				perf = perf + " + " + factor;
				newNum += factor;
			}
		}

		if(newNum == n)	{
			System.out.println(perf);
		}
		else {
			System.out.println(n + " is not a perfect number");
		}
	}
}