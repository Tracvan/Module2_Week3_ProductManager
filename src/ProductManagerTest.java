import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(1, "apple", 2);
        Product product2 = new Product(2, "orange", 2.5);
        Product product3 = new Product(3, "Strawberry", 5);
        Product product4 = new Product(4, "Banana", 1);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm sản phẩm theo Id");
            System.out.println("6. Hiển thị sản phẩm theo giá tăng dần");
            System.out.println("7. Hiển thị sản phẩm theo giá giảm dần");
            System.out.println("0. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    productManager.display();
                    break;
                case 2:
                    System.out.println("Hãy nhập id sản phẩm");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Hãy nhập tên sản phẩm");
                    String name = scanner.nextLine();
                    System.out.println("Hãy nhập giá sản phẩm");
                    double price = scanner.nextDouble();
                    Product product = new Product(id, name, price);
                    productManager.addProduct(product);
                    System.out.println("Đã thêm thành công");
                    break;
                case 3:
                    System.out.println("Hãy nhập id sản phẩm cần sửa: ");
                    int editedId = scanner.nextInt();
                    productManager.editProduct(editedId);
                    break;
                case 4:
                    System.out.println("Hãy nhập id sản phẩm cần xóa");
                    int deletedId = scanner.nextInt();
                    scanner.nextLine();
                    productManager.deleteProduct(deletedId);
                    break;
                case 5:
                    System.out.println("Nhập id sản phẩm cần tìm");
                    int idNumber = scanner.nextInt();
                    scanner.nextLine();
                    productManager.findById(idNumber);
                    break;
                case 6:
                    productManager.sortUpAscending();
                    break;
                case 7:
                    productManager.sortDownAscending();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        }
    }
}
