import java.util.Arrays;

public class Numbers06 {
    
    public static void main(String[] args) {
        int [][] myNumbers = new int[3][1];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[5];
        myNumbers[2] = new int[5];
        
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ", " + myNumbers[i].length);
        }
    }
}
