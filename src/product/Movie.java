package product;

import main.Buyable;
import main.Genre;
import main.Product;
import person.Person;

import java.util.List;

public class Movie extends Product implements Buyable {

    private Genre genre;
    private long duration;
    private double rate;
    private List<Person> cast;
    private int price;

    public Movie(Genre genre, long duration, double rate, List<Person> cast, int price) {
        this.genre = genre;
        this.duration = duration;
        this.rate = rate;
        this.cast = cast;
        this.price = price;
    }

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

    @Override
    public int getPrice() {
        return 0;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public long getInvestment() {
        int salaryOfCast = 0;
        for (Person c : this.cast) {
            salaryOfCast += c.getSalary();
        }
        return salaryOfCast;
    }
}