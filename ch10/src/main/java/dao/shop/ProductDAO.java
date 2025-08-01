package dao.shop;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.shop.ProductDTO;
import util.DBHelper;

public class ProductDAO extends DBHelper {
	
	private static final ProductDAO INSTANCE = new ProductDAO();
	public static ProductDAO getInstance() {
		return INSTANCE;
	}
	private void ProductDAo() {}

	private final String DBCP = "jdbc/shop";
	
	// 로거 생성
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void insertProduct(ProductDTO dto) {		
		
		try {
			conn = getConnection(DBCP);
			
			String sql = "INSERT INTO PRODUCT VALUES (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getPNO());
			psmt.setString(2, dto.getPNAME());
			psmt.setInt(3, dto.getSTOCK());
			psmt.setInt(4, dto.getPRICE());
			psmt.setString(5, dto.getCOMPANY());			
			psmt.executeUpdate();
			closeAll();			
		}catch (Exception e) {			
			//e.printStackTrace();
			logger.error(e.getMessage());
		}		
	}
	
	public ProductDTO selectProduct(String PNO) {
		
		ProductDTO dto = null;
		
		try {
			conn = getConnection(DBCP);
			
			String sql = "SELECT * FROM PRODUCT WHERE PNO=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, PNO);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto = new ProductDTO();
				dto.setPNO(rs.getInt(1));
				dto.setPNAME(rs.getString(2));
				dto.setSTOCK(rs.getInt(3));
				dto.setPRICE(rs.getInt(4));
				dto.setCOMPANY(rs.getString(5));				
			}			
			closeAll();
		}catch (Exception e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		}		
		
		return dto;
	}
	
public List<ProductDTO> selectAllProduct() {
		
		List<ProductDTO> dtoList = new ArrayList<ProductDTO>();
		
		try {
			conn = getConnection(DBCP);			
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM PRODUCT";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setPNO(rs.getInt(1));
				dto.setPNAME(rs.getString(2));
				dto.setSTOCK(rs.getInt(3));
				dto.setPRICE(rs.getInt(4));
				dto.setCOMPANY(rs.getString(5));	
				
				dtoList.add(dto);
			}			
			closeAll();
		}catch (Exception e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		}		
		return dtoList;
	}
	
	public void updateProduct(ProductDTO dto) {
		
	}
	
	public void deleteProduct(String PNO) {
		
	}
}