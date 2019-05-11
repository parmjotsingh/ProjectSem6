var refreshIntervalId;
  var  flag=false;
  var offset=window.pageYOffset;
  document.getElementById("nav-btn").style.color ="white";
  window.addEventListener('scroll',function(e) {
    console.log( "hi" );
    offset=window.pageYOffset;
    if(offset < 707){
      document.getElementById("nav-btn").style.color ="white";
    }
    else {
      document.getElementById("nav-btn").style.color ="black";
    }
  });
function openNav(){
  if(flag == false){
    document.getElementById('nav-btn').innerHTML = "&#9783;";
    let i=0;
    refreshIntervalId=setInterval(function(){i=oneByOne(i);},100);
  }
  else{
    document.getElementById('nav-btn').innerHTML = "&#9776;";
    let i=3;
    refreshIntervalId=setInterval(function(){i=closeOneByOne(i);},100);
  }
}

function oneByOne(i) {
  var x= document.getElementsByClassName('nav-elem');
  x[i].style.transitionDuration="1s";
  x[i].style.top= 0;
  x[i].style.opacity=1;
  if(i<3){
  return ++i;
  }
  else {
    flag=true;
    clearInterval(refreshIntervalId);
  }
}

function closeOneByOne(i) {
  var x= document.getElementsByClassName('nav-elem');
  x[i].style.transitionDuration="150ms";
  x[i].style.top= "-50px";
  x[i].style.opacity=0;
  if(i>0){
  return --i;
  }
  else {
    flag=false;
    clearInterval(refreshIntervalId);
  }
}
