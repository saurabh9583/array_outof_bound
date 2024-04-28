import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        for(int a = 0; a < arr.length; a++){
            arr[a] = sc.nextInt();

        }
        for(int a = 0; a < arr.length; a++){
            System.out.println( arr[a] +" ");

        }

    }

}