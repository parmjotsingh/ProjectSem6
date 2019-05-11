var r = [];
var inc = 0;
var img;

function setup() {
	var mCanvas = createCanvas(500,300);
  mCanvas.parent('sp');
	mCanvas.style('display', 'block');
	translate(0, 0);
}

function draw() {

	translate(50, 50);
	background(0);
	fill(255, 110, 0);
	ellipse(0, 0, 30, 30);
	strokeWeight(5);
	stroke(255, 50, 0);

	for (let i = 0; i < inc; i++) {
		r[i].update();
		r[i].hits();
		if (r[i].hits()) {
			r.splice(i, 1);
			inc--;
			console.log(inc);
		}
	}
	strokeWeight(1);
}

function mousePressed() {
	inc += 1;
	console.log(inc);
	r[inc - 1] = new Rockets();
	r[inc - 1].create();
}
let rocketLen = 20;
class Rockets {
	costructor() {
		this.xf = 0; // front x
		this.yf = 0; // front y
		this.xr = 0; //		rear x
		this.yr = 0; //  rear y
		this.speed = 3;
		this.vy = 0; // y velocity
		this.vx = 0; // x velocity
		this.vyr = 0; // y velocity
		this.vxr = 0; // x velocity
		// this.rocketLen=10;
	}
	create() {
		strokeWeight(10);
		stroke(255, 250, 250);
		this.xf = mouseX - 50; // front x
		this.yf = mouseY - 50; // front y
		this.xr = mouseX - 50; //		rear x
		this.yr = mouseY - (50 + rocketLen); //  rear y
		this.angle = atan2(this.yf, this.xf);
		this.speed = 3;
		this.vy = this.speed * sin(this.angle); // y velocity
		this.vx = this.speed * cos(this.angle); // x velocity
		this.angle = atan2(this.yr, this.xr);
		this.vyr = this.speed * sin(this.angle); // y velocity
		this.vxr = this.speed * cos(this.angle); // x velocity
		// line(this.xf, this.yf, this.xr, this.yr);
		line(this.xf -= this.vx, this.yf -= this.vy, this.xr -= this.vxr, this.yr -= this.vyr);
		strokeWeight(1);
	}
	update() {
		strokeWeight(10);
		stroke(255, 250, 250);
		this.angle = atan2(this.yf, this.xf);
		this.vy = this.speed * sin(this.angle); // y velocity
		this.vx = this.speed * cos(this.angle); // x velocity
		this.angle = atan2(this.yr, this.xr);
		this.vyr = this.speed * sin(this.angle); // y velocity
		this.vxr = this.speed * cos(this.angle); // x velocity
		line(this.xf -= this.vx, this.yf -= this.vy, this.xr -= this.vxr, (this.yr -= this.vyr));
		strokeWeight(1);
	}
	hits() {
		if (this.xf <= 30 && this.yf <= 30) {
			return true;
		} else {
			return false;
		}
	}
}
