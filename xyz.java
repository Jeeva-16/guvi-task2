import java.util.Scanner;


    public class xyz {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            product[] products = new product[5];

            // Accept five product information from user
            for (int i = 0; i < products.length; i++) {
                System.out.println("Enter details for Product " + (i + 1) + ":");
                System.out.print("PID: ");
                int pid = scanner.nextInt();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                products[i] = new product(pid, price, quantity);
            }

            // Find PID of the product with the highest price
            int highestPricePid = findHighestPriceProduct(products);
            System.out.println("PID of the product with the highest price: " + highestPricePid);

            // Calculate and return the total amount spent on all products
            double totalAmountSpent = calculateTotalAmountSpent(products);
            System.out.println("Total amount spent on all products: " + totalAmountSpent);

            scanner.close();
        }
        public static int findHighestPriceProduct(product[] products) {
            if (products.length == 0) return -1;

            product highestPriceProduct = products[0];
            for (product product : products) {
                if (product.getPrice() > highestPriceProduct.getPrice()) {
                    highestPriceProduct = product;
                }
            }
            return highestPriceProduct.getPid();
        }

        // Method to calculate the total amount spent on all products
        public static double calculateTotalAmountSpent(product[] products) {
            double totalAmount = 0;
            for (product product : products) {
                totalAmount += product.getPrice() * product.getQuantity();
            }
            return totalAmount;
        }
    }



