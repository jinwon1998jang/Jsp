package dto.college;

import java.sql.Date;

public class StudentDTO {
	
	private int STDNO;
	private String NAME;
	private Date BIRTH;
	private String MAJOR;
	private Date ENR_DATE;
	public int getSTDNO() {
		return STDNO;
	}
	public void setSTDNO(int sTDNO) {
		STDNO = sTDNO;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public Date getBIRTH() {
		return BIRTH;
	}
	public void setBIRTH(Date bIRTH) {
		BIRTH = bIRTH;
	}
	public String getMAJOR() {
		return MAJOR;
	}
	public void setMAJOR(String mAJOR) {
		MAJOR = mAJOR;
	}
	public Date getENR_DATE() {
		return ENR_DATE;
	}
	public void setENR_DATE(Date eNR_DATE) {
		ENR_DATE = eNR_DATE;
	}
	@Override
	public String toString() {
		return "StudentDTO [STDNO=" + STDNO + ", NAME=" + NAME + ", BIRTH=" + BIRTH + ", MAJOR=" + MAJOR + ", ENR_DATE="
				+ ENR_DATE + "]";
	}
	
	

}