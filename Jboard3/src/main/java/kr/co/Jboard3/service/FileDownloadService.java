package kr.co.Jboard3.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.Jboard3.dao.ArticleDao;
import kr.co.Jboard3.vo.FileVo;


public class FileDownloadService implements CommonService {

	@Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) {
		
		String fseq = req.getParameter("fseq");
		
		FileVo fvo = ArticleDao.getInstance().selectFile(fseq);
		
		req.setAttribute("fvo", fvo);
		
		return "file:";
	}
}
