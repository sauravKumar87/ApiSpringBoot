package com.saurav.SauravApi.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurav.SauravApi.Post.Post;
import com.saurav.SauravApi.Repository.PostRepository;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post post) {
        // Logic to handle the received post object
        // You can save it to a database using a repository or perform any other operation
        postRepository.save(post);

        return post;
    }
}
