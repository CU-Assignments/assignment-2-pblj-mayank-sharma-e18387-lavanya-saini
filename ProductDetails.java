import java.util.Scanner;
class Product {
    private int id;
    private String name;
    private double price;
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void displayProduct() {
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Product Price: " + price);
    }
}
public class ProductDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        Product p1 = new Product(id, name, price);
        System.out.println("\n--- Product Details ---");
        p1.displayProduct();
        sc.close();
    }
}


