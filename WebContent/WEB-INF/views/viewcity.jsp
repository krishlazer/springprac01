<%@ page language="java" import = "java.util.*" pageEncoding="utf-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 
<html>

	<head>

			<title>Enter City Details</title>

	</head>

	<body>
			<form:form action = "/classicity/addcity" method = "post"> 
			
			<table>
			
				<tr>
					<td><form:label path="CityName"> Enter City</form:label></td>
					<td><form:input path="CityName"/></td>
				</tr>
				
				<tr>
					<td><form:label path="CityState">Enter State</form:label></td>
					<td><form:input path="CityState"/></td>
				</tr>
				
				<tr>
					<td><form:label path="CityCountry">Enter Country</form:label></td>
					<td><form:input path="CityCountry"/></td>
				</tr>
				
				<tr>
					<td><form:label path="Population">Enter Population</form:label></td>
					<td><form:input path="Population"/></td>
				</tr>
				
				<tr>
					<td><form:label path="Area"> Area </form:label></td>
					<td><form:input path="Area"/></td>
				</tr>
				
				<tr>
					<td><form:label path="CityFoundedYear"> Year City was Founded</form:label></td>
					<td><form:input path="CityFoundedYear"/></td>
				</tr>					
			
				<tr>
				
					<td colspan="2">
						<input type="submit" value="Submit">
					</td>
					
				</tr>
			
			
			</table>
		
		</form:form>

	</body>

</html>