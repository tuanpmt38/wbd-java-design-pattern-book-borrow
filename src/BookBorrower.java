public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook;

    public void borrowBook(){
        borrowedBook = BookSingleton.borrowbook();
        if(borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }

    public String getAuthorandTitle(){
        if(haveBook){
            return borrowedBook.getAuthorandTitle();
        }
        return "I don't have a book";
    }

    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }

}
