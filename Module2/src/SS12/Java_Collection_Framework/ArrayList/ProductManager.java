package SS12.Java_Collection_Framework.ArrayList;

import java.util.*;

public class ProductManager {
    static List<Product> products=new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void edit(int id) {
        Scanner scanner=new Scanner(System.in);
        Product product=products.get(id);
        System.out.println("Enter name: ");
        product.setName(scanner.nextLine());
        System.out.println("Enter price: ");
        product.setPrice(Float.parseFloat(scanner.nextLine()));
    }

    public Product remove(int index){
        return products.remove(index);
    }

    public void display() {
        for(Product product:products) {
            System.out.println(product);
        }
    }

    public Product search(String name) {
        for(Product product:products) {
            if(product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public void sort() {
        Collections.sort(products);
    }

    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Product product=new Product(1,"Hai",12);
        Product product1=new Product(1,"Hai1",10);
        Product product2=new Product(1,"Hai2",12);
        products.add(product);
        products.add(product1);
        products.add(product2);
        productManager.edit(1);
        productManager.display();
        productManager.sort();
        productManager.display();
    }
}
