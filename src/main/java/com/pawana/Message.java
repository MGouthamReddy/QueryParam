package com.pawana;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Path("/home")
public class  Message{
// Remove L from Lover Its all are over..
	@GET
	@Path("/msg")
	public String ShowMsg(
			@QueryParam("eid")int empid,
			@QueryParam("ename")String empName) {
		return "Hello:"+empid+","+empName;

	}

}


//http://localhost:8080/QueryParam/rest/home/msg?eid=5&ename=A//
