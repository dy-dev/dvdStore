package com.arcreane.repository;

import com.arcreane.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    protected  List<Movie> movieList = new ArrayList<>();
    public void AddMovie(Movie p_Movie){
        movieList.add(p_Movie);
        System.out.println("Movie " + p_Movie + " has been added ");
    }
}
