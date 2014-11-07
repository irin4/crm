<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajout Contact</title>
</head>
<body>
	<h2>AJOUT CONTACT/ ECHANGE</h2>

	<s:actionerror />

	<s:form action="addContactAction" cssClass="form-horizontal">
		<s:hidden name="contact.id"></s:hidden>
		<h3>Ajout Contact</h3>
		<div class="row">
			<label class="col col-lg-3 control-label">Nom</label>
			<div class="col col-lg-8">
				<s:textfield name="contact.nom" cssClass="bg-focus" />
			</div>
		</div>
		<div class="row">
			<label class="col col-lg-3 control-label">Prénom</label>
			<div class="col col-lg-8">
				<s:textfield name="contact.prenom" cssClass="bg-focus" />
				<div class="line line-dashed m-t-large"></div>
			</div>
		</div>
		<div class="row">
			<label class="col col-lg-3 control-label">Email</label>
			<div class="col col-lg-8">
				<s:textfield name="contact.mail" cssClass="bg-focus" />
			</div>
		</div>
		<div class="row">
			<label class="col col-lg-3 control-label">Numéro Téléphone
				(fixe)</label>
			<div class="col col-lg-8">
				<s:textfield name="contact.numeroFixe" cssClass="bg-focus" />
			</div>
		</div>
		<div class="row">
			<label class="col col-lg-3 control-label">Numéro Téléphone
				(mobile)</label>
			<div class="col col-lg-8">
				<s:textfield name="contact.numeroMobile" cssClass="bg-focus" />
			</div>
		</div>
		<div class="row">
			<label class="col col-lg-3 control-label">Statut</label>
			<div class="col col-lg-8">
  			<s:select list="@fr.treeptik.entity.Statut@values()"
                        name="contact.statut"  />
			</div>
		</div>

		<div class="row">
			<label class="col col-lg-3 control-label">Entreprise</label>
			<div class="col col-lg-8">
				<s:select label="Entreprise" headerKey="-1"
					headerValue="Choisir l'entreprise" list="listEntreprise"
					name="contact.entreprise.idEntreprise" listValue="raisonSociale"
					listKey="idEntreprise" />
			</div>
		</div>
		

		<div class="row">
			<div class="col col-lg-9 col-offset-3">
				<s:submit cssClass="btn btn-primary" value="Ajouter" />
			</div>
		</div>
	</s:form>
	
	
	
	
</body>
</html>