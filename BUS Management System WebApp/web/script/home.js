function closeStops() {
    var x = document.getElementById("forStops");
    x.style.display = "none";
}
let globalRoute;
function displayStops() {
    var x = document.getElementById("forStops");
    x.style.display = "flex";
}

function displayStops(route) {
    var x = document.getElementById("forStops");
    x.style.display = "flex";
    console.log(route);
    document.getElementById("slctStp").selectedIndex = ""+route;
//     value=route;
}