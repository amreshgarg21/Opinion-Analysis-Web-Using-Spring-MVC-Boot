<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Sentiment Analysis</title>
    
    <style>
    
    body{
    	background:#ffc2c2;
    }
    
    
    
    </style>
    
  </head>
  
  <body>
    <h1 class="text-center mt-5" style="color:#f7450c;font-weight: 900;" >Welcome To Sentiment Analysis!</h1>
    
    <div class="container mt-5">
	 	 <form action="processform" method="post">
	 	 
	  		<div class="mb-3">
	    		<label for="exampleInputData1" style="color: #7e4800;font-weight: 900;font-size: x-large;" class="form-label ">Enter The Text to be Analyzed</label>
	    		<textarea class="form-control" style="background:#ffd3d3;color:#162de4" name="user_Message" id="exampleInputData1" rows="10"></textarea>
	  		</div>	  		
	  		
	  		<div class="container text-center">
	  			<button type="submit" class="btn btn-success">Submit</button>
	  		</div>
	  		
	  	</form>
	  </div>
    
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

  </body>
  
</html>