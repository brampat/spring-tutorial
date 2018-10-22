package com.spring.boot.demo.repositories

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Unroll

@ContextConfiguration
@SpringBootTest
class MovieRepositorySpec extends Specification {

    @Autowired
    MovieRepository movieRepository

    @Unroll
    def "findByNameContaining_should find #expected movies when searching for '#query'"() {
        given:
        movieRepository

        when:
        def result = movieRepository.findByNameContaining(query)

        then:
        result.size() == expected

        where:
        query       ||  expected
        "Iron Man"  ||  3
        "Hulk"      ||  1
        "Thor"      ||  3
        "Avengers"  ||  3
        "Thanos"    ||  0
        ""          ||  20
    }
     
}
