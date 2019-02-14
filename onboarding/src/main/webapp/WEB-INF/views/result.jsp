<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Emp list Page</title>
   </head>

   <body>
    <%--   <h2>Emp list Page</h2>
      <table>
         <tr>
            <td>ID</td>
            <td>${empId}</td>
         </tr>
         <tr>
            <td>Emp Name</td>
            <td>${empFullName}</td>
         </tr>
         <tr>
            <td>Email</td>
            <td>${email}</td>
         </tr>
      </table>   --%>
      <ul>
			<c:forEach var="listValue" items="${resourceList}">
				<li>${listValue.empId}</li>
			</c:forEach>
		</ul>
   </body>
   


		


	
</html>