package product;

import main.Buyable;
import main.Product;
import person.Gender;
import person.Person;
import java.util.List;

public class Movie extends Product implements Buyable{

    Gender gender;
    long duration;
    double rate;
    List<Person> cast;
    int price;

    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}
    public long getDuration() {return duration;}
    public void setDuration(long duration) {this.duration = duration;}
    public double getRate() {return rate;}
    public void setRate(double rate) {this.rate = rate;}
    public List<Person> getCast() {return cast;}
    public void setCast(List<Person> cast) {this.cast = cast;}
    @Override
    public int getPrice() {return 0;}
    public void setPrice(int price) {this.price = price;}
    @Override
    public long getInvestment() {return 0;}
}