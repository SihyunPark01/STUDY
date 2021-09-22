package kr.co.Jboard3.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutService implements CommonService {

	@Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) {
	
		HttpSession sess = req.getSession();
		sess.invalidate();
		
		return "redirect:/user/login.do?success=101";
	}

}
