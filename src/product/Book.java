package product;

import person.Person;
import main.Product;
import java.util.List;

public class Book extends Product {

    private List<Person> author;

    public Book(List<Person> author) {this.author = author;}

    public Person getAuthor() {return (Person) author;}
    public void setAuthor(List<Person> author) {this.author = (List<Person>) author;}
    public long getInvestment(List<Person> author) {
        int salaryOfAuthor = 0;
        for(Person a : author) {salaryOfAuthor += a.getSalary();}
        return salaryOfAuthor;}
}