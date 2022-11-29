package com.nikkhat.rating.ratingservice.service;

import com.nikkhat.rating.ratingservice.entity.Ratings;

import java.util.List;

public interface RatingService {


    // create new Ratings
    Ratings createRating (Ratings ratings);

    // get all ratings
    List<Ratings> ratingList();

    //getAll by userId
    List<Ratings> getRatingByUserId (String userId);

    //getAll by hotelId

    List<Ratings> getRatingsByHotelId(String hotelId);






}
