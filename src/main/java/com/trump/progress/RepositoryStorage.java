package com.trump.progress;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class RepositoryStorage {

    private ProgressUserRepository progressUserRepository;

    public RepositoryStorage(ProgressUserRepository progressUserRepository) {
        this.progressUserRepository = progressUserRepository;
    }

    public ProgressUserRepository getProgressUserRepository() {
        return progressUserRepository;
    }
}
