// RevStrWarmUp.java
// rVE 9/9/25

public class RevStrWarmUp {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my Reverse String Warm Up program!");

        //Create a program that reverses a string using a for loop
        // define this program in terms on input/processing/output

        //There is no input in this program, everything is hard input
        // Processing is Decrementing a for loop, finding the length of the string, creating a new string
        // with the end characters at the end of the string

        // Create a couple string variables
        String myStr = "abcdefghijk";
        String myRevStr = new String();


        // Create a for loop and use it tp get each chat from the str and use it

        int strLength  =  myStr.length();

        System.out.println("\n strLength is " + strLength);
        System.out.println("\n char at index 11 is " + myStr.charAt(10) );

        for (int i = (strLength-1); i >= 0; i--) {
            System.out.println("\n the char at " + i + " is " + myStr.charAt(i-1) );
            myRevStr += myStr.charAt(i);
        }

        System.out.println("\n\n myRevStr is: " + myRevStr + "\n\n");

    }
}