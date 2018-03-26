package employee.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import employee.model.EmployeeInfo;

public class EmployeeInfoDaoImpl implements EmployeeInfoDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeInfoDaoImpl() {
	
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public EmployeeInfo getEmployeeInfo(String username, String password) {
		String sql = "SELECT * FROM employee_info WHERE username = ? AND password = ?";
		System.out.println("in checking credentials");
		return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(EmployeeInfo.class), username, password);
	}

	public List<EmployeeInfo> getAllEmployees() {
		String sql = "SELECT * FROM employee_info";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(EmployeeInfo.class));
	}
	/* INSERT INTO employee_info(emp_id, username, emp_name, password, designation_id, experience, salary)
		VALUES (?,?,?,?,?,?,?)*/

	public Integer createEmployee(EmployeeInfo employeeInfo) {
		String sql = "INSERT INTO employee_info(emp_id, username, emp_name, password, designation_id, experience, salary) VALUES (?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, employeeInfo.getEmpId(), employeeInfo.getUsername(), employeeInfo.getEmpName(), employeeInfo.getPassword(), employeeInfo.getDesignationId(), employeeInfo.getExperience(), employeeInfo.getSalary());
	}
	
}
