<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

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

<div class="container" style="width: 550px">

  <h2>Edit Customer</h2>
  
  <form:form method="post" action="updateCustomer" modelAttribute="customer"> 
  	<form:input path="id" type="hidden" />    
   	<div class="form-group">
      <label for="firstName">First Name:</label>
      <form:input path="firstName" class="form-control" placeholder="Enter first name" />     
    </div>
     <div class="form-group">
      <label for="lastName">First Name:</label>
      <form:input path="lastName" class="form-control" placeholder="Enter last name" /> 
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <form:input path="email" class="form-control" placeholder="Enter email" /> 
    </div>  
    <button type="submit" class="btn btn-primary">Update</button>
    <a style="float: right" href="${pageContext.request.contextPath}/customer/list">Back to List</a>
  </form:form>    
  

  
</div>

</body>
</html>
