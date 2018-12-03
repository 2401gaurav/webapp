'use strict'

var module = angular.module('demo.controllers', []);
module.controller("UserController", [ "$scope", "UserService",
		function($scope, UserService) {

			/*$scope.userDto = {
				userId : null,
				userName : null,
				whatWentWrong : null,
				whatWentWell :null
			};*/
			
			
			

			$scope.saveUser = function() {
				
				UserService.saveUser($scope.userDto).then(function() {
					console.log("works");
					UserService.getAllUsers().then(function(value) {
						$scope.allUsers= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

					
					$scope.userDto = {
						userId : null,
						userName : null,
						whatWentWrong : null,
						whatWentWell:null
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);