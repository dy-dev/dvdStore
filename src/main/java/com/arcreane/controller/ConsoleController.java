package com.arcreane.controller;

import com.arcreane.entity.Category;
import com.arcreane.entity.Movie;
import com.arcreane.service.MovieService;

import java.util.Scanner;

public class ConsoleController {

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
        MovieService service = new MovieService();
        service.registerMovie(movie);
    }
}
