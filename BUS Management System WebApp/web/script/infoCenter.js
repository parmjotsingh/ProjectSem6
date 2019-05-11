function showInfoCenter(){
  const inf= document.getElementById('info-center');
  console.log("open");
  inf.style.opacity = 1;
  inf.style.height = "90%";
  inf.style.width = "90%";
  inf.style.transitionDuration = "1s";
  inf.style.zIndex = "100";
}
function closeInfoCenter(){
  const inf= document.getElementById('info-center');
  console.log("close");
  inf.style.opacity = 0;
  inf.style.height = "0%";
  inf.style.width = "0%";
  inf.style.transitionDuration = "0.5s";
  inf.style.zIndex = "-100";
}
