<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Entreprise</title>
</head>
<body>
	<table border="1px" cellpadding="8px">
		<tr>
			<th>ID</th>
			<th>Raison Sociale</th>
			<th>Adresse</th>
			<th>Secteur d'activité</th>
			<th>Contacts</th>
			<th>Actions</th> 
		</tr>
		<s:iterator value="entreprises">
			<tr>
			<s:hidden name="idEntreprise"></s:hidden>
				<td><s:property value="idEntreprise" /></td>
				<td><s:property value="raisonSociale" /></td>
				<td><s:property value="adresse" /></td>
				<td><s:property value="secteurActivite" /></td>
				<td><a href="<s:url action="getContactAction">
                             <s:param name="idEntreprise" value="idEntreprise"/>
                            </s:url>">Liste Contact</a></td>
				
 				<td><a href="<s:url action="deleteEntrepriseAction">
 					<s:param name="idEntreprise" value="idEntreprise"/>
 					</s:url>">Supprimer</a>
 					 
                             <br>
					<a href="<s:url action="UpdateEntrepriseAction">
 					<s:param name="idEntreprise" value="idEntreprise"/>
 					</s:url>">Modifier</a></td>
			</tr>
		</s:iterator>
		
		
		
		
	</table>
</body>
</html>