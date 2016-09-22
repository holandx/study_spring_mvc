package com.springapp.mvc;

import com.alibaba.fastjson.JSON;
import com.springapp.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/view")
public class HelloController {
	@RequestMapping(/*method = RequestMethod.GET*/"/mvc")
	public String printWelcome(@RequestParam ("id")Integer id, ModelMap model) {
		model.addAttribute("id", id);
		model.addAttribute("message", "Hello world 世界!");
		return "hello";
	}
	@RequestMapping(value="/home", produces = "text/plain;charset=UTF-8")
//	@RequestMapping(/*method = RequestMethod.GET*/"/home")
	@ResponseBody
	public  Object home(@RequestParam Integer id/*@RequestParam ("id")Integer id, ModelMap model*/) {
//		model.addAttribute("id", id);
//		model.addAttribute("message", "Hello world!");
		Article article = new Article();
		article.setName("十月革命");
		article.setId(id);
		Object o =  JSON.toJSONString(article);
		return o;
	}
}