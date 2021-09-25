package Projrct.IMS;

public class Product {
    public int id;
    public String name;
    public String category;
    public float salesPrice;
    public float cost;
    public int quantity;
    public boolean active;

    public float getProfitOrLoss(){
        return salesPrice-cost;
    }
    public void activate(){
       active = true;
    }
    public void deactivate(){
     active = false;
    }
    public boolean belowTheThreshold(){
    return quantity < 0;
    }


}
