var login = angular.module('login', ['ui.router']);

login.config(function ($stateProvider, $urlRouterProvider) {
	$urlRouterProvider
	
	$stateProvider
	.state("login", {
        url: "/login",
        templateUrl: "views/login.html",
		controller: 'LoginController'
    })
    .state("home", {
        url:"/home",
        templateUrl: "views/home.html",
		controller: 'HomeController'
    })
	.state("project", {
        url:"/project",
        templateUrl: "views/project.html",
		controller: 'ProjectController'
    })
	.state("services", {
        url:"/services",
        templateUrl: "views/services.html",
		controller: 'ServicesController'
    })
	.state("contactus", {
        url:"/contactus",
        templateUrl: "views/contactus.html",
		controller: 'ContactusController'
    })
	.state("logout", {
        url:"/logout",
		controller: 'LogoutController'
    })
	.state("images", {
		url:"/images",
		templateUrl: "views/image.html",
		controller: 'ImageController'
    })
    .state("newuser", {
		url:"/newuser",
		templateUrl: "views/newuser.html",
		controller: 'NewUserController'
    })
	$urlRouterProvider.otherwise('/login');
});