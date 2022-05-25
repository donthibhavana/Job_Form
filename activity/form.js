//password validation
var password1 = document.getElementById("password1")
  , Retypepassword = document.getElementById("Retypepassword");

function validatePassword(){
  if(password1.value != Retypepassword.value) {
    Retypepassword.setCustomValidity("Passwords Don't Match");
  } else {
    Retypepassword.setCustomValidity('');
  }
}


/*
// province dropdown box
function ProvinceOption() {  
var mylist = document.getElementById("myList");  
document.getElementById("Province").value = mylist.options[mylist.selectedIndex].text;  
}  
// education level dropdown box
function EducationOption() {  
    var mylist2 = document.getElementById("myList2");  
    document.getElementById("Education Level").value = mylist2.options[mylist2.selectedIndex].text;  
    }  
// attachment
const selectedFile = document.getElementById('bfile').files[0];   
//reset button
function myFunction() {
    document.getElementById("dataform").reset();
  } 
    */