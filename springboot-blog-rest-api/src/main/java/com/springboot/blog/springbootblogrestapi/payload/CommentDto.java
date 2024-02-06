package com.springboot.blog.springbootblogrestapi.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommentDto {

	private long id;
	private String name;
	private String email;
	private String body;

}
