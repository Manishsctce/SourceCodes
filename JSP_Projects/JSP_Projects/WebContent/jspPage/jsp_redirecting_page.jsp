<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP_REDIRECT_DEMO</title>
</head>
<body>
	This is REdirecting to another page	
	<jsp:forward page="/jspPage/displayEmployees.jsp">
		<jsp:param value="Value1" name="reqParam1"/>
		<jsp:param value="Value2" name="reqParam2"/>
	</jsp:forward>
</body>
</html>