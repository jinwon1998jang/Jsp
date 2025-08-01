package service.college;

import java.util.List;

import dao.college.StudentDAO;
import dto.college.StudentDTO;

public enum StudentService {
	
	INSTANCE;	
	
	private StudentDAO dao = StudentDAO.getInstance();
	
	public void register(StudentDTO dto) {
		dao.insertStudent(dto);		
	}
	
	public StudentDTO findById(String STDNO) {		
		return dao.selectStudent(STDNO);
	}
	
	public List<StudentDTO> findAll() {		
		return dao.selectAllStudent();
	}
	
	public void modify(StudentDTO dto) {			
		dao.updateStudent(dto);
	}
	
	public void delete(String STDNO) {
		dao.deleteStudent(STDNO);
	}
}