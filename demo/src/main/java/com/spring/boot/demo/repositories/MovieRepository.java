package com.spring.boot.demo.repositories;

import com.spring.boot.demo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByNameContaining(String name);
    List<Movie> findByRelease(LocalDate release);
    List<Movie> findByReleaseBetween(LocalDate start, LocalDate end);
    List<Movie> findByNameContainingAndRelease(String name, LocalDate release);
}
