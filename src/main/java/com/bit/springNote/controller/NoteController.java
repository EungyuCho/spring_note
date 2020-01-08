package com.bit.springNote.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.springNote.command.NoteCommand;
import com.bit.springNote.command.NoteWriteCommand;

@Controller
public class NoteController {
	
	NoteCommand command;
	
	@RequestMapping(value= "/noteform")
	public String noteForm() {
		return "noteForm"; //view/noteForm.jsp호출
	}
	

	@RequestMapping(value= "write")
	public String write(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new NoteWriteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	
}
