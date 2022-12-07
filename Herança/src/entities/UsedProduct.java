package entities;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureData;

    public UsedProduct(String name, Double price, Date manufactureData) {
        super(name, price);
        this.manufactureData = manufactureData;
    }

    public Date getManufactureData() {
        return this.manufactureData;
    }

    public void setManufactureData(Date manufactureData) {
        this.manufactureData = manufactureData;
    }

    @Override
    public String priceTag(){
        return getName() + " (used) $ " + price + " (Manufacture date: "+manufactureData + ")";
    }
    


}
