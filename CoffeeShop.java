import java.util.Scanner;

public class CoffeeShop {
    static String[] menuNames = {"Americano", "Green Tea", "Cappuccino", "Thai Tea", "Latte"};
    static double[] menuPrices = {45.00, 50.00, 55.00, 50.00, 55.00};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] menuNames = {"Americano", "Green Tea", "Cappuccino", "Thai Tea", "Latte"};
        double[] menuPrices = {45.00, 50.00, 55.00, 50.00, 55.00};

        int[] qty = new int[menuNames.length];
 
        showMenu();
        while (true){
            System.out.print("\nSelect menu number (Enter 0 to checkout): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > menuNames.length) {
                System.out.println("[!]Error Try again!\n");
                continue;
            }
            
            //num of glass
            System.out.print("Enter quantity: ");
            int amount = sc.nextInt();

            if (amount <= 0) {
                System.out.println("[!]Error: glass >=0 .");
                continue;
            }
            
            qty[choice - 1]  += amount;
            System.out.println("[/] Added "+ menuNames[choice - 1]+ " x " +amount+ " to order.\n");
        }
        double total = calculateTotal(menuPrices, qty);
        double discount = calculateDiscount(total);
        double netTotal = total - discount;   
        
        printReceipt(menuNames, menuPrices, qty, total, discount, netTotal);

        sc.close();
    }
//--------------------------M-E-T-H-O-D--------------------
    //--1.Show menu
    public static void showMenu(){
        System.out.println("\n============ COFFEE MENU ============");
        int i;
        for(i=0; i<menuNames.length; i++){
            System.out.printf((i + 1) +". "+menuNames[i]+"\t\t\t" + "%.2f \n",menuPrices[i]);
        }
        System.out.println("\n<<<<<<<< Enter 0 to checkout >>>>>>>>");
        System.out.println("=====================================");
    }
//---------------------------------------------------------
    //--2.calculateTotal
    public static double calculateTotal(double[] menuPrice, int[] qty) {
        double sum = 0;
        for (int i = 0; i < menuPrices.length; i++) {
            sum += menuPrice[i] * qty[i]; 
        }
        return sum;
    }
//---------------------------------------------------------
    //--3.calculateDiscount
    public static double calculateDiscount(double total) {
        return total * 0.10;
    }
//---------------------------------------------------------
    //4.printReceipt
    public static void printReceipt(String[] menu, double[] price, int[] qty, double total, double discount, double netTotal) {
        System.out.println("\n             COFFEE SHOP              ");
        System.out.println("\n============== RECEIPT ===============");
        System.out.println("item\t\tqty\tunit\ttotal");

        for (int i = 0; i < menu.length; i++) {
            if (qty[i] > 0) { 
                double itemTotal = price[i] * qty[i];
                System.out.printf("%-15s", menu[i]);
                System.out.println("\t" + qty[i] + "\t" + price[i] + "\t" + itemTotal);
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Subtotal:\t\t" + total + " THB");
        System.out.println("Discount (10%):\t\t" + discount + " THB");
        System.out.println("Net Total:\t\t" + netTotal + " THB");
        System.out.println("======== Thank You Very Much! ========");
    }
}

