public class Element_100_in_array {
    public static void main(String[] args) {


    int[] arr = new int[101];
    for(int i=0;i<arr.length;i++){

        arr[i]=i;
    }
        for(int j=0;j<arr.length;j++){

            System.out.println(arr[j]);
        }
        System.out.println(arr[4]);

    }
}
