login.controller("NewUserController",['$rootScope','$http','$scope','$location', function($rootScope, $http, $scope, $location){
    
	$scope.register = function(){
	
		if($scope.user.password == $scope.user.rePwd){
			console.log("creating employee");
			console.log($scope.user);
			var req = {
							method: 'POST',
							url: 'http://localhost:8080/EmployeeInfo/app/employee/addEmployee',
							headers: {	
							'Content-Type': 'application/json'
						},
						 	data: $scope.user
						}
	
						$http(req).then(function(response)
						{
							$scope.data = response.data;
						},function(reason){
							$scope.error = reason.data;
			            });
			
		   }
		else{
			$scope.	mismatchmsg = "password and re-enter password should match ";
		}
		
	   },
	   
	   $scope.reset = function() {
		    $scope.user = {};
		    $scope.form.setPristine();
		}
	
}]);