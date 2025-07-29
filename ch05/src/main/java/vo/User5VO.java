package vo;

public class User5VO {
	private String NAME;
	private String GENDER;
	private int AGE;
	private String ADDR;
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
		return "User5VO [NAME=" + NAME + ", GENDER=" + GENDER + ", AGE=" + AGE + ", ADDR=" + ADDR + "]";
	}

}
