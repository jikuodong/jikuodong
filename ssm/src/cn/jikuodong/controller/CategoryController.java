package cn.jikuodong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jikuodong.pojo.Category;
import cn.jikuodong.service.CategoryService;

// ����spring mvc����һ����������
@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list();
		
		// ����ת������
		mav.addObject("cs", cs);
		// ����jsp·��
		mav.setViewName("listCategory");
		return mav;
	}

}