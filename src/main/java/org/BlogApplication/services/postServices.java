package org.BlogApplication.services;

import java.util.List;
import java.util.Optional;
import org.BlogApplication.entity.Posts;
import org.BlogApplication.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class postServices 
{
	@Autowired
	private postRepository repo;
	
	public List<Posts> getPosts() 
	{
		return (List<Posts>) repo.findAll();
	}

	public Optional<Posts> getPost(int id) 
	{
		return repo.findById(id);
	}

	public void addPost(Posts post) 
	{
		repo.save(post);
	}

	public void updatePost(Posts post) 
	{
		repo.save(post);	
	}

	public void deletePost(int id) 
	{
		repo.deleteById(id);
	}
}
