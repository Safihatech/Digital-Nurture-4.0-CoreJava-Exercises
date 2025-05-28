
import java.util.*;

public class LambdaFunction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("John");
        names.add("Alex");
        names.add("Mona");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

/*output :
Sorted names:
Alex
John
Mona
Zara*/
