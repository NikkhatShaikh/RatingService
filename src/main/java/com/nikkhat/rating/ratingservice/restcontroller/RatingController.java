package com.nikkhat.rating.ratingservice.restcontroller;

import com.nikkhat.rating.ratingservice.entity.Ratings;
import com.nikkhat.rating.ratingservice.repository.RatingRepository;
import com.nikkhat.rating.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RatingController {

    @Autowired
   private RatingService ratingService;


    @PostMapping("/createRatings")
   public ResponseEntity<Ratings> createRatings(@RequestBody Ratings ratings){
      return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(ratings));
    }


    @GetMapping("getAllRatings")
    public ResponseEntity<List<Ratings>> listRatings(){
        return ResponseEntity.ok(ratingService.ratingList());

    }


    @GetMapping("/getAllRatingsbyUserId/{userId}")
    public ResponseEntity<List<Ratings>> ratingListByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/getAllRatingsByHotelId/{hotelId}")
    public ResponseEntity<List<Ratings>> ratingsByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
    }
}
