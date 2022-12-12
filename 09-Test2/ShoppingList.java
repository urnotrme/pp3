import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> products = new ArrayList<>();

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product product){
        products.add(product);
    }
 
    public String toString() {
        String list = "";
        for (Product product : products) {
            list += product.getName() + ",";
        }
        return list.substring(0, list.length() - 1);
    }

    public int total(){
        int list=0;
        for (Product product : products){
            list +=product.getQuantity();
        }
        return list;
    }

    public static void main(String[] args) {
        ShoppingList s1 = new ShoppingList();
        s1.add(new Product("milk", 2));
        s1.add(new Product("apple", 4));
        System.out.println(s1.toString());
        System.out.println(s1.total());
        ;
    }

    
}
