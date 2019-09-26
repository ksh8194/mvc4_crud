package kr.co.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.model.UserManager;

public class LoginAction implements Controller{
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String id = request.getParameter("userid");
		String pwd = request.getParameter("password");
		System.out.println(id+" "+pwd);
		
		
		
		//모델과 통신
		UserManager manager = UserManager.instance();
		boolean b = manager.login(id, pwd);
		
								
		ModelAndView modelAndView = new ModelAndView();
		
		if(b) {
			HttpSession httpSession = request.getSession(true);
			httpSession.setAttribute("userid",id);
			modelAndView.setViewName("list.m2"); //로그인 후 회원목록 보기
		}else {
			modelAndView.setViewName("loginfail.html");
		}
		modelAndView.setRedirect(true); //호출방식 결정
		return modelAndView;
	}

}
