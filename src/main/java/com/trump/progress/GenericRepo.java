package com.trump.progress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepo<T> extends JpaRepository<T,Long> {

    default void defaultMethod(){
        System.out.println("test for default method");
    }

}
