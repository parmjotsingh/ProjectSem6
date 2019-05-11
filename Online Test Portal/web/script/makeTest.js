var t=true;
function tgl(){
  var x=document.getElementsByClassName('arr');
  var y=document.getElementsByClassName('sideBar');
  var z=document.getElementsByClassName('crs-name');
  var w=document.getElementsByClassName('que-counter');
  var v=document.getElementsByClassName('endbtn');
  var m=document.getElementsByClassName('main');
  if(t){
    x[0].innerHTML="OPEN";
    x[0].style.left="55px";
    x[0].style.transform="rotateY(360deg)";
    z[0].style.display= "none";
    w[0].style.display= "none";
    v[0].style.display= "none";
    y[0].style.width= "1%";
    y[0].style.backgroundColor= "#39424e";
    y[0].style.left="0px";
    m[0].style.width= "100%";
    m[0].style.left= "0%";
    t=false;
    console.log("HI");
  }
  else{
    x[0].innerHTML="CLOSE";
    x[0].style.left="-55px";
    x[0].style.transform="rotateY(00deg)";
    x[0].style.textShadow= "0 0 0";
    z[0].style.display= "" ;
    w[0].style.display= "flex" ;
    v[0].style.display= "" ;
    y[0].style.width="15%";
    y[0].style.backgroundColor="#f3f7f7";
    y[0].style.left="0px";
    m[0].style.width= "85%";
    m[0].style.left= "15%";
    t=true;
    console.log("HI2");
  }
}

var flag = true;
function openClose(){
  tgl();
  var x= document.getElementsByClassName("menu");
  var c= document.getElementsByClassName("menu-content");
  var y=document.getElementsByClassName('arr');
  if(flag){
      // x[0].style.display= "flex";
      x[0].style.width= "100%";
      x[0].style.height= "100%";
      x[0].style.top= "0%";
      x[0].style.right= "0%";
      x[0].style.opacity= "1";
      x[0].style.transitionDuration=".5s";
      c[0].style.display="flex";
      y[0].style.zIndex=0;
      flag=false;
  }
  else {
      x[0].style.width= "0px";
      x[0].style.height= "100%";
      x[0].style.opacity= "0";
      x[0].style.top= "0%";
      x[0].style.right= "0%";
      x[0].style.transitionDuration=".5s";
      c[0].style.display="none";
      y[0].style.zIndex=1;
      flag=true;
  }
}
function changeToQues(){
//  var x=document.getElementsByClassName('requirment');
//  var y=document.getElementsByClassName('main');
//
//  // x[0].style.transform="rotateY(180deg)";
//  x[0].style.display="none";
//
//  y[0].style.transform="rotateY(360deg)";
//  y[0].style.display="flex";

}
