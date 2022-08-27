package com.codekru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codekru.dao.TitleDAO;
import com.codekru.model.Title;

@Controller
public class TitleController {

	@Autowired
	TitleDAO titleDAO;
	
	@RequestMapping("saveTitle")
	@ResponseBody
	public String saveTitle() {
		Title title = new Title();
		title.setTitleName("Connecting mysql with spring");
		title.setDescription("This will tell you how to connect with databases in a spring project");
		titleDAO.add(title);
		return "Title name which is saved is "+ title.getTitleName();
	}
	
}
