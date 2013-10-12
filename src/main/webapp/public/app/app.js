var EazyTweetMod = angular.module('EazyTweetMod', ['ngResource'])

.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when( '/', {
					    templateUrl: 'public/app/home.tpl.html'
					  })
				.otherwise({redirectTo: '/'});
}])

.factory('TimelineTweetModal', function ($resource){
	var TimelineTweetsModalScope = this;
	var AllTimelineTweet = $resource('list.htm');
	TimelineTweetsModalScope.tweets = AllTimelineTweet.query();
	
	return TimelineTweetsModalScope;
})

.controller('HomeCtrl', function($scope, $rootScope, TimelineTweetModal, $http){
	tweet = function(user, text){
		this.user = user;
		this.text = text;
	};
	//$scope.tweetTimeline = TimelineTweetModal.tweets;
	
	$scope.tweetTimeline = [new tweet('Aadi','Cool!!!'), new tweet('Viral','Not really!:P ')];
	$scope.createTweet = function(){
		newT = new tweet($rootScope.userid, $scope.newTweet);
		$http.post('create-tweet.htm', 'text:'+$scope.newTweet);
		$scope.tweetTimeline.push();
		$scope.newTweet = null;
	};
});

