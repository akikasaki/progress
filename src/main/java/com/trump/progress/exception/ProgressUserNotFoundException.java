package com.trump.progress.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProgressUserNotFoundException extends Exception{

    /**
     * Thrown when a parameter for finding a user was not found. Returns the name of the parameter that was not found and a optional message
     * @param parameterNotFoundName The name of the parameter that was not found
     * @param message Optional message to be displayed next to the name of the parameter
     */
    public ProgressUserNotFoundException(String parameterNotFoundName, String message) {
        super("\nUser with that " + parameterNotFoundName + " was not found.\n" + message);
    }

    public ProgressUserNotFoundException(String parameterNotFoundName) {
        super("\nUser with that " + parameterNotFoundName + " was not found.\n");
    }
}
