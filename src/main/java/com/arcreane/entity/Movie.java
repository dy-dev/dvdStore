package com.arcreane.entity;

import lombok.*;

@Data
@AllArgsConstructor
public class Movie {
    protected String id;
    protected String name;
    protected Category category;
    protected Integer nbStocks;

    public Movie(String p_sName, Category p_Category) {
        name = p_sName;
        category = p_Category;
        nbStocks = 5;
    }

    @Override
    public String toString() {
        return id + ';' + name + ';'+ category +';' + nbStocks+'\n';
    }
}
