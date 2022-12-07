package entities;

public class Employee {
    protected Integer hours;
    protected Double valuePerHour;
    protected String name;

    public Employee(Integer hours, Double valuePerHour, String name){
        this.hours = hours;
        this.valuePerHour = valuePerHour;
        this.name = name;
    }
    
    public Double payment(){
        return hours * valuePerHour;
    }

    public String toString(){
        return String.format("Senhor %s, Voce tem: %d horas computada, seu valor por hora é: $ %.2f/hr", name, hours, valuePerHour);
    }
}
