package com.Micromovies.recommendation.entities;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.Micromovies.recommendation.models.Film;
import com.Micromovies.recommendation.models.Serie;

import java.util.List;

@Document
public class Recommandation {
    @Id
    String id;
    String userId;
    List<Film> films;
    List<Serie> series;

}
