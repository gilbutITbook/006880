package com.devchronicles.dataaccessobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Float price;

    public Movie() {
    }
    // 게터/세터 메서드 생략
}