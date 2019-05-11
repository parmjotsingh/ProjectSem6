var p= document.getElementById('img');
var m1= document.getElementById('img1');
var m2= document.getElementById('img2');
var w= document.getElementById('wel');

window.addEventListener("scroll",function(){
  let offset= window.pageYOffset;
  p.style.backgroundPositionY = -offset*0.2 +"px";
  m1.style.backgroundPositionY = offset*0.9 +"px";
  m2.style.backgroundPositionY = offset*0.7 +"px";
  w.style.top = offset+100+"px";

});
