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
	<h2>AJOUT ECHANGE</h2>

	<s:actionerror />

	<s:form action="addEchangeAction" cssClass="form-horizontal">
	<s:hidden name="contact.id"></s:hidden>

<!-- 				<div class="row"> -->
<!-- 			<label class="col col-lg-3 control-label">ID Contact</label> -->
<!-- 			<div class="col col-lg-8"> -->
<%-- 				<s:textfield name="echange.contact.id" value="%{echange.contact.id} "  /> --%>
<!-- 			</div> -->
<!-- 		</div> -->
		
		<div class="row">
			<label class="col col-lg-3 control-label">Type Echange</label>
			<div class="col col-lg-8">
				<s:textfield name="echange.type" cssClass="bg-focus" />
			</div>
		</div>

		<div class="row">
			<label class="col col-lg-3 control-label">Date Echange</label>
			<div class="col col-lg-8">
			<s:textfield name="echange.date" cssClass="bg-focus"/>
			</div>
		</div>
		
				<div class="row">
			<label class="col col-lg-3 control-label">Commentaire</label>
			<div class="col col-lg-8">
				<s:textfield name="echange.commentaire" cssClass="bg-focus" />
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