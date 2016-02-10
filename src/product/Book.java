package product;

import person.Person;
import main.Product;

public class Book extends Product {

    private Person author;

    public Book(Person author) {this.author = author;}

    public Person getAuthor() {return (Person) author;}
    public void setAuthor(Person author) {this.author = (Person) author;}

    @Override
    public long getInvestment() {
        int salaryOfAuthor = 0;
        return author.getSalary();
    }
}