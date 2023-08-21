package MyBatisAnnotationEx;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;

import ch10.vo.NewsDO;

/**
 * Servlet implementation class NewsController
 */
@WebServlet("/news.nhn")
@MultipartConfig(maxFileSize = 1024 * 1024 * 2, location = "c:/Temp/img")
public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsMapper newsMapper; // NewsMapper 인터페이스 타입으로 선언

	private final String START_PAGE = "ch10/newsList.jsp";

	@Override
	public void init() throws ServletException {
		super.init();
		newsMapper = MyBatisUtils.getMapper(NewsMapper.class);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		if (action == null) {
			action = "listNews";
		}

		Method m;
		String view = null;

		try {
			m = this.getClass().getMethod(action, HttpServletRequest.class);
			view = (String) m.invoke(this, request);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			request.setAttribute("error", "action 파라메터가 잘못되었습니다.");
			view = START_PAGE;
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (view.startsWith("redirect:/")) {
			String rview = view.substring("redirect:/".length());
			response.sendRedirect(rview);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}
	}

	public String addNews(HttpServletRequest request) {
		NewsDO n = new NewsDO();
		try {
			Part part = request.getPart("file");
			String fileName = getFilename(part);
			if (fileName != null && !fileName.isEmpty()) {
				part.write(fileName);
			}
			BeanUtils.populate(n, request.getParameterMap());
			n.setImg("/img/" + fileName);
			newsMapper.addNews(n);
		} catch (Exception e) {
			e.printStackTrace();
//			ctx.log("뉴스 추가 과정에서 문제 발생 ! ");
			request.setAttribute("error", "뉴스가 정상적으로 등록되지 않았습니다!");
			return listNews(request);
		}
		return "redirect:/news.nhn?action=listNews";
	}

	public String listNews(HttpServletRequest request) {
		List<NewsDO> list = newsMapper.getAll(); // MyBatis 애너테이션을 사용한 메서드 호출
		request.setAttribute("newslist", list);

		return "ch10/newsList.jsp";
	}

	public String getNews(HttpServletRequest request) {
		int aid = Integer.parseInt(request.getParameter("aid"));
		NewsDO n = newsMapper.getNews(aid);
		request.setAttribute("news", n);

		return "ch10/newsView.jsp";
	}

	public String deleteNews(HttpServletRequest request) {
		int aid = Integer.parseInt(request.getParameter("aid"));
		try {
			newsMapper.delNews(aid);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "뉴스가 정상적으로 삭제 되지 않았습니다.");
			return listNews(request);
		}
		return "redirect:/news.nhn?action=listNews";
	}

	private String getFilename(Part part) {
		String fileName = null;
		String header = part.getHeader("content-disposition");
		System.out.println("Header => " + header);
		int start = header.indexOf("filename=");
		fileName = header.substring(start + 10, header.length() - 1);
		Logger logger = Logger.getLogger(getClass().getName());
		logger.info("파일명 : " + fileName);
		return fileName;
	}
}