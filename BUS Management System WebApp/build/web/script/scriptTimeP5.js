

function setup() {
  var myCanvas = createCanvas(300,300);
    myCanvas.parent("clock");
  }
  let s,m,h;
function draw() {
	background(0);
	stroke(200,0,90);
	strokeWeight(5);
	noFill();
	angleMode(DEGREES);
	var sec=second();
    // console.log(" sec p5js= "+sec);
	var min=minute();
	var hr=hour();
	s=map(sec,0,60,-90,269);
	m=map(min,0,60,-90,269);
	h=map(hr % 12,0,12,-90,269);
	arc(width/2,height/2,595/2,595/2,-90,s,WEBGL);
	stroke(0,200,90);
  strokeWeight(6);
	arc(width/2,height/2,571/2,571/2,-90,m,WEBGL);
	stroke(0,20,200);
  strokeWeight(8);
	arc(width/2,height/2,539/2,539/2,-90,h,WEBGL);



}
