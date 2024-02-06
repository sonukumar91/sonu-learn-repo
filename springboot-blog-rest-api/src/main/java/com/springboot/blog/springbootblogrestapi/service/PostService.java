package com.springboot.blog.springbootblogrestapi.service;

import java.util.List;

import com.springboot.blog.springbootblogrestapi.payload.PostDto;
import com.springboot.blog.springbootblogrestapi.payload.PostResponse;

public interface PostService {

	PostDto createPost(PostDto postDto);

	List<PostDto> getAllPosts();

	PostDto getPostById(long id);

	PostDto updatePost(PostDto postDto, long id);

	void deletePost(long id);

	List<PostDto> getAllPostsWithPagination(int pageNo, int PageSize);

	PostResponse getAllPostsWithPaginationALongPageData(int pageNo, int PageSize);

	PostResponse getAllPostsWithSorting(int pageNo, int PageSize, String sortBy, String sortDir);

}
