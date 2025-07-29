package vo;

public class User7VO {
	private String ID;
	private String NAME;
	private int AGE;
	private String EMAIL;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	@Override
	public String toString() {
		return "User7VO [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", EMAIL=" + EMAIL + "]";
	}


}
