

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter student names (type 'end' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("end")) break;
            students.add(name);
        }

        System.out.println("Entered student names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
/*output :
Enter student names (type 'end' to stop):
iswarya
ganesh
safiha
harika
end
Entered student names:
iswarya
ganesh
safiha
harika*/

