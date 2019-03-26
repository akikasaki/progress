package com.trump.progress;

import com.sun.javaws.progress.Progress;
import com.trump.progress.exception.ProgressBarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ProgressBarResource {

   private final
   RepositoryStorage repositoryStorage;

    public ProgressBarResource(RepositoryStorage repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
    }

    @GetMapping("/progressBars/{orderedBy}")
    public List<ProgressBar> getAllExpiredProgressBarsSorted(@PathVariable String orderedBy){


        return null;

    }

    /**
     * The returned progress bars can be set up so that depending on the filter parameter, the results are different
     * @param filter Active - active PB-s , Inactive - Inactive PB-s
     * @return list of all progress bars based on the filter
     */
    @GetMapping("/progressBars/{filter}")
    public List<ProgressBar> getAllProgressBarsByFilter(@PathVariable String filter){

        switch(filter){

            case "Active":
                return repositoryStorage.getProgressBarRepository().findAllByIsActiveIsTrue();
            case "Inactive":
                return repositoryStorage.getProgressBarRepository().findAllByIsActiveIsFalse();
            default:

        }

       throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found",new ProgressBarNotFoundException());
    }

    @GetMapping("/progressBars")
    public List<ProgressBar> getAllProgressBars(){
        return repositoryStorage.getProgressBarRepository().findAll();
    }

}
