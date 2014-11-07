<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
    <s:head/> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AJout Entreprise</title>
    </head>
    <body>

        <h2>AJOUT ENTREPRISE</h2>
        
        <s:actionerror/>
						<s:form action="addEntrepriseAction" cssClass="form-horizontal">
						<s:hidden name="entreprise.idEntreprise"></s:hidden>
							<div class="row">
								<label class="col col-lg-3 control-label">Raison Sociale</label>
								<div class="col col-lg-8">
									<s:textfield name="entreprise.raisonSociale" cssClass="bg-focus" />
								</div>
							</div>
							<div class="row">
								<label class="col col-lg-3 control-label">Adresse</label>
								<div class="col col-lg-8">
									<s:textfield name="entreprise.adresse" cssClass="bg-focus" />
									<div class="line line-dashed m-t-large"></div>
								</div>
							</div>
							<div class="row">
								<label class="col col-lg-3 control-label">Secteur
									d'activité</label>
								<div class="col col-lg-8">
								<s:textfield name="entreprise.secteurActivite" cssClass="bg-focus" />
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