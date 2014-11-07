<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Echange</title>
</head>
<body>
	<table border="1px" cellpadding="8px">
		<tr>
			<th>ID ECHANGE</th>
			<th>TYPE ECHANGE</th>
			<th>DATE ECHANGE</th>
			<th>COMMENTAIRE</th>
			<th>Actions</th> 
		</tr>
		<s:iterator value="echanges">
			<tr>
			<s:hidden name="id"></s:hidden>
				<td><s:property value="idEchange" /></td>
				<td><s:property value="type" /></td>
				<td><s:property value="date" /></td>
				<td><s:property value="commentaire" /></td>
				<td><a href="<s:url action="contact/deleteEchangeAction">
 					<s:param name="idEchange" value="idEchange"/>
 					</s:url>">Supprimer</a>
 					 
                             <br>
					<a href="<s:url action="UpdateEchangeAction">
 					<s:param name="idEchange" value="idEchange"/>
 					</s:url>">Modifier</a></td>
			</tr>
		</s:iterator>
		</table>
				<div>
<%-- 		<s:submit cssClass="btn btn-primary" value="Retour" /> mettre un bouton !!--%>
		</div>
</body>
</html>