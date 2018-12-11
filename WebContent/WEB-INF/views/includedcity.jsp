<%@ page language="java" import = "java.util.*" pageEncoding = "utf-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 

<html>

	<head>
	
		<title>Cities of the World</title>
	
	</head>

	<body>
	
		<table>
		
			<tr>
				<td> City Name: ${CityName}</td>
			</tr>
			
			<tr>
				<td> State : ${CityState}</td>
			</tr>
			
			<tr>
				<td> Country : ${CityCountry}</td>
			</tr>
			
			<tr>
				<td> Population : ${Population}</td>
			</tr>
			
			<tr>
				<td> Total Area : ${Area}</td>
			</tr>
			
			<tr>
				<td> City Founded Year : ${CityFoundedYear} </td>
			</tr>
		
		</table>

	</body>

</html>