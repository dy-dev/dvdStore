package com.arcreane.controller.console;

import com.arcreane.controller.IMovieController;
import com.arcreane.entity.Category;
import com.arcreane.entity.Movie;
import com.arcreane.service.IMovieService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Data
@Controller
public class ConsoleMovieController implements IMovieController {
    @Autowired
    protected IMovieService service;

    public void AddMovie(){
        System.out.println("Give movie name");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println("Movie category, select between");
        int index = 0;
        for(var cat : Category.values() ){
            System.out.println("("+(index++)+")" + cat);
        }
        Integer catI = sc.nextInt();
        Category catE =  Category.values()[catI];
        Movie movie = new Movie(title,catE);

        service.registerMovie(movie);
    }
}