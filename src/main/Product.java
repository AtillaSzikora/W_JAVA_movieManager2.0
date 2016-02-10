package main;

import person.Person;

import java.util.List;

public abstract class Product {

    String id;
    String title;
    Person renter;

    public String getTitle() {return title;}
    public Person getRenter() {return renter;}
    public abstract long getInvestment(List<Person> persons);
}