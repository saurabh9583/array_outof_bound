import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String operator = sc.nextLine();
        int num2 = sc.nextInt();
        System.out.println(num1+operator+num2);

    }
}
