import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        switch (number) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + "  *" + " " + i + " =" + " " + number * i);
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + "  *" + " " + i + " =" + " " + number * i);
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + "  *" + " " + i + " =" + " " + number * i);
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + "  *" + " " + i + " =" + " " + number * i);
                }
                break;
            case 5:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + "  *" + " " + i + " =" + " " + number * i);
                }
                break;
            default:
                System.out.println("Enter number between 1 to 5");
                break;
        }
    }
}
