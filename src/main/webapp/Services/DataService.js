login.service('DataService', function($http){
   this.getData = function(name, pwd) {
   var req = {
					 method: 'POST',
					 url: 'http://localhost:8080/EmployeeInfo/app/employee/login',
					 headers: {	
				     'Content-Type': 'application/json'
				 },
				 data: {
					 "username":name,
					 "password":pwd
					   }
				}
      return $http(req);
   };
});




