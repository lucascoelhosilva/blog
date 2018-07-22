package com.example.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.blog.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
