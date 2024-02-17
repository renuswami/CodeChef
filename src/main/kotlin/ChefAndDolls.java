import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefAndDolls {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            Set<Integer> dollTypes = new HashSet<>();

            // Read the types of dolls and update the set
            for (int j = 0; j < n; j++) {
                int type = scanner.nextInt();
                if (dollTypes.contains(type)) {
                    dollTypes.remove(type);
                } else {
                    dollTypes.add(type);
                }
            }

            // The only type left in the set is the missing type of doll
            int missingType = dollTypes.iterator().next();
            System.out.println(missingType);
        }
        scanner.close();
    }
}
