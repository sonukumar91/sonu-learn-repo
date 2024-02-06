package com.springboot.blog.springbootblogrestapi.payload;

import java.util.Set;

import com.springboot.blog.springbootblogrestapi.entity.Comments;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {

	private long id;

	@NotEmpty
	@Size(min = 2, message = "Post Title should at least 2 character")
	private String title;

	@NotEmpty
	@Size(min = 10, message = "post Description should be at least 10 charcters")
	private String description;

	@NotEmpty
	private String content;
	private Set<Comments> comments;

}
