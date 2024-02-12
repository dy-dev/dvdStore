package com.arcreane.controller.web;

import com.arcreane.controller.IMovieController;
import com.arcreane.service.IMovieService;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
//@Controller
public class WebMovieController implements IMovieController {
    protected IMovieService service;

    @Override
    public void AddMovie() {
        System.out.println("Je fais rien");
    }
}
