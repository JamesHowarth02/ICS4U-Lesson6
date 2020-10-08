package library;

public class Patron {
    private String name;
    private Book[] Books;
    
    public Patron(String name) {
        this.name = name;
        Books = new Book[3];
    }
    
    public boolean Borrow(Book b) {
        for (int i = 0; i < 3; i++) {
            if(Books[i] == null) {
                Books[i] = b;
                return true;
            }
        }
        return false;
    }
    
    public boolean returnBook(Book b) {
        for (int i = 0; i < 3; i++) {
            if(Books[i] == b) {
                Books[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean hasBook(Book b) {
        for (int i = 0; i < 3; i++) {
            if(Books[i] == b) {
                return true;
            }
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }  
    
    @Override
    public String toString() {
        String text = "Patron: " + name + "\n";
        for (int i = 0; i < 3; i++) {
            if(Books[i] != null) {
                text = text + Books[i].getTitle() + " by " + Books[i].getAuthor() + "\n";
            }
        }
        return text;
    }
}
