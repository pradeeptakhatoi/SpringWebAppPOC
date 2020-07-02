<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="false" %>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-4">
  <div class="text-center mb-3" style="position: relative">
  	<h2 class="text-center">View Customer</h2>
  	<a class="btn btn-success" href="list" style="position: absolute; top: 10px; right: 0;">Customer List</a>
  </div> 
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>       
      </tr>
    </thead>
    <tbody>
    
	
   	   <tr>  		   
		   <td>${customer.firstName}</td>  
		   <td>${customer.lastName}</td>  
		   <td>${customer.email}</td>  		  
	   </tr>  
	     
      
    </tbody>
  </table>
</div>

</body>
</html>
