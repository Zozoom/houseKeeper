package com.elsoproject.service;

import com.elsoproject.domain.Blogger;
import com.elsoproject.domain.Story;
import com.elsoproject.repository.BloggerRepository;
import com.elsoproject.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StoryService {
	
	private StoryRepository storyRepo;
	private BloggerRepository bloggerRepo;

	@Autowired
	public void setStoryRepo(StoryRepository storyRepo) {
		this.storyRepo = storyRepo;
	}
	
	@Autowired
	public void setBloggerRepo(BloggerRepository bloggerRepo) {
		this.bloggerRepo = bloggerRepo;
	}

	public List<Story> getStories() {
		return storyRepo.findAll();
	}
	
	public Story getStory(){
		return storyRepo.findFirstByOrderByPostedDesc();
	}

	public Story findStoryByTitle(String title) {
		return storyRepo.findByTitle(title);
	}

    public Story findStoryById(Integer id) {
        return storyRepo.findById(id);
    }

	public Story createStoryByStory(Story st){
		Blogger blogger = bloggerRepo.findBloggerByName("Anyonymus");
		st.setPosted(new Date());
		st.setBlogger(blogger);
		System.out.println("Persistance: {" +st+'}');
		storyRepo.save(st);
		return st;
	}

	public Story updateStoryByStory(Story st){
		Blogger blogger = bloggerRepo.findBloggerByName("Anyonymus");
		st.setPosted(new Date());
		st.setBlogger(blogger);
		System.out.println("Persistance: {" +st+'}');
		storyRepo.save(st);
		return st;
	}

	public void deleteStoryByIdAndTitle(Integer id, String title){

	    try{
            if(id != null && !title.isEmpty()){
                System.out.println("Delete in Service => {" +id+" / "+title+'}');
            }
            else if(id != null){
                System.out.println("Delete in Service => {" +id+'}');
                storyRepo.deleteStoryById(id);
            }
            else if(!title.isEmpty()){
                System.out.println("Delete in Service => {"+title+'}');
            }
            else{
                System.out.println("Both are empty!");
            }
        }
        catch (Exception ex){
            System.out.println(" getMessage: "+ex.getMessage()
                    +" \n getLocalizedMessage: "+ex.getLocalizedMessage()
                    +" \n getCause: "+ex.getCause()
                    +" \n getStackTrace: "+ex.getStackTrace().toString()
                    +" \n getSuppressed: "+ex.getSuppressed().toString()
                    +" \n getClass: "+ex.getClass()
            );
        }
	}

}
