package employee.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeInfo {
	
	private int id;
	private int empId;
	private String username;
	private String empName;
	private String password;
	private String rePwd;
	private int designationId;
	private String designationName;
	private int experience;
	private int salary;
	
	public EmployeeInfo() {
	}

	public EmployeeInfo(int id, int empId, String username, String empName,
			String password, String rePwd, int designationId,
			String designationName, int experience, int salary) {
		super();
		this.id = id;
		this.empId = empId;
		this.username = username;
		this.empName = empName;
		this.password = password;
		this.rePwd = rePwd;
		this.designationId = designationId;
		this.designationName = designationName;
		this.experience = experience;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePwd() {
		return rePwd;
	}

	public void setRePwd(String rePwd) {
		this.rePwd = rePwd;
	}

	public int getDesignationId() {
		return designationId;
	}

	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}