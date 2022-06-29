import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        int x, y;

        System.out.println("==================");
        int sum = add(3, 5);
        System.out.println(sum);

        System.out.println("===================");
        System.out.println(compare(70, 500));

        System.out.println("==================");

        Scanner sc = new Scanner(System.in);

        System.out.println("====Gib Bitte Zwei Zahlen ein!");

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("mit Scanner : " + add(x, y));

        System.out.println("================================== Zahl größer als 100?");

        System.out.println(compare(x, y));

    }

    public static int add(int x, int y) {

        return x + y;
    }

    public static boolean compare(int i, int p) {

        return (i>100 || p >100);


    }


}
