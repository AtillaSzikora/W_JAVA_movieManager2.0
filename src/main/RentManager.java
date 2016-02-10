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

        List<Person> game1Staff = Arrays.asList(jani, jozsi, jolan, jakab);
        List<Person> game2Staff = Arrays.asList(jolan, jakab, juci, julcsi);
        List<Person> game3Staff = Arrays.asList(jozsi, jolan, jakab, juci);
        List<Person> movie1Cast = Arrays.asList(jani, jolan, juci);
        List<Person> movie2Cast = Arrays.asList(jozsi, jakab, julcsi);
        List<Person> movie3Cast = Arrays.asList(jakab, juci, julcsi);

        Book book1 = new Book(jani);
        Book book2 = new Book(jozsi);
        Book book3 = new Book(jolan);
        Game game1 = new Game(true, game1Staff, 150);
        Game game2 = new Game(false, game2Staff, 250);
        Game game3 = new Game(true, game3Staff, 350);
        Movie movie1 = new Movie(Genre.ACTION, 110, 3, movie1Cast, 450);
        Movie movie2 = new Movie(Genre.DRAMA, 120, 4, movie2Cast, 550);
        Movie movie3 = new Movie(Genre.COMEDY, 100, 2, movie3Cast, 650);

        List<Buyable> someProducts = Arrays.asList(movie1, movie2, game2, game3);

        System.out.println("The total investment for games is: "
                + (game1.getInvestment()
                + game2.getInvestment()
                + game3.getInvestment()));
        System.out.println("The total investment for movies is: "
                + (movie1.getInvestment()
                + movie2.getInvestment()
                + movie3.getInvestment()));
        System.out.println("The total investment for books is: "
                + (book1.getInvestment()
                + book2.getInvestment()
                + book3.getInvestment()));
        System.out.println("The summarized income from someProducts is: " + sumIncome(someProducts));

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

    public static int sumIncome (List<Buyable> someProducts) {
        int totalIncome = 0;
        for(Buyable p : someProducts) {totalIncome += p.getPrice();}
        return totalIncome; }
}