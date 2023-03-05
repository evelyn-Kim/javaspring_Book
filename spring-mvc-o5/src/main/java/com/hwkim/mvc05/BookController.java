package com.hwkim.mvc05;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hwkim.mvc05.vo.BookVo;


@Controller
public class BookController {

	@Autowired
	private SqlSession session;
	
	@RequestMapping("/book_insert_form")
	public String book_insert_form() {
		
		return "book/book_insert_form";
	}
	
	@RequestMapping("/book_insert_action")
	public String book_insert_action(
			Model model,
			BookVo vo
			) {
		System.out.println("회원정보 수집 : "+vo);
		session.insert("BookMapper.insert", vo);
		
		return "book/book_insert_action";
	}
	
	@RequestMapping("/book_list")
	public String member_list(
			Model model
			) {
		//오라클에서 회원목록 가져오기
		List<BookVo> bookList = session.selectList("BookMapper.selectAll");
		model.addAttribute("bookList",bookList);
		
		return "book/book_list";
	}
	
	@RequestMapping("/book_detail")
	public String book_detail(
			Model model,
			@RequestParam String title
			) {
		BookVo vo = session.selectOne("BookMapper.selectOne", title);
		model.addAttribute("vo",vo);
		
		return "book/book_detail";
	}
	
	@RequestMapping("/book_update_form")
	public String book_update_form(
			Model model,
			@RequestParam String title
			) {
		BookVo vo = session.selectOne("BookMapper.selectOne", title);
		model.addAttribute("vo",vo);
		
		return "book/book_update_form";
	}
	
	@RequestMapping("/book_update_action")
	public String book_update_action(
			Model model,
			BookVo vo
			) {
		System.out.println("회원정보 수집 : "+vo);
		session.insert("BookMapper.update", vo);
		
		return "book/book_update_action";
	}
	
	
	@RequestMapping("/book_delete_action")
	public String book_delete_action(
			Model model,
			@RequestParam String title
			) {
		BookVo vo = session.selectOne("BookMapper.selectOne", title);
		session.delete("BookMapper.delete", title);
		
		return "book/book_delete_action";
	}
}
