<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
	<div class="col-md-offset-9 col-md-3 col-sm-offset-0 col-sm-12">
		<sec:authentication property="principal.authorities" var="authorities" />
		
		<c:forEach items="${authorities}" var="authority" varStatus="vs">
			<c:if test="${authority.authority eq 'ADMIN'}">
				<div class="dropdown  va_right_align">
				  <button class="btn btn-default dropdown-toggle" type="button" id="userType" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    Operational User
				    <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu dropdown-menu-right" aria-labelledby="userType">
				    <li><a href="#">Admin User</a></li>
				  </ul>
				</div>
			</c:if>
		</c:forEach>
	</div>
</div>
