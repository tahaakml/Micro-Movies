package com.abdo.recommandationms.Controller;

import com.abdo.recommandationms.models.Film;
import com.abdo.recommandationms.services.RecommandationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecommandationController {

   private final  RecommandationService recommandationService;

    public RecommandationController(RecommandationService recommandationService) {
        this.recommandationService = recommandationService;
    }

    @GetMapping("/test/{id}")
    public List<Film> test(@PathVariable("id") String id){
    return recommandationService.getFilmsByGenre(id);

}
}
