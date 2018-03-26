package employee.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import employee.model.EmployeeInfo;
import employee.service.EmployeeInfoService;

@Path("/employee")
public class EmployeeInfoResource {
	
	private EmployeeInfoService emplInfoService;
	
	public void setEmplInfoService(EmployeeInfoService emplInfoService) {
		this.emplInfoService = emplInfoService;
	}

	@POST
	@Path("/login")
	@Consumes("application/json")
	@Produces("application/json")
	public Response checkCredentials(EmployeeInfo employeeInfo){
		
		System.out.println("username: " + employeeInfo.getUsername());
		System.out.println("password: " + employeeInfo.getPassword());
		EmployeeInfo employee = emplInfoService.checkCredentials(employeeInfo.getUsername(), employeeInfo.getPassword());
		return Response
			   .status(200)
			   .header("Access-Control-Allow-Headers","Content-Type")
			   .header("Access-Control-Allow-Origin", "*")
			   .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
			   .entity(employee).build();
	}
	@GET
	@Produces("application/json")
	public Response getAllEmployee(){
		
		return Response.status(200).entity(emplInfoService.getAllEmployeesInfo()).build();
	}
	
	@POST
	@Path("/addEmployee")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addEmployee(EmployeeInfo employeeInfo){
		Integer rows = emplInfoService.addEmployee(employeeInfo);
		if(rows > 0){
			System.out.println("Inserted Successfully");
		}
		return Response.status(200).entity(rows).build();
	}
}
