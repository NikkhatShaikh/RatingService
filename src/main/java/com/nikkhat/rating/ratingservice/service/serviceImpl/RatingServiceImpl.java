package com.nikkhat.rating.ratingservice.service.serviceImpl;

import com.nikkhat.rating.ratingservice.entity.Ratings;
import com.nikkhat.rating.ratingservice.repository.RatingRepository;
import com.nikkhat.rating.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository ratingRepository;
    @Override
    public Ratings createRating(Ratings ratings) {
        return this.ratingRepository.save(ratings);
    }

    @Override
    public List<Ratings> ratingList() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Ratings> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Ratings> getRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

}
