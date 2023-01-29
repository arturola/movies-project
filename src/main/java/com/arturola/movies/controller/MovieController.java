package com.arturola.movies.controller;

import com.arturola.movies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<String> getAllMovies() {
        var movies = movieService.getAllMovies();

        return new ResponseEntity<>(movies.toString(), HttpStatus.OK);
    }
}
