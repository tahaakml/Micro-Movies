package com.abdo.recommandationms.services;

import com.abdo.recommandationms.models.Film;
import com.abdo.recommandationms.models.User;
import com.abdo.recommandationms.openfeign.MoviesRestClient;
import com.abdo.recommandationms.openfeign.UserRestClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommandationService {

    private final UserRestClient userRestClient;
    private final MoviesRestClient moviesRestClient;

    public RecommandationService(UserRestClient userRestClient, MoviesRestClient moviesRestClient) {
        this.userRestClient = userRestClient;
        this.moviesRestClient = moviesRestClient;
    }

    public List<Film> addRecommandation(){


   return moviesRestClient.getFilms();
    }

    public User getUser(String userId){
        return userRestClient.getUser(userId);
    }
    public List<Film> getFilmsByGenre(String userId){
        String keyword=this.getUserPreferences(userId);
        if(keyword!=null) {
            return moviesRestClient.getFilmsByGenre(keyword);
        }
        else{
            return moviesRestClient.getFilmsByGenre("");
        }
    }
    public String getUserPreferences(String userId){
        User user=this.getUser(userId);
        return user.getPreferences();
    }
}
