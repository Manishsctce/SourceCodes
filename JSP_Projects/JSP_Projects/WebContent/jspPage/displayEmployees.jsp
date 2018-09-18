<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th> ID </th>
			<th>Name</th>
		</tr>
		<tr>
			<th>1</th>
			<th>Manish</th>
		</tr>
		<tr>
			<th>2</th>
			<th>Gaurav</th>
		</tr>			
	</table>
	<c:out value="Hi Manish, you are using core jstl tag for expression" ></c:out>
	
	<% 
		List<String> myList = new ArrayList<String>();
		myList.add("Manish"); myList.add("Akanksha"); myList.add("Gaurav"); myList.add("Shubhi"); 
		session.setAttribute("a1", myList ); 
	%>
	<br><br>
	<%
	out.println("Below is use of jstl with sessionScope: \n");
	%>	
	<c:out value="${sessionScope.a1}"></c:out><br>
	
	<%= "Below is use of jstl with sessionScope:" %><br>
	<c:forEach items="${requestScope.empList}" var="emp">
		<tr>
			<td><c:out value="${emp.id}"></c:out></td>
			<td><c:out value="${emp.name}"></c:out></td>
			<td><c:out value="${emp.role}"></c:out></td>
		</tr>
	</c:forEach>
	<br><br>
	<%
		//pageContext.setAttribute(arg0, arg1, arg2)
		out.println("Below is the use of pageContext:<br>");
		Object objA1 = pageContext.getAttribute("a1", PageContext.SESSION_SCOPE);
		out.println(objA1+" instance Of "+ objA1.getClass());
	
		out.println("<br> Fetch requested param using pageContext:<br>");
		Object reqParam1 = pageContext.getAttribute("reqParam1",PageContext.REQUEST_SCOPE);
		Object reqParam2 = pageContext.getAttribute("reqParam2",PageContext.REQUEST_SCOPE);
		
		out.println(" Request Param1: "+reqParam1+" Request Param2: "+ reqParam2+"<br>");
	%>
</body>
</html>