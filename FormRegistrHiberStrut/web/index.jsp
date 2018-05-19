<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Registration Form</title>
<s:head />
<style>
#a{
    border: 4px solid black;
	border-collapse : collapse;
    width:70%;
    margin:45px;
    margin-left: 120px;
    padding:10px;
    background-color:blue;
    color:white;
}
</style>
</head>

<body>
   <s:form action="register">
   <s:textfield name="name" label="First Name" placeholder="ss"/>
   <s:textfield name="lname" label="Last Name"/>
   <s:textfield name="age" label="Age"/>
   <s:textfield name="branch" label="Branch"/>
   <s:submit/>
   <hr />
   </s:form>
   
   <s:form action="listofstudent">
   		<s:submit value = "Show Table"/>
   </s:form>
     <table id ="a">
      <tr>
         <td><h2>First Name<h2></td>
         <td><h2>Last Name<h2></td>
         <td><h2>Age<h2></td>
         <td><h2>branch<h2></td>
      </tr>
      <s:iterator value="liststudent">	
      <fieldset>
         <tr>
            <td><s:property value="name"/></td>
            <td><s:property value="lname"/></td>
            <td><s:property value="age"/></td>
            <td><s:property value="branch"/></td>
           </tr>
      </fieldset>
      </s:iterator>	
   </table>
</body>
</html>