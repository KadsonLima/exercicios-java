package entities;

public class ImportedProduct extends Product{
    private Double customsFee;


    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return customsFee + price;
    }

    public Double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice()+ " (Customs fee: $ "+customsFee + ")";
    }
    
}
