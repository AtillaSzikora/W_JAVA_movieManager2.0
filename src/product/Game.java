package product;

import main.Product;
import main.Buyable;
import person.Person;
import java.util.List;

public class Game extends Product implements Buyable {

    private boolean preOrdered;
    private List<Person> staff;
    private int price;

    public Game(boolean preOrdered, List<Person> staff, int price) {
        this.preOrdered = preOrdered;
        this.staff = staff;
        this.price = price; }

    public boolean isPreOrdered() {return true;}
    public void setPreOrdered(boolean preOrdered) {this.preOrdered = preOrdered;}
    public List<Person> getStaff() {return staff;}
    public void setStaff(List<Person> staff) {this.staff = staff;}
    @Override public int getPrice() {return 0;}
    public void setPrice(int price) {this.price = price;}
    @Override public long getInvestment() {
        int salaryOfStuff = 0;
        for(Person s :staff) {salaryOfStuff += s.getSalary();}
        return salaryOfStuff; }
}