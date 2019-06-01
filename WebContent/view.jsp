<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="data.Emp" %>
    <%@page import="Lesson.AddBean" %>

    <%
    	String name,pas,sex;
    	Emp emp = new Emp();
    	AddBean bean = null;
    	if(session.getAttribute("s_bean") != null){
			bean = (AddBean)session.getAttribute("s_bean");
    	}else{
    		bean = new AddBean();
    		session.setAttribute("s_bean", bean);
    	}

	    name = emp.getEmpName();
	    pas = emp.getEmpPas();
	    sex = emp.getEmpSex();

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>氏名</th>
			<th>パスワード</th>
			<th>性別</th>
		</tr>
		<%for(Emp a : bean.getEmps()) {%>

			<tr>
				<td><%=a.getEmpName()%></td>
				<td><%=a.getEmpPas() %></td>
				<td><%=a.getEmpSex() %>
			</tr>
		<%} %>
	</table>
</body>
</html>