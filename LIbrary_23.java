

import java.util.ArrayList;
import java.util.List;

abstract class Item {
    private int id;
    private String title;
    private List<String> authors;

    public Item(int id, String title, List<String> authors) {
        this.id = id;
        this.title = title;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public abstract void displayDetails();
}

class Book extends Item {
    private String isbn;

    public Book(int id, String title, List<String> authors, String isbn) {
        super(id, title, authors);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    
    public void displayDetails() {
        System.out.println("Book: " + getTitle() + " (ID: " + getId() + ")");
        System.out.println("Authors: " + String.join(", ", getAuthors()));
        System.out.println("ISBN: " + getIsbn());
        System.out.println();
    }
}

class DVD extends Item {
    private String director;

    public DVD(int id, String title, List<String> authors, String director) {
        super(id, title, authors);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

   
    public void displayDetails() {
        System.out.println("DVD: " + getTitle() + " (ID: " + getId() + ")");
        System.out.println("Authors: " + String.join(", ", getAuthors()));
        System.out.println("Director: " + getDirector());
        System.out.println();
    }
}

class CD extends Item {
    private List<String> tracks;

    public CD(int id, String title, List<String> authors, List<String> tracks) {
        super(id, title, authors);
        this.tracks = tracks;
    }

    public List<String> getTracks() {
        return tracks;
    }

    
    public void displayDetails() {
        System.out.println("CD: " + getTitle() + " (ID: " + getId() + ")");
        System.out.println("Authors: " + String.join(", ", getAuthors()));
        System.out.println("Tracks: " + String.join(", ", getTracks()));
        System.out.println();
    }
}

class Library {
    private List<Item> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayLibraryContents() {
        for (Item item : items) {
            item.displayDetails();
        }
    }
}

public class LIbrary_23 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book(1, "The Catcher in the Rye", List.of("J.D. Salinger"), "978-0-316-76948-0");
        DVD dvd = new DVD(2, "The Shawshank Redemption", List.of("Frank Darabont"), "Frank Darabont");
        CD cd = new CD(3, "Abbey Road", List.of("The Beatles"), List.of("Come Together", "Something", "Octopus's Garden"));

        library.addItem(book);
        library.addItem(dvd);
        library.addItem(cd);

        library.displayLibraryContents();
    }
}