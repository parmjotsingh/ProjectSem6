function setup(){
  var can=createCanvas(windowWidth,200);
  // can.style('display', 'block');
  can.parent('s');
}
function draw(){
  background(250);
  fill(0);
  stroke(255,0,0);
  ellipse(width/2,height/2,100,100);
}
