

window.addEventListener("scroll",function(e){
  var div1=document.getElementsByClassName("div1");
  var div2=document.getElementsByClassName("div2");
  var div3=document.getElementsByClassName("div3");
  var d2lft=document.getElementsByClassName("d2lft");
  // var w=document.getElementById("wel");
  var l=window.scrollY/15;
  var size= 90;
  if( window.scrollY >= 0 && window.scrollY < 1000){
    var s= (100+l)+"% " +(100+l)+"%";
    // console.log(s);
    div1[0].style.backgroundSize= s;
    div2[0].style.boxShadow= 0+" -"+l+"px " + l*2 +"px rgb(54, 58, 50)";
  }
  var div2eff= document.getElementById("div2");
  var div2bf = document.getElementsByClassName("before");
  var div2af = document.getElementsByClassName("after");
  console.log("top = "+div2eff.getBoundingClientRect().top);
  console.log(div2eff.getBoundingClientRect().top < 50 );
  if(div2eff.getBoundingClientRect().top <= 50 && div2eff.getBoundingClientRect().bottom > 500){
    div2bf[0].style.display="static";
    div2bf[0].style.width="40%";
    div2bf[0].style.left="35%";
    div2af[0].style.display="static";
    div2af[0].style.width="40%";
    div2af[0].style.left="35%";
    d2lft[0].style.transform= " skewY(5deg) rotateY(360deg)";
    console.log( div2bf[0].style.display);
  }
  else if(div2eff.getBoundingClientRect().bottom < 500 ){
    div2bf[0].style.width="0%";
    div2bf[0].style.left="135%";
    div2af[0].style.width="0%";
    div2af[0].style.left="-35%";
  }
  else{
    div2bf[0].style.width="0%";
    div2bf[0].style.left="-35%";
    div2af[0].style.width="0%";
    div2af[0].style.left="135%";
    d2lft[0].style.transform= " skewY(5deg) rotateY(180deg)";
  }
  if(div2eff.getBoundingClientRect().bottom < 500 ){
    div3[0].style.boxShadow= " 0 0px "+(l)+"px black";
    div3[0].style.transform="skewY(-5deg) translateY(-"+l+"px)";
  }
  else{
    div3[0].style.boxShadow= " 0 0px 0px black";
    div3[0].style.transform="skewY(-5deg) translateY(0px)";
  }
  // if(div3[0].getBoundingClientRect())
});

var flag = true;
function openClose(){
  var x= document.getElementsByClassName("menu");
  var c= document.getElementsByClassName("menu-content");
//  var taketest= document.getElementById("TakeTestBtn");
  if(flag){
      // x[0].style.display= "flex";
      x[0].style.width= "100%";
      x[0].style.height= "100%";
      x[0].style.top= "0%";
      x[0].style.right= "0%";
      x[0].style.opacity= "1";
      x[0].style.transitionDuration=".5s";
      c[0].style.display="flex";
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
      flag=true;
  }
}

function changePosition1(){
    var d3btn1= document.getElementsByClassName("d3btn1");
    d3btn1[0].style.position="static";
}
function changePosition2(){
    var d3btn1= document.getElementsByClassName("d3btn1");
    d3btn1[0].style.position="relative";
}
