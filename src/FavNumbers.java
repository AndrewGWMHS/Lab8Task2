import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = InputHelper.getInt(scan, "Enter your favorite integer:");
        double num2 = InputHelper.getDouble(scan, "Enter your favorite double:");
        System.out.println("Your favorite integer is " + num1 + " and your favorite double is " + num2 + ".");
    }
}
