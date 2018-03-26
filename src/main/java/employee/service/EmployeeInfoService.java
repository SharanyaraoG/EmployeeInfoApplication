package employee.service;

import java.util.List;

import employee.model.EmployeeInfo;

public interface EmployeeInfoService {

	public EmployeeInfo checkCredentials(String username, String password);
	public List<EmployeeInfo> getAllEmployeesInfo();
	public Integer addEmployee(EmployeeInfo empInfo);
	
}
