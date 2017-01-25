package HexToDec;
import java.util.Scanner;

public class HexToDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа в" +
                " шестнадцатеричной системе счисления через пробел: ");
        String first = sc.next();
        String second = sc.next();
        int result = Integer.parseInt(first, 16) - Integer.parseInt(second, 16);
        System.out.printf("Dec: %d\n", result);
        sc.close();
    }

}
