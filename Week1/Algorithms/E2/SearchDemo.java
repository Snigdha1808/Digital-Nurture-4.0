import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = products[mid].productName.compareToIgnoreCase(targetName);
            if (result == 0) return products[mid];
            else if (result < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Chair", "Furniture"),
            new Product(103, "Book", "Education"),
            new Product(104, "Phone", "Electronics")
        };

        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1 : "Not Found");

        System.out.println("\nBinary Search Result:");
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));  // Sort by name
        Product result2 = binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2 : "Not Found");
    }
}
