package com.trump.progress.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProgressBarNotFoundException extends Exception {


    public ProgressBarNotFoundException(){
        super("No progress bar was found!");
    }

}
