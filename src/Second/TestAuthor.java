package Second;
import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John", "johnny@mail.ru", 'M');
        System.out.println("Имя автора: " + author.getName() + '\n' + "Почта автора: " + author.getEmail()
                + '\n' + "Пол автора: " + author.getGender());

        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите новую почту:");
        String em = sc.next();
        author.setEmail(em);
        System.out.println(author.toString());
    }
}
