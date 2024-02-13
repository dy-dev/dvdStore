package com.arcreane.dvdstore.core.controller;

import com.arcreane.dvdstore.core.service.IMovieService;

public interface IMovieController {
    void setService(IMovieService service);
    public void AddMovie();
}
