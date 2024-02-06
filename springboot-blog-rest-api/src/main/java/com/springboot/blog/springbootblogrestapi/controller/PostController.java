package com.springboot.blog.springbootblogrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.blog.springbootblogrestapi.payload.PostDto;
import com.springboot.blog.springbootblogrestapi.service.PostService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/posts/v1")
public class PostController {

	@Autowired
	private PostService postService;

	// create blog post
	@PostMapping
	public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto) {
		return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
	}

	@GetMapping
	public List<PostDto> getAllPosts() {
		return postService.getAllPosts();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id) {
		return ResponseEntity.ok(postService.getPostById(id));
	}

	@PutMapping("/{id}")
	public ResponseEntity<PostDto> updatePostById(@Valid @RequestBody PostDto postDto,
			@PathVariable(name = "id") long id) {
		return new ResponseEntity<PostDto>(postService.updatePost(postDto, id), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePostById(@PathVariable(name = "id") long id) {

		postService.deletePost(id);
		return new ResponseEntity<String>("post Deleted Successfully", HttpStatus.OK);

	}

//	@GetMapping
//	public List<PostDto> getAllPostsWithPagination(
//			@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
//			@RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize) {
//		return postService.getAllPostsWithPagination(pageNo, pageSize);
//	}

//	@GetMapping
//	public PostResponse getAllPostsWithPaginationAlongPageData(
//			@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
//			@RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize) {
//		return postService.getAllPostsWithPaginationALongPageData(pageNo, pageSize);
//	}

	// http://localhost:8080/api/posts/v1?pageNo=0&PageSize=5&sortBy=title
//	@GetMapping
//	public PostResponse getAllPostsWithSorting(
//			@RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NO, required = false) int pageNo,
//			@RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
//			@RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
//			@RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir) {
//		return postService.getAllPostsWithSorting(pageNo, pageSize, sortBy, sortDir);
//	}
}
