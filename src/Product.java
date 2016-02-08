/*
Create a class called Product. It is able to tell us how much money was the investment for the current product
by getInvestment method, but there is a little problem: we cannot define how to calculate the investment,
because it depends on the type of the product.
Person field in Product class means the person who rented the current product.
 */

import product.person.Person;

public class Product {

    String id = "";
    String title = "";
    Person person;

    public String getTitle() {return title;}
    public Person getPerson() {return person;}
    public long getInvestment() {return 0;}
}
