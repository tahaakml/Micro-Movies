package com.abdo.recommandationms.Entities;

import com.abdo.recommandationms.models.Film;
import com.abdo.recommandationms.models.Serie;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Recommandation {
    @Id
    String id;
    String userId;
    List<Film> films;
    List<Serie> series;

}
