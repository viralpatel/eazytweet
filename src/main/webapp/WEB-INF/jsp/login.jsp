<!DOCTYPE html>

<html>
    <head>
        <title>eazy tweet</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="public/assets/bootstrap/css/bootstrap.css">
    </head>
    
    <body class="container">
  		<h2 class="head">eazy tweet</h2>
		<div class="row">
			<div class="col-md-6">
				Register:
				<form class="form-horizontal" role="form"  method="post" action="create-user.htm">
					<div class="form-group">
					    <label for="uname" class="col-md-2 control-label">Username</label>
					    <div class="col-md-4">
					     	<input name="username" class="form-control" type="text"  required>
					    </div>
					  </div>
					<div class="form-group">
					    <label for="pwd" class="col-md-2 control-label">Password</label>
					    <div class="col-md-4">
					     	<input name="password" class="form-control" type="password" required>
					    </div>
					  </div>
					<div class="form-group">
					    <div class="col-md-offset-2 col-md-4">
					      <input type="submit" class="btn btn-default" value="Sign Up">
					    </div>
					  </div>
				</form>
			</div>
			<div class="col-md-6">
				Login:
				<form class="form-horizontal" role="form" method="post" action="login.htm">
					<div class="form-group">
					    <label for="uname" class="col-md-2 control-label">Username</label>
					    <div class="col-md-4">
					     	<input name="username" class="form-control"  required>
					    </div>
					  </div>
					<div class="form-group">
					    <div class="col-lg-offset-2 col-md-4">
					      <input type="submit" class="btn btn-default" value="Sign In">
					    </div>
					</div>
				</form>
			</div>
		</div>
    </body>
</html>