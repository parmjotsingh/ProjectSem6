

function validation() {
    var frm = document.forms["frmlast"];
    var flag = true;
    if (frm["route"].value < 100 || frm["route"].value >= 1000) {
        frm["route"].value = "";
        frm["route"].style.borderBottomColor = "red";
        flag = false;
    } else {
        frm["route"].style.borderBottomColor = "white";
    }

    if (frm["driver"].value.match(/\d/g) !== null) {

        frm["driver"].style.borderBottomColor = "red";
        frm["driver"].value = "";
        flag = false;
    } else {
        frm["driver"].style.borderBottomColor = "white";
    }

    var phn = /[^0-9]/g;
    if (frm["contact"].value.length !== 10 || frm["contact"].value.match(phn) !== null || frm["contact"].value.match(/^[9]/) === null) {
        frm["contact"].style.borderBottomColor = "red";
        frm["contact"].value = "";
        flag = false;
    } else {
        frm["contact"].style.borderBottomColor = "white";
    }

    if (frm["place"].value.length < 3 || frm["place"].value.search(/\d/g) >= 0) {
        frm["place"].style.borderBottomColor = "red";
        frm["place"].value = "";
        flag = false;
    } else {
        frm["place"].style.borderBottomColor = "white";
    }
    return flag;
}
