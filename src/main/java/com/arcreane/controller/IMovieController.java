package com.arcreane.controller;

import com.arcreane.service.IMovieService;

public interface IMovieController {
    void setService(IMovieService service);
    public void AddMovie();
}
