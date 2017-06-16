<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resume Builder</title>
</head>
<body>

  <form action="AddPerson" method="post">
  
   <p>Personal Information<br></p>
  <br>First Name
  <input type="text" name="first">
 <br>Last Name
  <input type="text" name="last">
  <br>Email Address
  <input type="text" name="email">
  <p>Education</p>
  <br>Degree
  <input type="text" name="degree">
  <br>Major
  <input type="text" name="major">
  <br>University
  <input type="text" name="u_Name">
  <br>Year Graduated or Graduating
  <input type="text" name="y_Grad">
  <p>Professional Experience</p>
  <br>Position
  <input type="text" name="title">
  <br>Company
  <input type="text" name="c_Name">
  <br>Start Date
  <input type="text" name="s_Date">
  <br>End Date
  <input type="text" name="e_Date">
  <br>Duties
  <input type="text" name="duty">
  <p>Skills</p>
  <br>SKill
  <input type="text" name="sFields">
  <br>Level of proficiency
  <input type="text" name="ratings">
   <br><input type="submit"> 
  </form>
<br>
<br>
 <br>

</body>
</html>