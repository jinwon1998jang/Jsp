package dto.shop;

import java.sql.Date;

public class ProductDTO {

	private int PNO;
	private String PNAME;
	private int STOCK;
	private int PRICE;
	private String COMPANY;
	public int getPNO() {
		return PNO;
	}
	public void setPNO(int pNO) {
		PNO = pNO;
	}
	public String getPNAME() {
		return PNAME;
	}
	public void setPNAME(String pNAME) {
		PNAME = pNAME;
	}
	public int getSTOCK() {
		return STOCK;
	}
	public void setSTOCK(int sTOCK) {
		STOCK = sTOCK;
	}
	public int getPRICE() {
		return PRICE;
	}
	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}
	@Override
	public String toString() {
		return "ProductDTO [PNO=" + PNO + ", PNAME=" + PNAME + ", STOCK=" + STOCK + ", PRICE=" + PRICE + ", COMPANY="
				+ COMPANY + "]";
	}
	
}