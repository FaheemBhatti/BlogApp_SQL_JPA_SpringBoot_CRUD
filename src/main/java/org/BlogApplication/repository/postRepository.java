package org.BlogApplication.repository;

import org.BlogApplication.entity.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postRepository extends CrudRepository<Posts, Integer> 
{

}
