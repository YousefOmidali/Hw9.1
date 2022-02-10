import java.util.*;

public class Main {
    public static void main(String args[]) {
        Test test = new Test();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key");
        String key = scanner.nextLine();
        System.out.println("Enter value");
        String value = scanner.nextLine();
        test.test(key, value);

    }
}