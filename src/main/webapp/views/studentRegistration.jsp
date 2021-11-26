<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveStudent" modelAttribute="student" method="POST">
		<table>

			<tr>
				<td>Name</td>
				<td><form:input path="studentName" /></td>
			</tr>


			<tr>
				<td>Email</td>
				<td><form:input path="studentEmail" /></td>
			</tr>


			<tr>
				<td>MobileNo</td>
				<td><form:input path="studentMobile" /></td>
			</tr>


			<tr>
				<td>Gender</td>
				<td><form:radiobuttons path="studentGender" items="${genders}"></form:radiobuttons>

				</td>
			</tr>

			<tr>
				<td>Course</td>
				<td><form:select path="studentSlctdCourse" items="${courses}">
					</form:select></td>
			</tr>


			<tr>
				<td>Timing</td>
				<td><form:checkboxes path="studentSlctdTiming"
						items="${timings}"></form:checkboxes></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>


		</table>
	</form:form>
</body>
</html>