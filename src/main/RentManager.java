package main;

import person.Gender;
import product.Book;
import person.Person;
import product.Game;
import product.Movie;
import java.util.Arrays;
import java.util.List;

public class RentManager {

    public static void main(String[] args) {

        Person jani = new Person("Ja", "Ni", Gender.MALE, 100);
        Person jozsi = new Person("Jo", "Zsi", Gender.MALE, 200);
        Person jolan = new Person("Jo", "Lan", Gender.FEMALE, 300);
        Person jakab = new Person("Ja", "Kab", Gender.MALE, 400);
        Person juci = new Person("Ju", "Ci", Gender.FEMALE, 500);
        Person julcsi = new Person("Jul", "Csi", Gender.FEMALE, 600);

        List<Person> book1Author = Arrays.asList(jani);
        List<Person> book2Author = Arrays.asList(jozsi);
        List<Person> book3Author = Arrays.asList(jolan);
        List<Person> game1Staff = Arrays.asList(jani, jozsi, jolan, jakab);
        List<Person> game2Staff = Arrays.asList(jolan, jakab, juci, julcsi);
        List<Person> game3Staff = Arrays.asList(jozsi, jolan, jakab, juci);
        List<Person> movie1Cast = Arrays.asList(jani, jolan, juci);
        List<Person> movie2Cast = Arrays.asList(jozsi, jakab, julcsi);
        List<Person> movie3Cast = Arrays.asList(jakab, juci, julcsi);

        Product book1 = new Book(book1Author);
        Product book2 = new Book(book2Author);
        Product book3 = new Book(book3Author);
        Product game1 = new Game(true, game1Staff, 150);
        Product game2 = new Game(false, game2Staff, 250);
        Product game3 = new Game(true, game3Staff, 350);
        Product movie1 = new Movie(Genre.ACTION, 110, 3, movie1Cast, 450);
        Product movie2 = new Movie(Genre.DRAMA, 120, 4, movie2Cast, 550);
        Product movie3 = new Movie(Genre.COMEDY, 100, 2, movie3Cast, 650);

        System.out.println("The total investment for games is: "
                + (game1.getInvestment(game1Staff)
                + game2.getInvestment(game2Staff)
                + game3.getInvestment(game3Staff)));
        System.out.println("The total investment for movies is: "
                + (movie1.getInvestment(movie1Cast)
                + movie2.getInvestment(movie2Cast)
                + movie3.getInvestment(movie3Cast)));
        System.out.println("The total investment for books is: "
                + (book1.getInvestment(book1Author)
                + book2.getInvestment(book2Author)
                + book3.getInvestment(book3Author)));

        System.out.println("\n" + "Book1 ID: " + IdGenerator.generate(book1));
        System.out.println("Book2 ID: " + IdGenerator.generate(book2));
        System.out.println("Book3 ID: " + IdGenerator.generate(book3));
        System.out.println("\n" + "Game1 ID: " + IdGenerator.generate(game1));
        System.out.println("Game2 ID: " + IdGenerator.generate(game2));
        System.out.println("Game3 ID: " + IdGenerator.generate(game3));
        System.out.println("\n" + "Movie1 ID: " + IdGenerator.generate(movie1));
        System.out.println("Movie2 ID: " + IdGenerator.generate(movie2));
        System.out.println("Movie3 ID: " + IdGenerator.generate(movie3));
    }

    public static int totalIncome (List<Buyable> products) {
        int totalIncome = 0;
        for(Buyable p : products) {totalIncome += p.getPrice();}
        return totalIncome; }
}