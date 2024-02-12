package com.arcreane.controller;

import com.arcreane.service.IMovieService;
import lombok.Data;
@Data
public class WebMovieController implements IMovieController {
    protected IMovieService service;

    @Override
    public void AddMovie() {
        System.out.println("Je fais rien");
    }
}
