//ArrayPractice.java
// rVe 9/9/25
public class ArrayPractice {
    public static void main(String[] args) {
        // create a String array of four elements
        String[] cars = new String[4];

        cars[0] = "RX7";
        cars[1] = "S15";
        cars[2] = "GR86";
        cars[3] = "GX550";

        // Output the array
        for (int i = 0; i < 4; i++) {
            System.out.println("\n i is " + i + " and myFourStrings[" + i + "] is: " +cars[i]);
        }
    }
}