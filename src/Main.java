import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by brettgrist on 9/21/16.
 */
public class Main {

    static GolfClubs createItem(Scanner scanner, HashMap glf) {
        GolfClubs add = new GolfClubs();


        System.out.print("Enter Golf Club Name: ");
        String x = scanner.nextLine();
        if (x.equalsIgnoreCase("Calloway")){
            add.setBrand(x);}
        if (x.equalsIgnoreCase("Mizuno")){
            add.setBrand(x);
        }
        if (x.equalsIgnoreCase("Ping")){
            add.setBrand(x);
        }
        if (x.equalsIgnoreCase("TaylorMade")) {
            add.setBrand(x);
        }
        if (x.equalsIgnoreCase("Titlest")) {
            add.setBrand(x);
        }

        else System.out.println("Item Cannot Be Added To Inventory");

        System.out.print("Enter the item price: ");
        String y = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        int z = Integer.parseInt(scanner.nextLine());

        glf.put(x, add);

        return add;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, GolfClubs> glf = new HashMap<>();
        while (true) {

            System.out.println("Enter your username");
            String name1 = scanner.nextLine();

            boolean isLoggedIn = true;
            while (isLoggedIn) {
                System.out.println("1. Add an item to Inventory");
                System.out.println("2. Remove item from Inventory");
                System.out.println("3. List all Inventory Items");
                System.out.println("4. Update quanity of an Item");
                System.out.println("5. Logout");

                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        GolfClubs add = createItem(scanner, glf);
                        glf.put(add.brand, add);
//                        System.out.print("Enter Golf Club Name: ");
//                        String x = scanner.nextLine();
//                        System.out.print("Enter the item price: ");
//                        String y = scanner.nextLine();
//                        System.out.print("Enter the quantity: ");
//                        int z = Integer.parseInt(scanner.nextLine());

//                        if (glf.containsKey(x)) {
//                            glf.get(x).setQuantity(glf.get(x).quantity + z);
//                        } else {
//                            GolfClubs add = new GolfClubs(y, z, x);
//                            glf.put(x, add);
//                        }
                        break;
                    case "2":
                        System.out.print("Enter Item No.: ");
                        String x = scanner.nextLine();
                        glf.remove(x);
                        break;
                    case "3":
                        for (String out : glf.keySet()) {
                            int qty = glf.get(out).quantity;
                            String priceOut = glf.get(out).price;
                          //  System.out.println(out + " " + priceOut + " " + qty);
                            System.out.printf("%s %s %s\n", out, priceOut, qty);
                        }
                        break;
                    case "4":
                        System.out.println("Enter the item number you want to update:");
                        String x2 = scanner.nextLine();
                        System.out.println("How many itmes are you adding to the current total?");
                        int z = Integer.parseInt(scanner.nextLine());
                        int newQty = glf.get(x2).quantity + z;
                        glf.get(x2).quantity = newQty;
                        break;
                    case "5":
                        isLoggedIn = false;


                }
            }
        }
    }
}
