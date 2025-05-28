import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.println("Enter student ID and name (type ID -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            if (id == -1) break;

            System.out.print("Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to retrieve name: ");
        int searchId = sc.nextInt();
        if (studentMap.containsKey(searchId)) {
            System.out.println("Name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
    }
}
/*output:
Enter student ID and name (type ID -1 to stop):
ID: 1
Name: iswarya
ID: 2
Name: safiha
ID: 3
Name: harika
ID: -1
Enter ID to retrieve name: 2
Name: safiha
*/