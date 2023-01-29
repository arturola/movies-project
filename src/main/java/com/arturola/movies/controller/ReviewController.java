package com.arturola.movies.controller;

import com.arturola.movies.model.Review;
import com.arturola.movies.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "api/v2/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
       return new ResponseEntity<>(reviewService.createReview(payload.get("reviewBody"),
               payload.get("imdbId")),
               HttpStatus.CREATED
       );
    }
}
