public class InOrder {
	public static void main (String[] args) {

		int prevNum = (int) (Math.random() * 10);		//Generate an initial number between [0,10)
		System.out.print(prevNum + " ");
		int newNum;		//Declare the variable outside the while loop

		do {
			//Generate a number between [0,10)
			newNum = (int) (Math.random() * 10);
			if(newNum >= prevNum) {		//if the new generated number is bigger than the previous one, print it
				System.out.print(newNum + " ");
				prevNum = newNum;		//change the value of the previous number to the value of the new one so that another comparrison will be possible
			}
		} while (newNum >= prevNum);

	}
}