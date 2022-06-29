import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        int x, y;

        int sum = add(3, 5);
        System.out.println(sum);

        System.out.println(compare(70, 500));

        Scanner sc = new Scanner(System.in);

        System.out.println("====Gib Bitte Zwei Zahlen ein!");

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("mit Scanner : " + add(x, y));

        System.out.println("==================================");

        System.out.println(compare(x, y));

    }

    public static int add(int x, int y) {

        return x + y;
    }

    public static boolean compare(int i, int p) {

        if (i > 100 || p > 100) {
            return true;
        } else {
            return false;

        }

    }


}
