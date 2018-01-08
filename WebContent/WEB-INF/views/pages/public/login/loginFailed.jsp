<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>		
	<title>Vema Schools</title>
	<link href="lib/node_modules/angular-material/angular-material.min.css" rel="stylesheet"/>
</head>
<body ng-app="vema">
	<div layout="row" ng-controller="loginController as loginCtrl" ng-cloak>
		<div layout="column" layout-fill>
			<div flex="100">
				Logo
			</div>
			<div flex="100" layout="row" layout-align="center center" layout-fill>
				<form name="f" method="POST" action="authenticate">
					<div layout="column">
						<md-input-container class="md-icon-float" style="width:400px">
							<label>Username</label>
							<input type="text" name="username"/>
						</md-input-container>
						<md-input-container class="md-icon-float" style="width:400px">
							<label>Password</label>
							<input type="password" name="password"/>
						</md-input-container>
						<md-button type="submit" class="md-raised md-primary va-inverted-foreground" style="width:150px">Login</md-button>
					</div>
					<div layout-align="center center" layout="column">
						<span style="color:red"> Username or password is invalid</span>					
					</div>
				</form>
			</div>
		</div>
	</div>	
	<script type="text/javascript" src="lib/node_modules/angular/angular.min.js"></script>
	<script type="text/javascript" src="lib/node_modules/angular-animate/angular-animate.min.js"></script>
	<script type="text/javascript" src="lib/node_modules/angular-aria/angular-aria.min.js"></script>
	<script type="text/javascript" src="lib/node_modules/angular-messages/angular-messages.min.js"></script>
	<script type="text/javascript" src="lib/node_modules/angular-material/angular-material.min.js"></script>
	<script type="text/javascript" src="lib/node_modules/angular-ui-router/release/angular-ui-router.min.js"></script>
	<script type="text/javascript" src="global/app.js"></script>
	<script type="text/javascript" src="open/login/login.ctrl.js"></script>
</body>
</html>
