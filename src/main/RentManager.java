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

        Person alma = new Person("Al", "Ma", Gender.FEMALE, 100);
        Person korte = new Person("Kor", "Te", Gender.MALE, 200);
        Person szilva = new Person("Szil", "Va", Gender.FEMALE, 300);
        Person barack = new Person("Ba", "Rack", Gender.MALE, 400);
        Person szolo = new Person("Szo", "Lo", Gender.FEMALE, 500);
        Person meggy = new Person("Me", "Ggy", Gender.MALE, 600);

        List<Person> game1Staff = Arrays.asList(alma, korte, szilva, barack);
        List<Person> game2Staff = Arrays.asList(szilva, barack, szolo, meggy);
        List<Person> game3Staff = Arrays.asList(korte, szilva, barack, szolo);
        List<Person> movie1Cast = Arrays.asList(alma, szilva, szolo);
        List<Person> movie2Cast = Arrays.asList(korte, barack, meggy);
        List<Person> movie3Cast = Arrays.asList(barack, szolo, meggy);

        Product book1 = new Book(alma);
        Product book2 = new Book(korte);
        Product book3 = new Book(szilva);
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
    }

    public static int totalIncome (List<Buyable> products) {
        int totalIncome = 0;
        for(Buyable p : products) {totalIncome += p.getPrice();}
        return totalIncome; }
}