package com.example.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employee")
public class EmployeeService {

	/**
	 * This method returns a JSON object. First it returns a Java object which
	 * is converted to a JSON object.
	 * 
	 * @return
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeDetail() {
		Employee emp = new Employee();
		emp.setEmpID("ab1234");
		emp.setName("Alex Martin");
		emp.setEmail("alexmartin@example.com");

		return emp;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveEmployee(Employee emp) {
		String result = "Employee saved : " + emp;
		return Response.status(201).entity(result).build();

	}

	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateEmployee(Employee emp) {
		String result = "Employee updated : " + emp;
		return Response.status(200).entity(result).build();
	}

	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteEmployee(Employee emp) {
		String result = "Employee deleted : " + emp;
		return Response.status(200).entity(result).build();

	}
}
