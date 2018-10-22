package com.spring.boot.demo.bootstrap;

import com.spring.boot.demo.model.Movie;
import com.spring.boot.demo.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class Bootstrap {

    @Autowired
    MovieRepository movieRepository;

    public void prefillDatabase() {
        movieRepository.saveAll(Arrays.asList(
                new Movie("Iron Man", LocalDate.of(2008, 5, 2), "https://www.imdb.com/title/tt0371746/"),
                new Movie("The Incredible Hulk", LocalDate.of(2008, 6, 13), "https://www.imdb.com/title/tt0800080/"),
                new Movie("Iron Man 2", LocalDate.of(2010, 5, 7), "https://www.imdb.com/title/tt1228705/"),
                new Movie("Thor", LocalDate.of(2011, 5, 6), "https://www.imdb.com/title/tt0800369/"),
                new Movie("Captain America: The first Avenger", LocalDate.of(2011, 7, 22), "https://www.imdb.com/title/tt0458339/"),
                new Movie("The Avengers", LocalDate.of(2012, 5, 4), "https://www.imdb.com/title/tt0848228/"),
                new Movie("Iron Man 3", LocalDate.of(2013, 5, 3), "https://www.imdb.com/title/tt1300854/"),
                new Movie("Thor: The Dark world", LocalDate.of(2013, 11, 8), "https://www.imdb.com/title/tt1981115/"),
                new Movie("Captain America: The Winter soldier", LocalDate.of(2014, 4, 4), "https://www.imdb.com/title/tt1843866/"),
                new Movie("Guardians of the Galaxy", LocalDate.of(2014, 8, 1), "https://www.imdb.com/title//"),
                new Movie("Avengers: Age of Ultron", LocalDate.of(2015, 5, 1), "https://www.imdb.com/title/tt2395427/"),
                new Movie("Ant-Man", LocalDate.of(2015, 7, 17), "https://www.imdb.com/title/tt0478970/"),
                new Movie("Captain America: Civil War", LocalDate.of(2015, 5, 6), "https://www.imdb.com/title/tt3498820/"),
                new Movie("Doctor Strange", LocalDate.of(2016, 11, 4), "https://www.imdb.com/title/tt1211837/"),
                new Movie("Guardians of the Galaxy 2", LocalDate.of(2017, 5, 5), "https://www.imdb.com/title/tt3896198/"),
                new Movie("Spider-Man: Homecoming", LocalDate.of(2017, 7, 7), "https://www.imdb.com/title/tt2250912/"),
                new Movie("Thor: Ragnarok", LocalDate.of(2017, 11, 3), "https://www.imdb.com/title/tt3501632/"),
                new Movie("Black Panther", LocalDate.of(2018, 2, 16), "https://www.imdb.com/title/tt1825683/"),
                new Movie("Avengers: Infinity War", LocalDate.of(2018, 4, 27), "https://www.imdb.com/title/tt4154756/"),
                new Movie("Ant-Man and the Wasp", LocalDate.of(2018, 7, 6), "https://www.imdb.com/title/tt5095030/")
        ));
    }
}
