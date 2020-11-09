package exercise4;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Grosse: ");
        int x = input.nextInt();
        int[] grosse = new int[x];

        System.out.println("Enter Zahlen: ");
        for (int index = 0; index < grosse.length; index++) {
            grosse[index] = input.nextInt();
        }

        String s = Arrays.toString(grosse);
        System.out.println("Numbers: " + s);
    }

}