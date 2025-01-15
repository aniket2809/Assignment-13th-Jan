public class Laptop {
    private String brand;
    private int price;
    private String processor;

    //Adding Getter and Setter for the instance variables
    
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public String getProcessor(){
        return this.processor;
    }
    public void setProcessor(String processor){
        this.processor=processor;
    }
}
