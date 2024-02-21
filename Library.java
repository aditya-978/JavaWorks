public class Library {
    public static void main(String[] args) {
        Lib lib = new Lib();
        lib.addBooks("Rich dad Poor dad");
        lib.addBooks("Ikigai");
        lib.addBooks("My life, My rules");
        lib.addBooks("Agni ki udaan");
        lib.showAvailableBooks();
        lib.issueBook("rich, Dad poor Dad");

        lib.addBooks("prem prasang");
        lib.showAvailableBooks();
    }
}
class Lib{
    String [] books;
    int noOfBooks;
    Lib(){
       this.books = new String[100];
       this.noOfBooks = 0;
    }
    void addBooks(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
    }
    void issueBook(String book){
        for (int i = 0; i < books.length; i++) {
            if (book.equalsIgnoreCase(books[i])){
                System.out.println("Book issued: "+ books[i]);
                books[i] = null;
                return;
            }
        }
        System.out.println("Demanded Book not available.");
    }
    void returnBook() {
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for(String availableBook: books){
            if (availableBook != null)
                System.out.println("* "+availableBook);
        }
    }
}