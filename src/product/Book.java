package product;

import person.Person;
import main.Product;

public class Book extends Product {

    private Person author;

    public Book(Person author) {this.author = author;}

    public Person getAuthor() {return author;}
    public void setAuthor(Person author) {this.author = author;}
    @Override public long getInvestment() {return author.getSalary();}
}