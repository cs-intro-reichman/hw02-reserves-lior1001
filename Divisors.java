public class Divisors {
    public static void main(String[] args) {
        //recieve a number from the user
        int x = Integer.parseInt(args[0]);

        //calculate x's factors and prints them
        int factor = 1;

        while(factor <= x) {
            if(x % factor == 0) {
                System.out.println(factor);
            }
            factor++;
        }
        }
}