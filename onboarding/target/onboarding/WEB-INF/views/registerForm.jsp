<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
      <title>Requestor - Form</title>
   </head>

   <body>
      <h2>Requestor - Form</h2>
      <form:form method = "POST" action = "addResource">
         <table>
            <tr>
               <td><form:label path = "empId">Emp ID</form:label></td>
               <td><form:input path = "empId" /></td>
            </tr>
            <tr>
               <td><form:label path = "empFullName">Emp Name</form:label></td>
               <td><form:input path = "empFullName" /></td>
            </tr>
            <tr>
               <td><form:label path = "email">Emp Email</form:label></td>
               <td><form:input path = "email" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>