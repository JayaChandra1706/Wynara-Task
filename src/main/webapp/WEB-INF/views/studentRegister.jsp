<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<style type="text/css">

body{
display: flex;
justify-content: center;
align-items: center;
height: 100vh;
}

form{
height: 50vh;
width:50vw;
}


</style>
</head>
<body>
      <form action="RegisterStudent">
          
      
      
      <div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">name</label>
  <input name="name" type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input placeholder">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">age</label>
  <input name="age" type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input placeholder">
</div>

<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">username</label>
  <input  type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input placeholder">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">password</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input placeholder">
</div>

<input type="submit" value="submit">

</form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>

</body>
</html>