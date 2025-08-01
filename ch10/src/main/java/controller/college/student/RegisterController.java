package controller.college.student;

import java.io.IOException;
import java.sql.Date;

import dao.college.StudentDAO;
import dto.college.StudentDTO;
import dto.shop.CustomerDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.college.StudentService;

@WebServlet("/college/student/register.do")
public class RegisterController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	// 서비스 객체 가져오기
	private StudentService service = StudentService.INSTANCE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/college/student/register.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    String stdNoStr = req.getParameter("stdno");
	    String name = req.getParameter("name");
	    String birthStr = req.getParameter("birth");
	    String major = req.getParameter("major");
	    String enrDateStr = req.getParameter("enr_date");
	    
	    int stdNo = Integer.parseInt(stdNoStr);
	    Date birth = Date.valueOf(birthStr);
	    Date enrDate = Date.valueOf(enrDateStr);
	    
	    StudentDTO dto = new StudentDTO();
	    dto.setSTDNO(stdNo);
	    dto.setNAME(name);
	    dto.setBIRTH(birth);
	    dto.setMAJOR(major);
	    dto.setENR_DATE(enrDate);
	    
	    // 이 부분에 service.register(dto)와 같은 서비스 호출 코드가 들어갑니다.
	    // service.register(dto);
	    
	    resp.sendRedirect("/ch10/college/student/list.do");	
	}
}











