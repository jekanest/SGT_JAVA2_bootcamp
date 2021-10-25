package lesson8.practice.task7;

public class TestBook {

    public static void main(String[] args) {

        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);

        System.out.println("First book is : " + aBook.toString());
        System.out.println();

        // Use an anonymous instance of Author
        Book anotherBook = new Book("more Java for dummy", new Author("Sonya E. Keene", "s.keene@mail.com", 'f'), 29.95, 888);
        System.out.println("Second book is : " + anotherBook.toString());
        System.out.println();


        // additional task #1
        System.out.println("Java for dummy author name is: " + aBook.getAuthor().getName());
        System.out.println("Java for dummy author email is: " + aBook.getAuthor().getEmail());
        System.out.println();

        // additional task #2
        System.out.println("Java for dummy author name is: " + aBook.getAuthorName());
        System.out.println("Java for dummy author email is: " + aBook.getAuthorEmail());
        System.out.println("Java for dummy author gender is: " + aBook.getAuthorGender());

    }
}
