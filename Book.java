package Inheritance;

public class Book {
	 private String name;
	    private int price;
	    private Author author;
	    private Publisher publisher;

	    public Book(String name, int price, Author author, Publisher publisher) {
	        this.name = name;
	        this.price = price;
	        this.author = author;
	        this.publisher = publisher;
	    }

	    public String getName() { return name; }
	    public int getPrice() { return price; }
	    public Author getAuthor() { return author; }
	    public Publisher getPublisher() { return publisher; }
	}

	 class Main {
	    public static void main(String[] args) {
	        Author author = new Author("Micheal", 32, "USA");
	        Publisher publisher = new Publisher("Sun Publisher", "ABC-1110", "London");
	        Book book = new Book("Core Java", 800, author, publisher);

	        System.out.println("Book name: " + book.getName());
	        System.out.println("Book price: " + book.getPrice());
	        System.out.println("--Author Details--");
	        System.out.println("Author Name: " + book.getAuthor().getName());
	        System.out.println("Author Age: " + book.getAuthor().getAge());
	        System.out.println("Author Place: " + book.getAuthor().getPlace());
	        System.out.println("Publisher Details");
	        System.out.println("Publisher Name: " + book.getPublisher().getName());
	        System.out.println("Publisher ID: " + book.getPublisher().getId());
	        System.out.println("Publisher City: " + book.getPublisher().getCity());
	    }
	}