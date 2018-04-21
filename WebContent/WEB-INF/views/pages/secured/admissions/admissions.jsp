<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form>
	<div class="row va_vertical_center" style="padding-top: 15px">

		<div class="col-3 col-sm-3">
			<img src="images/admissions.png" /><span style="margin-left: 15px">Admissions</span>
		</div>

		<div class="col-3 col-sm-3">
			
			<div class="form-group row va_vertical_center va_no_btm_margin">
				<label for="class" class="col-sm-2 col-form-label">Admission to Class</label>
			
				<div class="col-sm-10 va_vertical_center">
					<select class="custom-select my-1 mr-sm-2" id="class">
						<option selected>Choose...</option>
						<c:forEach var="eduClass" items="${allClasses}">
							<option value="${eduClass.classId}">${eduClass.className}</option>
						</c:forEach>
					</select>
				</div>
			</div>
		</div>
		
		<div class="col-6 col-sm-6 va_horizontal_center">
			<font size='3'><b>9966691989</b></font>
		</div>
	</div>

	<div class="s1">
	
		<div class="row form-group">
		First Name :<input type="text" name="first_name" size="10" maxlength="20" placeholder="First Name" spellcheck="false"> 
		</div>
		<div >
		Last Name:
		<input type="text" name="last_name" size="10" maxlength="20" spellcheck="false">
		</div>

	</div>
	
	<div class="s2">
	
	<div>Gender  <input type="radio" name="gender" value="1"/> Male </div>
	
	</div>
	
	<div class="s3">Date of birth :
	
	<select name="date">
	
	<option value="">Choose one</option>
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	<option value=""></option>
	
	
	</select>  <input type="date"> </div>
	
</form>

</br>
which is better for gender selection...radio button, checkbox or select option</br>
Is admission no is automatically generates?</br>
Option to enter already joined students