import java.util.Scanner;

public class shopping_list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Predefined list of items for sale
        String[] shoppingList = {"coffee", "fruits", "rice", "vinegar", "milk"};
        int count = shoppingList.length;

        System.out.println("🛒 Shopping List Program by Allan Balmedina\n");

        // Display the 5 items
        System.out.println("Here are the 5 items you are selling:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + shoppingList[i]);
        }

        // Count and display number of items
        System.out.println("\nYou have " + count + " items in your list.");

        // Search feature
        System.out.print("\nSearch for an item: ");
        String search = input.nextLine();

        boolean found = false;
        for (String item : shoppingList) {
            if (item.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        // Output search result
        if (found) {
            System.out.println("✅ " + search + " is in your shopping list!");
        } else {
            System.out.println("❌ " + search + " is not in your shopping list.");
        }

        input.close();
    }
}
