public class Product {
    private String productName;
    private boolean isVeg;

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getIsVeg(){
        if (isVeg) {
            return "The product is vegetarian";
        } else {
            return "The product is not vegetarian";
        }
    }
    public void setIsVeg(boolean isVeg){
        this.isVeg = isVeg;
    }

    public static void main(String[] args){
        Product pr = new Product();
        pr.setProductName("Chocolate Cheesecake");
        pr.setIsVeg(false);
        System.out.println(pr.getProductName() + ". " + pr.getIsVeg());
    }
}
