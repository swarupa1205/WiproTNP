package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Author a = new Author("Devi", "devi@gmail.com", 'F');

        Book b = new Book("Java Programming", a, 499.50, 20);

        System.out.println("Book Name : " + b.getName());
        System.out.println("Price : " + b.getPrice());
        System.out.println("Stock : " + b.getQtyInStock());

        System.out.println("Author Name : " + b.getAuthor().getName());
        System.out.println("Author Email : " + b.getAuthor().getEmail());
        System.out.println("Author Gender : " + b.getAuthor().getGender());
    }
}