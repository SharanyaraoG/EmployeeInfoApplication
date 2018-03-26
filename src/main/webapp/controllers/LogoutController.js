login.controller("LogoutController", ['$scope', '$location',
	function ($scope, $location) {
	sessionStorage.clear();
	$location.path('/login');
}]);