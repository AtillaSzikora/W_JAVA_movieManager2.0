package product;

import main.IdGenerator;
import person.Person;
import main.Product;

public class Book extends Product {

    private Person author;

    public Book(String title, Person author) {
        this.title = title;
        this.author = author;
        this.id = IdGenerator.generate(this); }

    public Person getAuthor() {return author;}
    public void setAuthor(Person author) {this.author = author;}

    @Override public long getInvestment() {
        int salaryOfAuthor = 0;
        return author.getSalary(); }

    public String toString() {
        return "ID: " + this.id + ", " + "title: " + title + "\n"
             + "author: " + author.getFirstName() + author.getLastName() + "\n"
             + "investment: " + this.getInvestment() + " USD\n"; }
}