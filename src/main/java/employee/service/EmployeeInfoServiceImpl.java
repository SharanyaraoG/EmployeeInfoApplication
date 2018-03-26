package employee.service;

import java.util.List;

import employee.dao.EmployeeInfoDao;
import employee.model.EmployeeInfo;

public class EmployeeInfoServiceImpl implements EmployeeInfoService {
	
	private EmployeeInfoDao emplInfoDao;
	
	public EmployeeInfoServiceImpl() {
		
	}

	public void setEmplInfoDao(EmployeeInfoDao emplInfoDao) {
		this.emplInfoDao = emplInfoDao;
	}

	public EmployeeInfo checkCredentials(String username, String password) {
		return emplInfoDao.getEmployeeInfo(username, password);
	}

	public List<EmployeeInfo> getAllEmployeesInfo() {
		return emplInfoDao.getAllEmployees();
	}

	public Integer addEmployee(EmployeeInfo empInfo) {
		return emplInfoDao.createEmployee(empInfo);
	}
}
