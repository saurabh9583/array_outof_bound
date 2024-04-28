import java.util.Scanner;

public class Bookmain {
    public static void main(String[] args) {
        Book book[] = new Book[2];
        Scanner sc = new Scanner(System.in);
//        TAking input
//        System.out.println("enter book detail");
        for (int i = 0; i < 2; i++) {
            Book b = new Book();
            System.out.println("enter book detail" + (i + 1));
            System.out.println("Enter book id");
            int bookid = sc.nextInt();
            b.setBookid(bookid);

            sc.nextLine();
            System.out.println("Enter book name");
            String bookname = sc.nextLine();
            b.setBookname(bookname);


            System.out.println("Enter book price");
            double bookprice = sc.nextDouble();
            b.setBookprice(bookprice);
            book[i]=b;

        }
        for (int j = 0; j < 2; j++) {
            System.out.println(book[j]);

        }
    }

}