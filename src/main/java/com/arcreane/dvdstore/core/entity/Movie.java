package com.arcreane.dvdstore.core.entity;

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

    public Movie(String p_dvdAsString) {
        var infos = p_dvdAsString.split(";");
        id = infos[0];
        name = infos[1];
        category = Category.valueOf(infos[2]);
        nbStocks = Integer.valueOf(infos[3]);
    }

    @Override
    public String toString() {
        return id + ';' + name + ';'+ category +';' + nbStocks+'\n';
    }
}
