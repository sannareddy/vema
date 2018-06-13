<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title" /></title>
<tiles:insertAttribute name="includes" />
</head>
<body>
	<div class="container-fluid">
		<div class="row" id="header_row">
			<div class="col-10" id="main_logo_holder">
				<tiles:insertAttribute name="header" />
			</div>			
			<div class="col-2">
				<tiles:insertAttribute name="menu" />				
			</div>
		</div>
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>