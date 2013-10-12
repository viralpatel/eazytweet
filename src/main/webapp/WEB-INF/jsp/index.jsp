<!DOCTYPE html>

<html>
    <head>
        <title>eazy tweet</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="stylesheet" type="text/css" href="public/assets/bootstrap/css/bootstrap.css">
        
        <link rel="stylesheet" type="text/css" media="screen" href="public/css/main.css">
        <link rel="shortcut icon" type="image/png" href="public/img/favicon.png">
        
        
    </head>
    <body data-ng-app="EazyTweetMod" class="container">
	    <div class="page-header">
  			<h2 class="head">eazy tweet</h2>
	    </div>${sessionScope}--------
	    ${sessionScope.username}
	    <div ng-init="userid='${sessionScope.userid}'"></div>
		<div ng-view>loading...</div>
        
		<script src="public/assets/angularjs/angular.min.js"></script>
	    <script src="public/assets/angularjs/angular-resource.min.js"></script>
		<script src="public/app/app.js"></script>
    </body>
</html>