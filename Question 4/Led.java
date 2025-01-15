public class Led {
    private int id;
    private String brand;
    private int price;

    //Adding Getter and Setter for the instance vaiables
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }

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
}
