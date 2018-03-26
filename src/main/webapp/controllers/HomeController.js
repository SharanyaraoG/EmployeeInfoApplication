login.controller("HomeController", ['$rootScope','$http', '$scope', '$location','DataService',
	function ($rootScope, $http, $scope, $location, DataService) {
		$scope.empData = JSON.parse(sessionStorage.getItem('data'));
		/*var req = {
					 method: 'POST',
					 url: 'http://localhost:8080/EmployeeInfo/app/employee/login',
					 headers: {	
				     'Content-Type': 'application/json'
				 },
				 data: {
					 "username":$scope.empData.username,
					 "password":$scope.empData.password
					   }
				}

				$http(req).then(function(response)
				{
					 $scope.data = response.data;
					 $scope.empName = $scope.data.empName;
							
				},function(reason){
					 $scope.error = reason.data;
					
				});*/
		
		$scope.fetchContent = function () {
	        DataService.getData($scope.empData.username, $scope.empData.password).then(function (response) {
				 $scope.data = response.data;
				 $scope.empName = $scope.data.empName;
	        },function(reason){
				 $scope.error = reason.data;
					
			});
	        
	    };

	    $scope.fetchContent();
	}]);



