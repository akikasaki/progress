package com.trump.progress;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class RepositoryStorage {

    private ProgressUserRepository progressUserRepository;
    private ProgressBarRepository progressBarRepository;

    public RepositoryStorage(ProgressUserRepository progressUserRepository, ProgressBarRepository progressBarRepository) {
        this.progressUserRepository = progressUserRepository;
        this.progressBarRepository = progressBarRepository;
    }

    public ProgressUserRepository getProgressUserRepository() {
        return progressUserRepository;
    }

    public ProgressBarRepository getProgressBarRepository() {
        return progressBarRepository;
    }
}
