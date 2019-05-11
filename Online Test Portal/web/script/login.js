function toSignup() {
    var l = document.getElementsByClassName("login");
    var s = document.getElementsByClassName("signUP");

    l[0].style.transitionDuration = "1s";
    l[0].style.display = "none";
    s[0].style.display = "flex";
}


function toLogin() {
    var l = document.getElementsByClassName("login");
    var s = document.getElementsByClassName("signUP");

    l[0].style.display = "flex";
    s[0].style.display = "none";
}

function check() {
    var name = document.forms["frm"]["username"].value;
    var password = document.forms["frm"]["pass"].value;
    console.log(name + password);
    var f = true;
    if (name == "" && name.length <= 0)
    {
        document.forms["frm"]["username"].style.borderLeft = "6px solid red";
        f = false;
    } else {
        document.forms["frm"]["username"].style.borderLeft = "6px solid #00b8e6";
    }
    if (password == "" ) {
        document.forms["frm"]["pass"].style.borderLeft = "6px solid red";
        document.getElementById("pass").style.display="";
        f = false;
    } else {
        document.forms["frm"]["pass"].style.borderLeft = "6px solid #00b8e6";
        document.getElementById("pass").style.display="none";
    }
    if (password.length < 8) {
        document.forms["frm"]["pass"].style.borderLeft = "6px solid red";
        document.getElementById("pass").style.display="";
        f = false;
    } else {
        document.forms["frm"]["pass"].style.borderLeft = "6px solid #00b8e6";
        document.getElementById("pass").style.display="none";
    }
    return f;
}
function checkSignup() {
    var name = document.forms["frm2"]["username"].value;
    var password = document.forms["frm2"]["pass"].value;
    var email = document.forms["frm2"]["email"].value;
//    var lname = document.forms["frm2"]["lname"].value;
    var contact = document.forms["frm2"]["contact"].value;
    console.log(name + password);
    var f = true;
    if (name == "" && name.length <= 0)
    {
        document.forms["frm2"]["username"].style.borderLeft = "6px solid red";
        f = false;
    } else {
        document.forms["frm2"]["username"].style.borderLeft = "6px solid #00b8e6";
    }

    if (email == "" && email.length <= 0)
    {
        document.forms["frm2"]["email"].style.borderLeft = "6px solid red";
        f = false;
    } else {
        document.forms["frm2"]["email"].style.borderLeft = "6px solid #00b8e6";
    }
    if (password == "") {
        document.forms["frm2"]["pass"].style.borderLeft = "6px solid red";
        document.getElementById("pass2").style.display="";
        f = false;
    } else {
        document.forms["frm2"]["pass"].style.borderLeft = "6px solid #00b8e6";
        document.getElementById("pass2").style.display="none";
    }
    if (password.length < 8) {
        document.forms["frm2"]["pass"].style.borderLeft = "6px solid red";
        document.getElementById("pass2").style.display="";
        f = false;
    } else {
        document.forms["frm2"]["pass"].style.borderLeft = "6px solid #00b8e6";
        document.getElementById("pass2").style.display="none";
    }
    var phn = /[^0-9]/g;
    if (document.forms["frm2"]["contact"].value.length !== 10 || document.forms["frm2"]["contact"].value.match(phn) !== null || document.forms["frm2"]["contact"].value.match(/^[9]/) === null) {
        document.forms["frm2"]["contact"].style.borderLeft = "6px solid red";
        document.forms["frm2"]["contact"].value = "";
        f = false;
    } else {
        document.forms["frm"]["contact"].style.borderLeft = "6px solid #00b8e6";
    }
    return f;
}
