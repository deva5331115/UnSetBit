import java.util.Scanner;

public class UnsetBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(unset(number1,number2));

    }

    public static int unset(int num1, int num2) {
        int temp=(num1 & (1<<num2));
        return ((num1 & (1<<num2)) == 0) ? num1 : (int)((num1 - temp));
    }
}
