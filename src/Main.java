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


        System.out.println(greaterThen20("ASrar"));


        System.out.println("============string checker");

        System.out.println(stringChecker("fancy"));

    }

    public static int add(int x, int y) {

        return x + y;
    }

    public static boolean compare(int i, int p) {

        return (i>100 || p >100);


    }

    public static boolean greaterThen20(String input){

        System.out.println("==========String eingabe > 20");
        return input.length()>20;

    }

    public static boolean containStr(String str, String element){
        return str.contains(element);

    }

    public static boolean stringChecker(String str){
        return greaterThen20(str) && containStr(str, "fancy");
    }

}
