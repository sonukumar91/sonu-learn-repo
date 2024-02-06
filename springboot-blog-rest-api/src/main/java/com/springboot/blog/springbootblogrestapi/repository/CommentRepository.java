package com.springboot.blog.springbootblogrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.blog.springbootblogrestapi.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Long> {

	List<Comments> findByPostId(long postId);
}
