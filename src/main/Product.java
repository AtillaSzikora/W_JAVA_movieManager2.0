package main;

import person.Person;

public abstract class Product {

    String id;
    String title;
    Person renter;

    public String getTitle() {return title;}
    public Person getRenter() {return renter;}
    public abstract long getInvestment();
}