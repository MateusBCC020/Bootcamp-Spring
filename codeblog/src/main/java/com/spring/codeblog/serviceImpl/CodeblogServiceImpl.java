package com.spring.codeblog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService{
	
	@Autowired
	CodeblogRepository codeblogReposytory;

	@Override
	public List<Post> findAll() {
		
		return codeblogReposytory.findAll();
	}

	@Override
	public Post findById(long id) {
		return codeblogReposytory.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogReposytory.save(post);
	}

}
