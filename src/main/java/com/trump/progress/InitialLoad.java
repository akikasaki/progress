package com.trump.progress;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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

        ///// ADD USERS TO THE DATABASE /////////////

        ProgressUser user1 = new ProgressUser("user1","pass1","alektramp@gmail.com");
        ProgressUser user2 = new ProgressUser("user2","pass2","djoltramp@gmail.com");
        ProgressUser user3 = new ProgressUser("user3","pass3","dudatramp@gmail.com");
        repositoryStorage.getProgressUserRepository().save(user1);
        repositoryStorage.getProgressUserRepository().save(user2);
        repositoryStorage.getProgressUserRepository().save(user3);

        ///////// ADD PROGRESS BARS TO USERS IN THE DATABASE ///////////////////

        ProgressBar progressBar1 = new ProgressBar("first progress bar user 1","Title1",100,10,LocalDate.now(),LocalDate.now().plusDays(10),user1);
        ProgressBar progressBar2 = new ProgressBar("second progress bar user 1","Title2",50,27,LocalDate.now(),LocalDate.now().plusDays(15),user1);
        ProgressBar progressBar3 = new ProgressBar("third progress bar user 1","Title3",75,17,LocalDate.now(),LocalDate.now().plusDays(5),user1);
        ProgressBar progressBar4 = new ProgressBar("first progress bar user 2","Title1",40,10,LocalDate.now(),LocalDate.now().plusDays(10),user2);
        ProgressBar progressBar5 = new ProgressBar("second progress bar user 2","Title2",250,27,LocalDate.now(),LocalDate.now().plusDays(15),user2);
        ProgressBar progressBar6 = new ProgressBar("third progress bar user 2","Title3",365,220,LocalDate.now(),LocalDate.now().plusDays(5),user2);
        repositoryStorage.getProgressBarRepository().save(progressBar1);
        repositoryStorage.getProgressBarRepository().save(progressBar2);
        repositoryStorage.getProgressBarRepository().save(progressBar3);
        repositoryStorage.getProgressBarRepository().save(progressBar4);
        repositoryStorage.getProgressBarRepository().save(progressBar5);
        repositoryStorage.getProgressBarRepository().save(progressBar6);

    }
}
