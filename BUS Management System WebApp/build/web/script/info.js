function showInfo(){
  const inf= document.getElementById('inf-rgt');
  console.log("open");
  inf.style.opacity = 1;
  inf.style.right = 0;
  inf.style.width = 50+"%";
  inf.style.position= "absolute";
  // setTimeout(2000,function(){
    document.getElementById('info-frm').style.opacity=1;
  // });
}
function closeInfo(){
  const inf= document.getElementById('inf-rgt');
  console.log("close");
  inf.style.opacity = 0;
  inf.style.right = -20+"%";
  inf.style.width = 0+"%";
  document.getElementById('info-frm').style.opacity=0;
}
