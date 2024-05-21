package com.abdo.recommandationms.openfeign;

import com.abdo.recommandationms.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name= "USER-SERVICE")
public interface UserRestClient {
    @GetMapping("/users")
    List<User>  getUsers();
    @GetMapping("/users/{id}")
    User getUser(@PathVariable("id") String userId);
}
