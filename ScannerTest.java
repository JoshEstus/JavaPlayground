import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}