package vo;

public class User7VO {
	private String ID;
	private String NAME;
	private int AGE;
	private String EMAIL;
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		ID = id;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int age) {
		AGE = age;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String email) {
		EMAIL = email;
	}
	@Override
	public String toString() {
		return "User7VO [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", EMAIL=" + EMAIL + "]";
	}


}
