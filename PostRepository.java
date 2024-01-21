package com.saurav.SauravApi.Repository;


import org.springframework.data.repository.CrudRepository;

import com.saurav.SauravApi.Post.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
    // You can add custom queries or methods here if needed
}

