<%@page language="java" %>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags" %>

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.application.form.label.ticker" path="ticker"/>
	<acme:form-textbox code="authenticated.application.form.label.tickerOfInvest" path="tickerOfInvest"/>
	<acme:form-moment code="authenticated.application.form.label.creation" path="creation"/>
	<acme:form-textbox code="authenticated.application.form.label.statement" path="statement"/>
	<acme:form-money code="authenticated.application.form.label.offer" path="offer"/>
	<acme:form-return code="authenticated.application.form.button.return"/>
</acme:form>

