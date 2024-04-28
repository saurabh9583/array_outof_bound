public class arithmeticException {
    public static void main(String[] args) {
        int a = 5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
