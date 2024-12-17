<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToDo List</title>
</head>
<style>
body {
  <%-- background-image: url("/ToDoList/src/main/java/ControllerModule/img/logo.png"); --%>
  background-image: url("img/bg-login.jfif");
  align="centre";
  padding-top: 300px;
}
table{
background-color: lightgray;
padding: 20px;
border-radius:20px;
padding-bottom:10px;
}
table button{
margin-top: 20px;
background-color:blue;
border-radius:10px;
padding:10px;
}
table th{
padding:10px;
}
</style>
<body align="center">
	
	<h1 align="center">Login</h1>
	

	${msg}
	<br>
	
	<table align="center" border="0">
		<form action="Login" method="post">
			<tr>
				<th align="left"><label>Name</label></th>
				<td><input type="text" placeholder="Enter Name"
					name="full_name"></td>
			</tr>
			<tr>
				<th align="left"><label>Gender</label></th>
				<td><input type="radio" name="gender">Male<input
					type="radio" name="gender">Female</td>
			</tr>
			<tr>
				<th align="left"><label>Email*</label></th>
				<td><input type="email" placeholder="Enter Mail Id" required
					name="uemail"></td>
			</tr>

			<tr>
				<th align="left"><lable>Password*</lable></th>
				<td><input type="password" placeholder="Enter Password"
					required name="upassword"></td>
			</tr>

			<tr>
				<td colspan="2" align="center">
					<button type="submit">login</button>
				</td>

			</tr>
		</form>
		
	</table>

   

</body>
</html>