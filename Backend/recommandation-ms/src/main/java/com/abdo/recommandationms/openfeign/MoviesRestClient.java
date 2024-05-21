package com.abdo.recommandationms.openfeign;

import com.abdo.recommandationms.models.Film;
import com.abdo.recommandationms.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name= "MOVIES-MS")
public interface MoviesRestClient {
    @GetMapping("/api/films")
    List<Film> getFilms();
    @GetMapping("/api/films/search")
    List<Film> getFilmsByGenre(@RequestParam("keyword" ) String keyword);


}
