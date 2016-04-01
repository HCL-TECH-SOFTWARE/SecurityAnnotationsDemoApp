<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<body>
	<h2>Person Form - Spring 3 MVC example </h2>

	<form:form method="POST" commandName="person" action="person/signup">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			 <tr>
				<td>${person}</td>
				<td>${person.personalId}</td>
			   <td>${person.groupId}</td>
			</tr>
		</table>
	</form:form>

</body>
</html>