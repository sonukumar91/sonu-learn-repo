package com.springboot.blog.springbootblogrestapi.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogAPIException extends RuntimeException {

	private HttpStatus status;
	private String message;

}
