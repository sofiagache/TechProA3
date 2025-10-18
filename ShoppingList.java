import java.util.Scanner;

public class ShoppingList {

    public static void buildShoppingList() {
        Scanner sc = new Scanner(System.in);
        String[] items = new String[5]; 
        int count = 0;

        System.out.println("Enter up to 5 items to buy:");
        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }
            items[count] = input;
            count++;
        }

   
        System.out.println("\nYour shopping list:");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("You entered " + count + " item(s).");

       
        System.out.print("\nSearch for an item: ");
        String search = sc.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (items[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is in your shopping list!");
        } else {
            System.out.println(search + " is NOT in your shopping list.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        buildShoppingList();
    }
}
