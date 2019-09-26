package kr.co.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.model.UserDto;
import kr.co.model.UserManager;

public class ListAction implements Controller{
	@Override
	public ModelAndView execute(HttpServletRequest request , HttpServletResponse response) throws Exception {
		
		ArrayList<UserDto> list = UserManager.instance().getUserAll(); // 점이 두개이상 나왔다는건 포함관계라는 뜻
		request.setAttribute("list", list);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list.jsp");
		modelAndView.setRedirect(false);
		return modelAndView;
	}
	
}
