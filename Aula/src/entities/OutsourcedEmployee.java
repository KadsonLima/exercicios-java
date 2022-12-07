package entities;

public class OutsourcedEmployee extends Employee {
    protected Double additionalCharge;

    public OutsourcedEmployee(Integer hours, Double valuePerHour, String name, Double additionalCharge){
        super( hours,  valuePerHour,  name);
        this.additionalCharge = additionalCharge;
    }


    public Double additionalCharge(){

        return (payment() * 1.0) + payment();
    }

    public String toString(){
        return String.format("Senhor %s, Voce tem: %d horas computada, seu valor por hora é: $ %.2f/hr", name, hours, valuePerHour);
    }
}
