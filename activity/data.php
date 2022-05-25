<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "data";

	$email = $_POST['email'];
    $password1 = $_POST['password1'];
	$Retypepassword = $_POST['Retypepassword'];
	$fname = $_POST['fname'];
	$lname = $_POST['lname'];
	$pno = $_POST['pno'];
	$add = $_POST['add'];
	$city =$_POST['city'];
	$myList = $_POST['myList'];
	$country = $_POST['country'];
	$school = $_POST['school'];
	$program = $_POST['program'];
	$myList2 = $_POST['myList2'];
	$edu_status = $_POST['edu_status'];
	$graduationdate = $_POST['graduationdate'];
	$employer = $_POST['employer'];
	$jobtitle = $_POST['jobtitle'];
	$jobduty = $_POST['jobduty'];
	$workedyear = $_POST['workedyear'];
	$bfile = $_POST['bfile'];


   
	$conn = new mysqli($servername, $username, $password, $dbname);
	if($conn->connect_error){
		echo "$conn->connect_error";
		die("Connection Failed : ". $conn->connect_error);
	} 
	else {
		$stmt= $conn->prepare("insert into details(email,Password,RetypePassword,FirstName,LastName,PhoneNumber,Address,City,country,myList,school,program,education,educationstatus,graduationdate,employer,jobtitle,jobduty,workedyear,attachment) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		$stmt->bind_param("sssssissssssssssssss", $email,$password1,$Retypepassword,$fname,$lname,$pno,$add,$city,$country,$myList,$school,$program,$myList2,$edu_status,$graduationdate,$employer,$jobtitle,$jobduty,$workedyear,$bfile);
		$execval = $stmt->execute();
		echo $execval;
		echo "Registration successfully...";
		$stmt->close();
		$conn->close();
	}


?>