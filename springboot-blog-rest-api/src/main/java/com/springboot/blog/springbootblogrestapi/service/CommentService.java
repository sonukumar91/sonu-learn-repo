package com.springboot.blog.springbootblogrestapi.service;

import java.util.List;

import com.springboot.blog.springbootblogrestapi.payload.CommentDto;

public interface CommentService {

	CommentDto createComment(long postId, CommentDto commentDto);

	List<CommentDto> getCommentsByPostId(long postId);

	CommentDto getCommentsById(long postId, long commentId);

	CommentDto updateComment(Long postId, long commentId, CommentDto commentDto);

	void deleteComment(long postId, long commentId);
}
