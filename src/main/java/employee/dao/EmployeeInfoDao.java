package employee.dao;

import java.util.List;


import employee.model.EmployeeInfo;

public interface EmployeeInfoDao {
	
	public EmployeeInfo getEmployeeInfo(String username, String password);
	public List<EmployeeInfo> getAllEmployees();
	public Integer createEmployee(EmployeeInfo employeeInfo);

}
