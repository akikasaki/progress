package com.trump.progress;

public interface ProgressUserRepository extends GenericRepo<ProgressUser> {

    ProgressUser findProgressUserByEmail(String email);
    ProgressUser findProgressUserByUsername(String username);
    ProgressUser findProgressUserByPassword(String password);

}
