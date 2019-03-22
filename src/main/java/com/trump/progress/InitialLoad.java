package com.trump.progress;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
/**
 * Loads certain data and executes some queries at the start of the program.
 */
public class InitialLoad implements CommandLineRunner {

    private RepositoryStorage repositoryStorage;

    public InitialLoad(RepositoryStorage repositoryStorage){
        this.repositoryStorage = repositoryStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        ProgressUser user1 = new ProgressUser("user1","pass1","alektramp@gmail.com");
        ProgressUser user2 = new ProgressUser("user2","pass2","djoltramp@gmail.com");
        ProgressUser user3 = new ProgressUser("user3","pass3","dudatramp@gmail.com");
        repositoryStorage.getProgressUserRepository().save(user1);
        repositoryStorage.getProgressUserRepository().save(user2);
        repositoryStorage.getProgressUserRepository().save(user3);
    }
}
