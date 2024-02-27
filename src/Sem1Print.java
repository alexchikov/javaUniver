import java.util.Scanner;

public class Sem1Print {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String surname = in.next();
        String fathername = in.next();
        System.out.printf("%s %s %s", surname, name, fathername);
    }
}
