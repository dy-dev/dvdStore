package com.arcreane.entity;

import lombok.*;

@Data
@AllArgsConstructor
public class Movie {
    protected String name;
    protected Category category;
    protected Integer nbStocks;
}
