login.controller("LoginController",['$rootScope','$http','$scope','$location', 'DataService', function($rootScope, $http, $scope, $location, DataService){
	$scope.username="";
	$scope.password="";
	$scope.authenticate = function(){
		if($scope.username && $scope.password ){
		/*	var req = {
				 method: 'POST',
				 url: 'http://localhost:8080/EmployeeInfo/app/employee/login',
				 headers: {
					 'Content-Type': 'application/json'
				 },
				 data: {
					 "username":$scope.username,
					 "password":$scope.password
					 }
				}
			
			$http(req).then(function(response)
				{
					$scope.data = response.data;
					sessionStorage.data = JSON.stringify($scope.data);
					$location.path('/home');
				
				},function(reason){
					$scope.error = reason.data;
					$scope.errormsg = "Invalid user";
   			}); */
			
			$scope.CheckUser = function () {
		        DataService.getData($scope.username, $scope.password).then(function (response) {
					 $scope.data = response.data;
					 sessionStorage.data = JSON.stringify($scope.data);
					 $location.path('/home');
					 
		        },function(reason){
					 $scope.error = reason.data;
					 $scope.errormsg = "Invalid user";

				});
		        
		    };

		    $scope.CheckUser();
		}
	};
}]);

		

		
		