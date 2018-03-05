package com.elsoproject.controller;

import com.elsoproject.domain.Story;
import com.elsoproject.repository.BloggerRepository;
import com.elsoproject.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

	private StoryService storyService;
	private BloggerRepository bloggerRep;
	private String htmlHeaderText = "House-Keeping";
	
	@Autowired
	public void setStoryService(StoryService storyService) {
		this.storyService = storyService;
	}

	@RequestMapping("/")
	public String stories(Model model, Locale locale) {
		model.addAttribute("pageTitle", htmlHeaderText);
		model.addAttribute("stories2", storyService.getStories());
		System.out.println(String.format("Request received. Language: %s, Country: %s %n", locale.getLanguage(),
				locale.getDisplayCountry()));
		return "stories2";
	}
	
	@RequestMapping("/story")
	public String story(Model model) {
		model.addAttribute("pageTitle", htmlHeaderText);
		model.addAttribute("story", storyService.getStory());
		return "story";
	}

	@GetMapping(value ="/addHouse")
	public String addHouse(Model model) {
		model.addAttribute("pageTitle", htmlHeaderText);
		model.addAttribute("newStory", new Story());
		return "addHouse";
	}

    @PostMapping(value ="/addHouse")
    public String addHouse(@ModelAttribute("newStory") Story newStory){
		System.out.println("Save{" +newStory+'}');
		storyService.createStoryByStory(newStory);
        return "stories2";
    }

	@RequestMapping("/title/{title}")
	public String searchForUser(@PathVariable(value = "title") String title, Model model) throws Exception {
		if (title == null)
			throw new Exception("Nincs ilyen címmel sztorink!");
		model.addAttribute("story", storyService.getSpecificStory(title));
		return "story";
	}

	@ExceptionHandler(Exception.class)
	public String exceptionHandler(HttpServletRequest rA, Exception ex, Model model) {
		model.addAttribute("errMessage", ex.getMessage());
		return "exceptionHandler";
	}




}
