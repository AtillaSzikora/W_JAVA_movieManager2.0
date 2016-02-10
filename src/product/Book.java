package product;

import person.Person;
import main.Product;

import java.util.List;

public class Book extends Product {

    private Person author;

    public Book(Person author) {this.author = author;}

    public Person getAuthor() {return author;}
    public void setAuthor(Person author) {this.author = author;}
    @Override public long getInvestment(List<Person> persons) {return author.getSalary();}
}