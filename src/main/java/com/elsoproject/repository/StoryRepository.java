package com.elsoproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.elsoproject.domain.Story;
import org.springframework.transaction.annotation.Transactional;

public interface StoryRepository extends CrudRepository<Story, Integer> {

	//SELECT * FROM STORY
	List<Story> findAll();
	
	//SELECT * FROM STORY WHERE posted IN (SELECT max(posted) FROM story) LIMIT 1;
	Story findFirstByOrderByPostedDesc();

	Story findByTitle(String title);

	Story findById(Integer storyId);

	@Transactional
	Story deleteStoryById(Integer storyId);

	@Transactional
	Story deleteStoryByTitle(String storyTitle);

	@Transactional
	Story deleteStoryByIdAndTitle(Integer storyId, String storyTitle);
}
