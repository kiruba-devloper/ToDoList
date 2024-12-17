<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToDo List - Home</title>
</head>
<style>
body {
   background-color: rgba(0, 100, 200, 0.3);
  align="centre";
  padding-top: 115px;
}
table{
background-color: aquamarine;
padding: 40px;
border-radius:10px;
}
table input{
margin-top: 10px;
background-color:lightgray;
border-radius:10px;
padding:10px;
width:700px
}
table button{
margin-top: 10px;
background-color:blue;
border-radius:10px;
padding:10px;
}
table th{
padding:10px;
}
ol{
padding-top:5px;
padding-bottom:1px;
margin-left:100px;
margin-right:100px;
margin-top:10px;
align="center"; 
border-radius:10px;
background-color:DodgerBlue;
}
#btnn {

position: relative;
  top: 30px;
margin-left: 90%;

background-color:tomato;
border-radius:10px;
padding:10px;

}
#btn {

position: relative;
  top: -60px;
margin-left: 90%;

background-color:tomato;
border-radius:10px;
padding:10px;

}
#line{
position: relative;
  top: -40px;
}
ol li{
background: #cce5ff;
  color: darkblue;
 padding:0.1px;
  margin: 20px;
}
</style>
<body  >


<h1 align="center" style="background-color:DodgerBlue" >TODO List</h1>
<table align="center" border="0">
		<form action="Home" method="post">
			<tr>
				
				<td><input type="text" placeholder="Enter Tasks To Do"
					name="task"></input>
					<input type="reset" value="x" style="width:30px"></input></td>
				<td colspan="2" align="center">
					<button type="submit">Add To List</button>
				</td>
			</tr>

			
		
	<hr>
	</table><br><br><hr >
	 ${hi}
	<h2 align="center">Your List</h2>
	<input type="submit" name="btnn" id="btn" value="Delete All" ></input>
	<hr id="line">
	<ol  >
	
	${list}
	</ol>
	
	
	
	</form>
</body>
</html>