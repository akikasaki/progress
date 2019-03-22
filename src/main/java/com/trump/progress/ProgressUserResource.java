package com.trump.progress;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgressUserResource {

    private final
    RepositoryStorage repositoryStorage;

    @Autowired
    public ProgressUserResource(RepositoryStorage repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
    }

    @GetMapping("/users")
    public List<ProgressUser> getAllProgressUsers(){
        return repositoryStorage.getProgressUserRepository().findAll();
    }

    public ProgressUser getUser(@RequestParam String username , @RequestParam String password, @RequestParam String email){
        ProgressUser user = null;


        return user;
    }

}
