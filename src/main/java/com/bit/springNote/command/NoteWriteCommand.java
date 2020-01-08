package com.bit.springNote.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.bit.springNote.dao.NoteDao;

public class NoteWriteCommand implements NoteCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		NoteDao dao = new NoteDao();
		dao.write(writer, content);
		
	}

}
