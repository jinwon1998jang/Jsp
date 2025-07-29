package vo;

public class User6VO {
	private int SEQ;
	private String NAME;
	private String GENDER;
	private int AGE;
	private String ADDR;
	
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public String getADDR() {
		return ADDR;
	}
	public void setADDR(String aDDR) {
		ADDR = aDDR;
	}
	@Override
	public String toString() {
		return "User6VO [SEQ=" + SEQ + ", NAME=" + NAME + ", GENDER=" + GENDER + ", AGE=" + AGE + ", ADDR=" + ADDR
				+ "]";
	}
	
	
}
