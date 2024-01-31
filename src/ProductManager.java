import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> productsList = new ArrayList<>();

    public  void addProduct(Product product) {
        productsList.add(product);
    }

    public void editProduct(int id) {
        for (Product product: productsList) {
            if (product.getId() == id) {
                System.out.println("Input newId");
                int newId = scanner.nextInt();
                product.setId(newId);
                System.out.println("Input newName");
                String newName = scanner.nextLine();
                product.setName(newName);
                System.out.println("Input newPrice");
                double newPrice = scanner.nextDouble();
                product.setPrice(newPrice);
                System.out.println("Đã sửa thành công");
            }
        }
    }

    public void deleteProduct(int id) {
        for (Product product: productsList) {
            if (product.getId() == id) {
                productsList.remove(product);
                break;
            }
        }
        System.out.println("Đã xóa thành công");

    }

    public void display() {
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }

    public void findById(int id) {
        for (Product product: productsList) {
            if (product.getId()==id) {
                System.out.println(product.toString());
            }
        }
    }

    public void sortUpAscending() {
        PriceComparator ascendingComparator = new PriceComparator(true);
        Collections.sort(productsList, ascendingComparator);
        System.out.println("Danh sách sắp xếp tăng dần theo giá:");
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }
    public void sortDownAscending() {
        PriceComparator ascendingComparator = new PriceComparator(false);
        Collections.sort(productsList, ascendingComparator);
        System.out.println("Danh sách sắp xếp giảm dần theo giá:");
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }
}
