<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Contact</title>
</head>
<body>
	<table border="1px" cellpadding="8px">
		<tr>
			<th>ID</th>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Email</th>
			<th>numeroFixe</th>
			<th>numeroMobile</th>
			<th>statut</th>
			<th>Entreprise</th>
			<th>Echanges</th>
			<th>Actions</th> 
		</tr>
		<s:iterator value="contacts">
			<tr>
			<s:hidden name="id"></s:hidden>
				<td><s:property value="id" /></td>
				<td><s:property value="nom" /></td>
				<td><s:property value="prenom" /></td>
				<td><s:property value="mail" /></td>
				<td><s:property value="numeroFixe" /></td>
				<td><s:property value="numeroMobile" /></td>
				<td><s:property value="statut" /></td>
				<td><s:property value="entreprise.raisonSociale" /></td>
				<td><a href="<s:url action="initAddEchangeAction.action">
 					<s:param name="contact.id" value="id"/>
 					</s:url>">Ajouter un échange</a><br>
 					
 					<a href="<s:url action="getEchangeAction">
 					<s:param name="contact.id" value="id"/>
 					</s:url>">Liste Echanges</a><br>
 					
 					
 					</td>
 				<td><a href="<s:url action="deleteContactAction">
 					<s:param name="contact.id" value="id"/>
 					</s:url>">Supprimer</a>
 					 
                             <br>
					<a href="<s:url action="UpdateContactAction">
 					<s:param name="contact.id" value="id"/>
 					</s:url>">Modifier</a></td>
			</tr>
		</s:iterator>
		</table>
				<div>
		<s:submit cssClass="btn btn-primary" value="Retour" />
		</div>
</body>
</html>






