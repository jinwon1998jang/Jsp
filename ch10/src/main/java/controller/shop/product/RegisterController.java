package controller.shop.product;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.shop.ProductDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.shop.ProductService;

@WebServlet("/shop/product/register.do")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 서비스 객체 가져오기
	private ProductService service = ProductService.INSTANCE;
	
	// 로거 생성
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/shop/product/register.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int PNO = Integer.parseInt(req.getParameter("PNO"));
		String PNAME = req.getParameter("PNAME");
		int STOCK = Integer.parseInt(req.getParameter("STOCK"));
		int PRICE = Integer.parseInt(req.getParameter("PRICE"));
		String COMPANY = req.getParameter("COMPANY");
		
		ProductDTO dto = new ProductDTO();
		
		dto.setPNO(PNO);
		dto.setPNAME(PNAME);
		dto.setSTOCK(STOCK);
		dto.setPRICE(PRICE);
		dto.setCOMPANY(COMPANY);	
		
		logger.info(dto.toString());
		
		service.register(dto);
		
		resp.sendRedirect("/ch10/shop/product/list.do");	
	}	
}