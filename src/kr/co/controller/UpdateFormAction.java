package kr.co.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.model.UserDto;
import kr.co.model.UserManager;

public class UpdateFormAction implements Controller {
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//수정하면 띄우기
		
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		
		//모델
		UserDto dto = UserManager.instance().findUser(userid);
		request.setAttribute("user",dto);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("update.jsp");
		modelAndView.setRedirect(false);
		return modelAndView;
	}

}
