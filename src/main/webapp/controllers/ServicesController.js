login.controller("ServicesController", ['$http', '$scope', '$location',
	function ($http, $scope, $location) {
		$scope.name = sessionStorage.getItem('data.empName');
		$http.get('data/content.json').then(function(response)
		{
			$scope.data = response.data;
		},function(reason){
			$scope.error = reason.data;
	});
}]);