<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form>
	<div class="row va_vertical_center" style="padding-top: 15px">
		<div class="col-3 col-sm-3">
			<img src="images/admissions.png" /><span style="margin-left: 15px">Admissions</span>
		</div>
		<div class="col-3 col-sm-3">
			<div class="form-group row va_vertical_center va_no_btm_margin">
				<label for="class" class="col-sm-2 col-form-label">Class</label>
				<div class="col-sm-10 va_vertical_center">
					<select class="custom-select my-1 mr-sm-2" id="class">
						<option selected>Choose...</option>
						<c:forEach var="option" items="${allClasses}">
							<option>${option}</option>						
						</c:forEach>				
					</select>
				</div>
			</div>
		</div>
		<div class="col-6 col-sm-6 va_horizontal_center">
			<font size='5'><b>9966691989</b></font>
		</div>
	</div>
	<div class="">

		<div class="row form-group"></div>

	</div>
</form>