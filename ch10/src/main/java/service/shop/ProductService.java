package service.shop;

import java.util.List;

import dao.shop.ProductDAO;
import dto.shop.ProductDTO;

//열거형으로 싱글톤 객체 생성
public enum ProductService {

	INSTANCE;
	
	private ProductDAO dao = ProductDAO.getInstance();
	
	public void register(ProductDTO dto) {
		dao.insertProduct(dto);
	}
	
	public ProductDTO findById(String cid) {
		return dao.selectProduct(cid);
	}
	
	public List<ProductDTO> findAll() {
		return dao.selectAllProduct();
	}
	
	public void modify(ProductDTO dto) {
		dao.updateProduct(dto);
	}
	
	public void delete(String cid) {
		dao.deleteProduct(cid);
	}
}