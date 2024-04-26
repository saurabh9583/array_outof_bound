import java.util.Scanner;

public class ErrorInArray {
    public static void main(String[] args) {

    try {
        int arr[] = {1, 5, 3, 5, 4};
        System.out.println(arr[5]);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
        }
    }

}
