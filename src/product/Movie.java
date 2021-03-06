package product;

import main.Buyable;
import main.Genre;
import main.IdGenerator;
import main.Product;
import person.Person;
import java.util.List;

public class Movie extends Product implements Buyable {

    private Genre genre;
    private long duration;
    private double rate;
    private List<Person> cast;
    private int price;

    public Movie(String title, Genre genre, long duration, double rate, List<Person> cast, int price) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rate = rate;
        this.cast = cast;
        this.price = price;
        this.id = IdGenerator.generate(this); }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public long getDuration() {
        return duration;
    }
    public void setDuration(long duration) {
        this.duration = duration;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public List<Person> getCast() {
        return cast;
    }
    public void setCast(List<Person> cast) {
        this.cast = cast;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override public int getPrice() {return price;}

    @Override public long getInvestment() {
        int salaryOfCast = 0;
        for (Person c : this.cast) {salaryOfCast += c.getSalary();}
        return salaryOfCast; }

    public String toString() {
        String strCast = "";
        for(Person c : cast) {strCast += c.getFirstName() + c.getLastName() + ", ";}
        return "ID: " + this.id + ", title: " + title + "\n"
             + "genre: " + genre + ", duration: " + duration + "mins, rated: " + rate + "\n"
             + "cast: " + strCast + "\n"
             + "price: " + price + " USD, " + "investment: " + this.getInvestment() + " USD\n"; }
}