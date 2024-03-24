import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = input.nextLine();
        char[] h = name.toCharArray();
        int i = 0;
        String polindrom = "Name is a palindrom";
        for (int j = name.length() - 1; j > 0; j--) {
            if (h[i] != h[j]) {
                polindrom = "Name is not a palindrom";
                break;
            }

            i += 1;
        }
        System.out.println(polindrom);


    }
}