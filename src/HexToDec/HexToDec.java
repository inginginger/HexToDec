package HexToDec;
import java.util.Scanner;

public class HexToDec {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа в" +
                " шестнадцатеричной системе счисления через пробел: ");
        String first = sc.next();
        String second = sc.next();
        if((first.charAt(1) == 'x') && (second.charAt(1) == 'x')) {
            result = Integer.parseInt(first.substring(2), 16) - Integer.parseInt(second.substring(2), 16);
        } else {
            result = Integer.parseInt(first, 16) - Integer.parseInt(second, 16);
        }
        System.out.printf("Dec: %d\n", result);
        sc.close();
    }

}
