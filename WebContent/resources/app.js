var vema=angular.module('vema',['ngMaterial','ui.router']);
vema
.config(function($urlRouterProvider,$stateProvider,$httpProvider){
	$urlRouterProvider.otherwise('/home');
	var loginState={
		name:'login',
		url:'/login',
		templateUrl:'open/login/login.tpl.html',
		controller:'loginController as loginCtrl'
	}
	var homeState={
		name:'home',
		url:'/login',
		templateUrl:'open/login/login.tpl.html',
		controller:'loginController as loginCtrl'	
	}
	
	$stateProvider.state(loginState);
	$stateProvider.state(homeState);
	
		
				
})
.config(function($mdThemingProvider){
		$mdThemingProvider.definePalette('vema-primary-palegreen', {
		  '50': 'a5d6a7',
		  '100': 'a5d6a7',
		  '200': 'a5d6a7',
		  '300': 'd7ffd9', //hue-1
		  '400': 'a5d6a7',
		  '500': 'a5d6a7', //default
		  '600': 'a5d6a7',
		  '700': 'a5d6a7',
		  '800': 'c5e1a5', //hue-2
		  '900': 'a5d6a7',
		  'A100': 'aed581', //hue-3
		  'A200': 'a5d6a7',
		  'A400': 'a5d6a7',
		  'A700': 'a5d6a7',
		  'contrastDefaultColor': 'light',
		  'contrastDarkColors': [],
		  'contrastLightColors': []
		});
		
		$mdThemingProvider.definePalette('vema-accent-darkgreen', {
			  '50': '1b5e20',
			  '100': '1b5e20',
			  '200': '1b5e20',
			  '300': '1b5e20', 
			  '400': '629749', //hue-2
			  '500': '1b5e20',
			  '600': '1b5e20',
			  '700': '003d00',//hue-3
			  '800': 'ef6c00', 
			  '900': 'e65100',
			  'A100': '4c8c4a', //hue-1
			  'A200': '1b5e20', //default
			  'A400': '1b5e20',
			  'A700': '1b5e20',
			  'contrastDefaultColor': 'light',
			  'contrastDarkColors': '800 900'
		});
		
		$mdThemingProvider.definePalette('vema-background-sharkwhite', {
			'50': 'ffffff',
		    '100': 'c6c8b5',
		    '200': 'eeeeee',
		    '300': 'bdc192',
		    '400': 'bdbdbd',
		    '500': '9e9e9e',
		    '600': '757575',
		    '700': '616161',
		    '800': '424242',
		    '900': '212121',
		    'A100': 'fffff6',
		    'A200': '000000',
		    'A400': '303030',
		    'A700': '616161',
		    'contrastDefaultColor': 'dark',
		    'contrastLightColors': '600 700 800 900 A200 A400 A700'
		});

       $mdThemingProvider.theme('default')
       	.accentPalette('vema-accent-darkgreen')
        .primaryPalette('blue-grey')
        .warnPalette('red')
        .backgroundPalette('vema-background-sharkwhite');
});
