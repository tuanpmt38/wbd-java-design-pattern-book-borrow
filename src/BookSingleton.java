public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanOut;

    private BookSingleton(){
        author = "Gamma, Helm, Jonson, and Vilissides";
        title = "Design Pattern";
        book = null;
        isLoanOut = false;
    }

    public static BookSingleton borrowbook(){
        if(!isLoanOut){
            if(book== null){
                book = new BookSingleton();
            }
            isLoanOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookReturn){
        isLoanOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorandTitle(){
        return getTitle() + "by" + getAuthor();
    }
}
