//.Write a  program to print the book details (book id,book name,price) using arrays of object


public class Book {
    int bookid;
    String bookname;
    double bookprice;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getBookprice() {
        return bookprice;
    }



    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookprice=" + bookprice +
                '}';
    }
}


