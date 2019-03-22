package com.trump.progress;


import com.trump.progress.exception.ProgressUserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
public class ProgressUserResource {

    private final
    RepositoryStorage repositoryStorage;

    @Autowired
    public ProgressUserResource(RepositoryStorage repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
    }

    @CrossOrigin
    @GetMapping("/users")
    public List<ProgressUser> getAllProgressUsers(){
        return repositoryStorage.getProgressUserRepository().findAll();
    }

    @CrossOrigin
    @GetMapping("/users/{username},{password},{email}")
    public ProgressUser getUser(@PathVariable String username , @PathVariable String password, @PathVariable String email){


            ProgressUser user = repositoryStorage.getProgressUserRepository().findProgressUserByEmail(email);

            if(user == null)
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found", new ProgressUserNotFoundException("email"));

            if(!user.getUsername().equals(username))
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found", new ProgressUserNotFoundException("Username", "Are you sure this is the right username?"));

            if(!user.getPassword().equals(password))
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found", new ProgressUserNotFoundException("Password","Are you sure this is the right password?"));

            return user;
        }




        //return user;
    }


