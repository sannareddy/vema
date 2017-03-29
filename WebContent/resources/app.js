var vema=angular.module('vema',['ngMaterial','ui.router']);
vema.config(function($urlRouterProvider,$stateProvider,$httpProvider){
	$urlRouterProvider.otherwise('/login');
	$stateProvider
		.state('login',{
			url:'/login',
			templateUrl:'open/login/login.tpl.html',
			controller:'loginController as loginCtrl'
		})
		.state('home',{
			url:'/home',
			templateUrl:'open/home/home.tpl.html',
			controller:'homeController as homeCtrl'
		})
	
});
