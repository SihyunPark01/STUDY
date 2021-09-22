package kr.co.Jboard3.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.Jboard3.dao.MemberDao;
import kr.co.Jboard3.vo.TermsVo;

public class TermsService implements CommonService{

	@Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) {
		
		TermsVo vo = MemberDao.getInstance().selectTerms();
		req.setAttribute("vo", vo);
		
		
		return "/user/terms.jsp";
	}
	
	

}
