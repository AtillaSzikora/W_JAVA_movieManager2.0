package product;

import person.Person;
import main.Product;

public class Book extends Product {

    Person author;

    public Person getAuthor() {return author;}
    public void setAuthor(Person author) {this.author = author;}
    @Override
    public long getInvestment() {return 0;}
}