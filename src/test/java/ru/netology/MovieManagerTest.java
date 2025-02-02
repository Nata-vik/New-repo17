package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void notAddFilm() {
        MovieManager manager = new MovieManager();


        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void addNewFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void returnFilms() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперёд", "Отель Белград"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void returnFilmLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");

        String[] actual = manager.findLast();
        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void returnFilmUnderLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");

        String[] actual = manager.findLast();
        String[] expected = {"Вперёд", "Бладшот"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void returnFilmMoreLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");


        String[] actual = manager.findLast();
        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд"};

        Assertions.assertArrayEquals(actual, expected);
    }


}
