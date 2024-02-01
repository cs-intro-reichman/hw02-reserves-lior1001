public class Reverse {
    public static void main(String[] args) {
        //recieve a string from the user
        String s = args[0];
        String sOut = "";
        int length = s.length();
        int i = 0;
        
        while(i < length) {
            char c = s.charAt(i);
            sOut = c + sOut;
            i++;
        }
        System.out.println(sOut);

        char middleC = s.charAt((length-1)/2);
        System.out.println("The middle character is " + middleC);

        }
}