package com.nikkhat.rating.ratingservice.repository;

import com.nikkhat.rating.ratingservice.entity.Ratings;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Ratings,String> {

    //custom find methods

    List<Ratings> findByUserId(String userId);
    List<Ratings> findByHotelId(String hotelId);

}
