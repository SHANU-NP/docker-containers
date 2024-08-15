package com.example.reasearchAndDevelopment.repository;

import com.example.reasearchAndDevelopment.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
}
