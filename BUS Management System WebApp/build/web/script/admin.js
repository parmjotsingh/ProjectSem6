/* global btnType */

var x = document.getElementById("option1");
var yPointer = document.getElementsByClassName("right-content");
var chng = window.pageYOffset;

console.log(x.getBoundingClientRect().top);
document.getElementById("line").style.top = x.getBoundingClientRect().top + chng + 26 + "px";
document.getElementById("line").style.width = x.getBoundingClientRect().width - 2 + "px";
document.getElementById("pointer").style.top = x.getBoundingClientRect().top - 7 + chng + "px";
document.getElementById("pointer").style.left = yPointer[0].getBoundingClientRect().left + "px";

function view(i) {
    chng = window.pageYOffset;
    toggle(i);
    x = document.getElementById("option" + i);
    console.log(x.getBoundingClientRect().top + "  " + (x.getBoundingClientRect().top + 26 + chng + "  ") + window.pageYOffset + "px");
    document.getElementById("line").style.top = x.getBoundingClientRect().top + 26 + chng + "px";
    document.getElementById("line").style.width = x.getBoundingClientRect().width - 2 + "px";
    document.getElementById("pointer").style.left = yPointer[0].getBoundingClientRect().left + "px";
    document.getElementById("pointer").style.top = x.getBoundingClientRect().top - 7 + chng + "px";
}

function toggle(i) {
    if (i === 4) {
        displayStops();
    } else {
        var drv = document.getElementById("leftDetailContent1");
        var bNumber = document.getElementById("leftDetailContent2");
        var bRoute = document.getElementById("leftDetailContent3");
        drv.style.position = "absolute";
        drv.style.top = 0;
        // drv.style.opacity= 0;
        drv.style.display = "none";
        bNumber.style.position = "absolute";
        bNumber.style.top = 0;
        // bNumber.style.opacity= 0;
        bNumber.style.display = "none";
        bRoute.style.position = "absolute";
        bRoute.style.top = 0;
        // bRoute.style.opacity= 0;
        bRoute.style.display = "none";
        document.getElementById("leftDetailContent" + i).style.position = "relative";
        document.getElementById("leftDetailContent" + i).style.display = "flex";
    }
}


function slideDown() {
    window.scrollTo(0, 1000);
    chng = -100;
    document.getElementsByTagName('body')[0].style.overflowY = "scroll";
}

function upd(type) {
//  setTypeOfButton(type);
    var j = document.getElementById('forUpdate');
    j.style.display = "flex";
    var btntype = document.getElementById("chgBtnType");
//  console.log(document.getElementsByClassName("busno"));
    if (type === 'Add') {
        document.getElementsByClassName("busno")[0].style.display = "inherit";
        document.getElementsByClassName("busno")[1].style.display = "inherit";
        btntype.setAttribute("value", "Add");
    } else {
        document.getElementsByClassName("busno")[0].style.display = "inherit";
        document.getElementsByClassName("busno")[1].style.display = "inherit";
        btntype.setAttribute("value", "Update");
    }
}
function updClose() {
    var j = document.getElementById('forUpdate');
    j.style.display = "none";
    var frm = document.forms["frmlast"];
    frm["driver"].value = "";
    frm["route"].value = "";
    frm["contact"].value = "";
    frm["place"].value = "";
    frm["route"].style.borderBottomColor = "white";
    frm["contact"].style.borderBottomColor = "white";
    frm["place"].style.borderBottomColor = "white";
    frm["driver"].style.borderBottomColor = "white";
}

function closeStops() {
    var x = document.getElementById("forStops");
    x.style.display = "none";
}
let globalRoute;
function displayStops() {
    var x = document.getElementById("forStops");
    x.style.display = "flex";
}
