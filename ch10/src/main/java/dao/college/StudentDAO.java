package dao.college;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.college.StudentDTO;
import util.DBHelper;

public class StudentDAO extends DBHelper {
	
	private static final StudentDAO INSTANCE = new StudentDAO();
	public static StudentDAO getInstance() {
		return INSTANCE;
	}
	private StudentDAO() {}
	
	private final String DBCP = "jdbc/college";
	
	// 로거 생성
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void insertStudent(StudentDTO dto) {		
		
		try {
			conn = getConnection(DBCP);
			
			String sql = "INSERT INTO STUDENT VALUES (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getSTDNO());
			psmt.setString(2, dto.getNAME());
			psmt.setDate(3, dto.getBIRTH());
			psmt.setString(4, dto.getMAJOR());
			psmt.setDate(5, dto.getENR_DATE());			
			psmt.executeUpdate();
			closeAll();			
		}catch (Exception e) {			
			//e.printStackTrace();
			logger.error(e.getMessage());
		}		
	}
	
	public StudentDTO selectStudent(String STDNO) {
		
		StudentDTO dto = null;
		
		try {
			conn = getConnection(DBCP);
			
			String sql = "SELECT * FROM STUDENT WHERE STDNO=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, STDNO);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto = new StudentDTO();
				dto.setSTDNO(rs.getInt(1));
				dto.setNAME(rs.getString(2));
				dto.setBIRTH(rs.getDate(3));
				dto.setMAJOR(rs.getString(4));
				dto.setENR_DATE(rs.getDate(5));				
			}			
			closeAll();
		}catch (Exception e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		}		
		
		return dto;
	}
	
	public List<StudentDTO> selectAllStudent() {
		
		List<StudentDTO> dtoList = new ArrayList<StudentDTO>();
		
		try {
			conn = getConnection(DBCP);			
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM STUDENT";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setSTDNO(rs.getInt(1));
				dto.setNAME(rs.getString(2));
				dto.setBIRTH(rs.getDate(3));
				dto.setMAJOR(rs.getString(4));
				dto.setENR_DATE(rs.getDate(5));		
								
				dtoList.add(dto);
			}			
			closeAll();
		}catch (Exception e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		}		
		return dtoList;
	}
	
	
	public void updateStudent(StudentDTO dto) {
		try {
			conn = getConnection(DBCP);
			
		}catch (Exception e) {
			e.printStackTrace();			
		}
	}
	
	public void deleteStudent(String stdNo) {
		try {
			conn = getConnection(DBCP);
			
		}catch (Exception e) {
			e.printStackTrace();			
		}
	}
	

}