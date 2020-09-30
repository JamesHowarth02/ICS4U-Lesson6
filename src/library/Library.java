/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

public class Library {

    public static void main(String[] args) {
        Book b1, b2, b3, b4, b5;
        b1 = new Book("From Russia, With Love", "Greg Hines");
        b2 = new Book("Living Smart", "Rita Langill");
        b3 = new Book("Singing in the Rain", "Harry Conner");
        b4 = new Book("Good Housekeeping", "Pat Burns");
        b5 = new Book("To be a Model", "Lisa Lahey");
        
        Patron p = new Patron("Miles Davis");
        
        System.out.println("Lending four books to " + p.getName());
        if(p.Borrow(b1)) System.out.println(b1.getTitle() + " successfully borrowed.");
        else System.out.println(b2.getTitle() + " could not be borrowed.");
        if(p.Borrow(b2)) System.out.println(b2.getTitle() + " successfully borrowed.");
        else System.out.println(b2.getTitle() + " could not be borrowed.");
        if(p.Borrow(b3)) System.out.println(b3.getTitle() + " successfully borrowed.");
        else System.out.println(b3.getTitle() + " could not be borrowed.");
        if(p.Borrow(b4)) System.out.println(b4.getTitle() + " successfully borrowed.");
        else System.out.println(b4.getTitle() + " could not be borrowed.");
        
        System.out.println("-----\nAttempting to return the first book:\n-----");
        
        if(p.returnBook(b1)) System.out.println(b1.getTitle() + " was successfully returned.");
        else System.out.println(b1.getTitle() + " unable to return this book. It was not borrowed out.");
        
        System.out.println("Here is a list of books currently lent to " + p.getName() + "\n-----");
        System.out.println(p); // you could also do p.HasBook(b1) for book objects.
    }
    
}
