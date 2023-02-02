package com.github.practikaspring.repository;

import com.github.practikaspring.model.HelloModel;
import com.github.practikaspring.response.HelloResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<HelloModel,Long> {

}
