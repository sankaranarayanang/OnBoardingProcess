<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Emp list Page</title>
   </head>

   <body>
      <h2>Emp list Page</h2>
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
      </table>  
   </body>
   
</html>