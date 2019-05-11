var hourHand=    document.getElementById('hourHand');
var minuteHand=  document.getElementById('minuteHand');
var secondHand=  document.getElementById('secondHand');

function initClock(){
  var date=new Date();
  var hour=date.getHours() % 12;
  var minute=date.getMinutes();
  var second=date.getSeconds();
  // console.log("sec js= "+second);
  var hourdeg=(hour * 30) + ( (30/60) * minute);
  var minutedeg=(minute * 6) + ( (6/60) * second );
  var seconddeg=second * 6;
  hourHand.style.transform='rotate('+hourdeg+'deg)';
  minuteHand.style.transform='rotate('+minutedeg+'deg)';
  secondHand.style.transform='rotate('+seconddeg+'deg)';
  setTimeout(initClock,50);
}

initClock();
