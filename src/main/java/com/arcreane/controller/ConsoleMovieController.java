package com.arcreane.controller;

import com.arcreane.entity.Category;
import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;
import com.arcreane.repository.ConsoleMovieRepository;
import com.arcreane.repository.PersistantMovieRepository;
import com.arcreane.service.IMovieService;
import com.arcreane.service.ConsoleMovieService;
import com.arcreane.service.WebMovieService;
import lombok.Data;

import java.util.Scanner;

@Data
public class ConsoleMovieController implements IMovieController{
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

        System.out.println("Which service do you want (1 for Console, 2 for web)");
        Integer serviceType = sc.nextInt();

        switch (serviceType){
            case 1 -> service = new ConsoleMovieService();
            case 2 -> service = new WebMovieService();
        }
        System.out.println("Which repository do you want (1 for memory, 2 for persistant");
        Integer repoType = sc.nextInt();
        IMovieRepository repo = null;
        switch (repoType){
            case 1 -> repo = new ConsoleMovieRepository();
            case 2 -> repo = new PersistantMovieRepository();
        }
        service.setRepository(repo);
        service.registerMovie(movie);
    }
}
