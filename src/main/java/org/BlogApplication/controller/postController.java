package org.BlogApplication.controller;

import java.util.List;
import java.util.Optional;

import org.BlogApplication.entity.Posts;
import org.BlogApplication.services.postServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class postController 
{
	@Autowired
	private postServices service;
	
	@RequestMapping(value = "/posts", 
			method = RequestMethod.GET )
	public List<Posts> getPosts()
	{
		return service.getPosts();
	}
	
	@RequestMapping(value = "/posts/{id}", 
			method = RequestMethod.GET)
	public Optional<Posts> getPost(@PathVariable int id)
	{
		return service.getPost(id);
	}
	
	@RequestMapping(value = "/posts" , 
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPost(@RequestBody Posts post)
	{
		service.addPost(post);
	}
	
	@RequestMapping(value = "/posts" , 
			method = RequestMethod.PUT ,  
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePost(@RequestBody Posts post )
	{
		service.updatePost(post);
	}
	
	@RequestMapping(value = "/posts/{id}" ,
			method = RequestMethod.DELETE)
	public void deletePost(@PathVariable int id)
	{
		service.deletePost(id);
	}
	
	

}
