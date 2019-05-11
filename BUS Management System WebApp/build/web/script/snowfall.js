var x=[];
var w=document.getElementById('forSnowfall').getBoundingClientRect();
console.log(w)
function setup() {
	// frameRate(70)
  var can=createCanvas(w.width-5, w.height-5);
  can.parent("forSnowfall");
	for(let i=0 ;i < width/2 ;i++){
		x[i]=new Snow();
	}
}
function draw() {
  background('rgba(40,40,40,0.040)');
  // background(0,0,0,50);
  // alpha(255)
	for(let i=0 ;i < width/2 ;i++){
		x[i].update();
    // background(0,0,0);
		x[i].hits();
	}
}

class Snow{
	constructor(){
		this.radius = random(1,3);
		this.x=random(0,width);
		this.y=random(0,-height);
		ellipse(this.x,this.y,this.radius);
	}
	update(){
		this.y=this.y+1;
		fill(255);
		noStroke();
		rotate(0.001);
		ellipse(this.x - random(-0.5,0.5),this.y,this.radius);
	}
	hits(){
		if(this.y > height){
			this.x =random(0,width);
			this.y=0;
			// console.log("hits")
		}
	}
}
